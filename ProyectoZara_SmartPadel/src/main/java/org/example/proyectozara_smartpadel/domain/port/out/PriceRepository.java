package org.example.proyectozara_smartpadel.domain.port.out;

import org.example.proyectozara_smartpadel.domain.model.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Optional;

@Component
public interface PriceRepository {
    Optional<Price> findPrice(LocalDateTime fecha, Long productId, Long brandId);
}
