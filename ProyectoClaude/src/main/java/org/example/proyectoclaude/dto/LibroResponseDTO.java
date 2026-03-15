package org.example.proyectoclaude.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class LibroResponseDTO {
    private Long id;
    private String titulo;
    private String autor;
    private double precio;
}
