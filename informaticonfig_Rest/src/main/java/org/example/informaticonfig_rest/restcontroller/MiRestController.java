package org.example.informaticonfig_rest.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class MiRestController {

    @GetMapping("/saludar")
    public String devolverSaludo(){
        return "Hola Buenas";
    }
}
