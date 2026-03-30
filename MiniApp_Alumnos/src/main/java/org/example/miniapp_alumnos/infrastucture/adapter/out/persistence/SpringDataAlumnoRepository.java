package org.example.miniapp_alumnos.infrastucture.adapter.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SpringDataAlumnoRepository extends JpaRepository<AlumnoJpaEntity, Long> {
 Optional<AlumnoJpaEntity> findByEmail(String email);

}
