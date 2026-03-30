package org.example.miniapp_alumnos.infrastucture.adapter.out.persistence;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "alumnos")
@NoArgsConstructor @AllArgsConstructor
@Getter
public class AlumnoJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String email;

    public AlumnoJpaEntity(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }
}
