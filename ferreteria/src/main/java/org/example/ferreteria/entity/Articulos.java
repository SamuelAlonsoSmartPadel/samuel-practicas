package org.example.ferreteria.entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "articulos")
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@ToString

public class Articulos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long  id;

    @Column(name = "nombrearticulo")
    private String nombrearticulo;

    @Column(name = "precio")
    private double precio;

    @Column(name = "existencia")
    private Integer existencia;

}
