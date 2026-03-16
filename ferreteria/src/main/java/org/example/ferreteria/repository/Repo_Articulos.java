package org.example.ferreteria.repository;
import org.example.ferreteria.entity.Articulos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo_Articulos extends JpaRepository<Articulos, Long> {

}
