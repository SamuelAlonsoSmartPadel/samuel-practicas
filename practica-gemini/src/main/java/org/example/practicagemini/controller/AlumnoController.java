package org.example.practicagemini.controller;

import org.example.practicagemini.model.Alumno;
import org.example.practicagemini.service.AlumnoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alumnos")
public class AlumnoController {
    private AlumnoService alumnoService;

    public AlumnoController(AlumnoService alumnoService) {
        this.alumnoService = alumnoService;
    }

    @GetMapping("/{id}")
    public Alumno obtenerPorId(@PathVariable long id){
        return alumnoService.buscarPorId(id);
    }

    @GetMapping
    public List<Alumno> listarAlumnos(){
        return alumnoService.leerAlumnos();
    }

    @DeleteMapping
    public void eliminarAlumnos(){
         alumnoService.eliminarAlumnos();
    }

    @GetMapping("/aprobados")
    public Alumno buscarAlumnosAprobados(int nota){
        return alumnoService.obtenerAprobados(nota);
    }




}
