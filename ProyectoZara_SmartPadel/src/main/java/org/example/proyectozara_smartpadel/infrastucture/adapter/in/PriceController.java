package org.example.proyectozara_smartpadel.infrastucture.adapter.in;

import org.example.proyectozara_smartpadel.application.usecase.GetPriceUseCase;
import org.example.proyectozara_smartpadel.domain.model.Price;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Optional;

@RestController
@RequestMapping("api/tienda")
public class PriceController {
    private GetPriceUseCase getPriceUseCase;

    public PriceController(GetPriceUseCase getPriceUseCase) {
        this.getPriceUseCase = getPriceUseCase;
    }

    @GetMapping("/prices")
    public Optional<Price> getPrice(@RequestParam LocalDateTime fecha, @RequestParam Long productId, @RequestParam Long brandId){
        return getPriceUseCase.findPrice(fecha, productId, brandId);
    }


}
