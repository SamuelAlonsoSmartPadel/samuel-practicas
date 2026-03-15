package org.example.proyectoclaude.dto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
public class LibroRequestDTO {
    @NotBlank(message = "El titulo no puede estar vacio")
    private String titulo;

    @NotNull
    @NotBlank(message = "El libro debet tener como mínimo un autor")
    private String autor;

    @Positive(message = "El precio del libro debe ser mayor o igual que a 0")
    private double precio;

}
