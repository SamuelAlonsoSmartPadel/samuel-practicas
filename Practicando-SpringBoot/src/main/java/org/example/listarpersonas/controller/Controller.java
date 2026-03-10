package org.example.listarpersonas.controller;

import org.example.listarpersonas.model.Empleados;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@org.springframework.stereotype.Controller
public class Controller {

   /* @GetMapping("detalles_info2")
    public String info(Model model){
        Empleados e1 = new Empleados("Samuel", "Alonso", "Rua Castro Canseco", "Técnico de Aplicaciones Web", 21, 605618052, 1);
        model.addAttribute("Empleado", e1);
        return "detalles_info2";
    }*/

    @GetMapping("/InscribirEmpleado")
    public String inscribiEmpleado(){
        return "inscribir";
    }

    @GetMapping("detalles_info2")
    public String mostrarDetalles(@ModelAttribute("Empleado") Empleados empleado) {
        return "detalles_info2";
    }


}
