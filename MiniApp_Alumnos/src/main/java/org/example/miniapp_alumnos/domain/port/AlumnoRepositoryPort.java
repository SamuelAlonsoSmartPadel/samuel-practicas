package org.example.miniapp_alumnos.domain.port;

import org.example.miniapp_alumnos.domain.model.Alumno;

import java.util.List;
import java.util.Optional;


public interface AlumnoRepositoryPort {
    void guardar(Alumno alumno);
    Optional<Alumno> buscarPorEmail(String emial);
    List<Alumno> listarTodos();

}
