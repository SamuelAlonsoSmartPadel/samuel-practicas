package org.example.proyectozara_smartpadel.application.usecase;

import org.example.proyectozara_smartpadel.domain.model.Price;
import org.example.proyectozara_smartpadel.domain.port.out.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Optional;

@Component
public class GetPriceUseCase {
    private final PriceRepository priceRepository;

    public GetPriceUseCase(PriceRepository priceRepository) {
        this.priceRepository = priceRepository;
    }

    public Optional<Price> findPrice(LocalDateTime fecha, Long productId, Long brandId) {
        return priceRepository.findPrice(fecha, productId, brandId);
    }
}
