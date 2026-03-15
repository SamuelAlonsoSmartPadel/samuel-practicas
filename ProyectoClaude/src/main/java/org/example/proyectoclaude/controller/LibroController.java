package org.example.proyectoclaude.controller;

import lombok.AllArgsConstructor;
import org.example.proyectoclaude.dto.LibroRequestDTO;
import org.example.proyectoclaude.dto.LibroResponseDTO;
import org.example.proyectoclaude.service.LibroService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/api/libros")
public class LibroController {
    private LibroService libroService;

    @GetMapping("/mostrarLibros")
    public List<LibroResponseDTO> listaLibros(){
        return libroService.listarLibros();
    }

    @GetMapping("/mostrarLibro/{id}")
    public LibroResponseDTO obtenerPorid(@PathVariable Long id){
        return libroService.obtenerLibro(id);
    }

    @PutMapping("/actualizarLibro/{id}")
    public LibroResponseDTO actualizarLibro(@PathVariable Long id, @RequestBody LibroRequestDTO libroRequestDTO){
        return libroService.actualizarLibro(id, libroRequestDTO);
    }

    @PostMapping("/crearLibro")
    public ResponseEntity<LibroResponseDTO> crearLibro(@RequestBody LibroRequestDTO libroRequestDTO){
        return ResponseEntity.status(201).body(libroService.crearLibro(libroRequestDTO));
    }

    @DeleteMapping("/eliminarLibro/{id}")
    public ResponseEntity<Void> eliminarLibro(@PathVariable Long id){
        libroService.eliminarLibro(id);
        return ResponseEntity.noContent().build();
    }


}
