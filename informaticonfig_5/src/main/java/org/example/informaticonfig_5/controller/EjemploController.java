package org.example.informaticonfig_5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EjemploController {

    @GetMapping("/")
    public String inicio() {
        return "index";
    }

}