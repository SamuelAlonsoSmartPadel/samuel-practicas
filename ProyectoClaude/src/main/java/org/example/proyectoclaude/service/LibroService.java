package org.example.proyectoclaude.service;

import lombok.AllArgsConstructor;
import org.example.proyectoclaude.dto.LibroRequestDTO;
import org.example.proyectoclaude.dto.LibroResponseDTO;
import org.example.proyectoclaude.model.Libro;
import org.example.proyectoclaude.repository.LibroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class LibroService {
    private LibroRepository libroRepository;

    public List<LibroResponseDTO> listarLibros(){
        return libroRepository.findAll()
                                .stream()
                                .map(libro -> {
                                    LibroResponseDTO response = new LibroResponseDTO();
                                    response.setId(libro.getId());
                                    response.setTitulo(libro.getTitulo());
                                    response.setAutor(libro.getAutor());
                                    response.setPrecio(libro.getPrecio());
                                    return response;
                                })
                                .toList();

    }

    public LibroResponseDTO obtenerLibro(Long id) {
        Libro libro = libroRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Libro con id " + id + " no encontrado"));

        LibroResponseDTO response = new LibroResponseDTO();
        response.setId(libro.getId());
        response.setTitulo(libro.getTitulo());
        response.setAutor(libro.getAutor());
        response.setPrecio(libro.getPrecio());

        return response;
    }

    public LibroResponseDTO crearLibro(LibroRequestDTO libroRequestDTO){
        Libro libro = new Libro();
        libro.setAutor(libroRequestDTO.getAutor());
        libro.setTitulo(libroRequestDTO.getTitulo());
        libro.setPrecio(libroRequestDTO.getPrecio());

        Libro libro1 = libroRepository.save(libro);

        LibroResponseDTO libroResponseDTO = new LibroResponseDTO();
        libroResponseDTO.setId(libro1.getId());
        libroResponseDTO.setTitulo(libro1.getTitulo());
        libroResponseDTO.setAutor(libro1.getAutor());
        libroResponseDTO.setPrecio(libro1.getPrecio());

        return libroResponseDTO;

    }

    public void eliminarLibro(Long id){
        libroRepository.deleteById(id);
    }

        public LibroResponseDTO actualizarLibro(Long id,  LibroRequestDTO libroRequestDTO){
            Libro libro = libroRepository.findById(id)
                                         .orElseThrow(() -> new RuntimeException("no se ha encontrado el libro"));

            libro.setAutor(libroRequestDTO.getAutor());
            libro.setPrecio(libroRequestDTO.getPrecio());
            libro.setTitulo(libroRequestDTO.getTitulo());

            Libro guradar = libroRepository.save(libro);

            LibroResponseDTO libroResponseDTO = new LibroResponseDTO();
            libroResponseDTO.setId(guradar.getId());
            libroResponseDTO.setTitulo(guradar.getTitulo());
            libroResponseDTO.setAutor(guradar.getAutor());
            libroResponseDTO.setPrecio(guradar.getPrecio());

            return libroResponseDTO;

        }
}
