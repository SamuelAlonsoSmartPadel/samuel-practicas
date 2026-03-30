package org.example.miniapp_alumnos.application.service;

import lombok.AllArgsConstructor;
import org.example.miniapp_alumnos.domain.model.Alumno;
import org.example.miniapp_alumnos.domain.port.AlumnoRepositoryPort;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CrearAlumnoService {
    private final AlumnoRepositoryPort alumnoRepositoryPort;


    public void ejecutar(String nombre, String email){
        // 1. comprobar si existe
        if(alumnoRepositoryPort.buscarPorEmail(email).isPresent()){
            System.out.println("Error: ya existe un alumno con ese email");
            return;
        }
        // 2. crear alumno
        Alumno alumno = new Alumno(nombre, email);

        // 3. guardar
        alumnoRepositoryPort.guardar(alumno);

    }

    
}
