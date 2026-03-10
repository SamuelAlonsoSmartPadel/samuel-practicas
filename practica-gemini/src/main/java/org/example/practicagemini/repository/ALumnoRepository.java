package org.example.practicagemini.repository;

import org.example.practicagemini.model.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ALumnoRepository extends JpaRepository<Alumno, Long> {
 @Query("SELECT a FROM Alumno a  WHERE a.nota = :nota")
    Alumno findByNota(@Param("nota") int nota);
}
