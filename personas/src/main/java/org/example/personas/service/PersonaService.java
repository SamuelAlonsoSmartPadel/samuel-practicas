package org.example.personas.service;

import org.example.personas.model.Persona;
import org.example.personas.repository.PersonaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService {

    private final PersonaRepository personaRepository;

    public PersonaService(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    public List<Persona> obtenerPersonas(){
        return personaRepository.findAll();
    }

    public Optional<Persona> buscarPorNombre(String nombre){
        return personaRepository.findByNombreIgnoreCase(nombre);
    }

    public Persona guardarPersona(Persona persona){
        return personaRepository.save(persona);
    }
}
