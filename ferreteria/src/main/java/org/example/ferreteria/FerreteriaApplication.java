package org.example.ferreteria;

import org.example.ferreteria.entity.Articulos;
import org.example.ferreteria.repository.Repo_Articulos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class FerreteriaApplication implements CommandLineRunner {

    @Autowired
    private Repo_Articulos repoArticulos;
    public static void main(String[] args) {
        SpringApplication.run(FerreteriaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Aplicación iniciada correctamente");
        List<Articulos> articulos = repoArticulos.findAll();
        articulos.stream().forEach(System.out::println);
    }
}

