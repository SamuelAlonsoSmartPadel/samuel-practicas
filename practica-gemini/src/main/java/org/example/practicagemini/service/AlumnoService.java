package org.example.practicagemini.service;

import org.example.practicagemini.model.Alumno;
import org.example.practicagemini.repository.ALumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlumnoService {
    @Autowired
    private ALumnoRepository aLumnoRepository;

    public AlumnoService(ALumnoRepository aLumnoRepository) {
        this.aLumnoRepository = aLumnoRepository;
    }

    public Alumno insertar(Alumno alumno){
        return aLumnoRepository.save(alumno);
    }

    public List<Alumno> leerAlumnos(){
        return aLumnoRepository.findAll();
    }

    public Alumno buscarPorId(long id){
        Optional<Alumno> buscar = aLumnoRepository.findById(id);
        return buscar.get();
    }

    public void eliminarAlumnos(){
        aLumnoRepository.deleteAll();
    }

    public Alumno obtenerAprobados(int nota){
            Alumno alumno = aLumnoRepository.findByNota(nota);
            if(alumno.getNota() >= 5) {
                return alumno;
            }
            return null;
        }

    }



