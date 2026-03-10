package org.example.personas.controller;
import org.example.personas.model.Persona;
import org.example.personas.service.PersonaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonaController {
    private final PersonaService personaService;

    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @GetMapping("/personas")
    public List<Persona> obtenerPersonas(){
        return personaService.obtenerPersonas();
    }

    @GetMapping("/personas/{nombre}")
    public Optional<Persona> buscarPersona(@PathVariable String nombre){
        return personaService.buscarPorNombre(nombre);
    }

    @PostMapping("/persona")
    public Persona crearPersona(@RequestBody Persona persona){
        return personaService.guardarPersona(persona);
    }
}
