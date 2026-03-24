package org.example.proyectozara_smartpadel.infrastucture.adapter.out;

import org.example.proyectozara_smartpadel.domain.model.Price;
import org.example.proyectozara_smartpadel.domain.port.out.PriceRepository;
import org.example.proyectozara_smartpadel.infrastucture.persistence.PriceJpaEntity;
import org.example.proyectozara_smartpadel.infrastucture.persistence.PriceJpaRepository;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Component
public class PriceJpaAdapter implements PriceRepository {
     private PriceJpaRepository priceJpaRepository;

    public PriceJpaAdapter(PriceJpaRepository priceJpaRepository) {
        this.priceJpaRepository = priceJpaRepository;
    }

    @Override
    public Optional<Price> findPrice(LocalDateTime fecha, Long productId, Long brandId) {
        List<PriceJpaEntity> results = priceJpaRepository.findApplicablePrice(fecha, productId, brandId);

        if (results.isEmpty()) {
            return Optional.empty();
        }

        PriceJpaEntity entity = results.get(0);

        Price price = new Price(
                entity.getBrandId(),
                entity.getPriceList(),
                entity.getStartDate(),
                entity.getProductId(),
                entity.getPriority(),
                entity.getEndDate(),
                entity.getPrice(),
                entity.getCurr()
        );

        return Optional.of(price);
    }


}
