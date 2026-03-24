package org.example.proyectozara_smartpadel.infrastucture.persistence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface PriceJpaRepository extends JpaRepository<PriceJpaEntity, Long> {
    @Query("SELECT p FROM PriceJpaEntity p WHERE p.productId = :productId AND p.brandId = :brandId AND :fecha BETWEEN p.startDate AND p.endDate ORDER BY p.priority DESC")
    List<PriceJpaEntity> findApplicablePrice(
            @Param("fecha") LocalDateTime fecha,
            @Param("productId") Long productId,
            @Param("brandId") Long brandId
    );
}
