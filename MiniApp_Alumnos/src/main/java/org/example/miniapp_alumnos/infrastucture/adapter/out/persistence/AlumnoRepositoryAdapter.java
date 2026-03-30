package org.example.miniapp_alumnos.infrastucture.adapter.out.persistence;

import lombok.AllArgsConstructor;
import org.example.miniapp_alumnos.domain.model.Alumno;
import org.example.miniapp_alumnos.domain.port.AlumnoRepositoryPort;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@AllArgsConstructor
public class AlumnoRepositoryAdapter implements AlumnoRepositoryPort {
    private final SpringDataAlumnoRepository springDataAlumnoRepository;


    @Override
    public void guardar(Alumno alumno) {
        // 1. traducir a entity
        AlumnoJpaEntity entity =
                new AlumnoJpaEntity(alumno.getNombre(), alumno.getEmail());

        // 2. guardar en BD
        springDataAlumnoRepository.save(entity);

    }

    @Override
    public Optional<Alumno> buscarPorEmail(String emial) {
        return springDataAlumnoRepository.findByEmail(emial)
                .map(e -> new Alumno(e.getNombre(), e.getEmail()));
    }

    @Override
    public List<Alumno> listarTodos() {
        return springDataAlumnoRepository.findAll()
                .stream()
                .map(e -> new Alumno(e.getNombre(), e.getEmail()))
                .toList();
    }

}
