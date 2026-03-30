package org.example.miniapp_alumnos.infrastucture.adapter.in.web;

import lombok.AllArgsConstructor;
import org.example.miniapp_alumnos.application.service.CrearAlumnoService;
import org.example.miniapp_alumnos.infrastucture.adapter.in.web.dto.CrearAlumnoRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
@AllArgsConstructor
public class AlumnoController {
    private final CrearAlumnoService crearAlumnoService;



    @PostMapping
    public String crearAlumno(@RequestBody CrearAlumnoRequest request){
        crearAlumnoService.ejecutar(request.getNombre(), request.getEmail());
        return "Alumno creado";
    }

}
