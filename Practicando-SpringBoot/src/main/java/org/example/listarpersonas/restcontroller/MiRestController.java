package org.example.listarpersonas.restcontroller;

import org.example.listarpersonas.model.Empleados;
import org.example.listarpersonas.model.dto.ClaseDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


//Aqui aplicando las cosas del la lista de informaticonfig, aqui practicare la utilidad de diferentes endpoints

@RestController
@RequestMapping("/api")
public class MiRestController {

    @GetMapping("lista")
    public List<String> listarPersonas() {
        List<String> personas = new ArrayList<>();
        personas.add("Samuel");
        personas.add("Angela");
        personas.add("Cristian");

        return personas;
    }

    @GetMapping("mapa")
    public Map<String, Integer> listarCertificados() {
        Map<String, Integer> personas = new HashMap<>();
        personas.put("Samuel", 20);
        personas.put("Ángela", 19);
        return personas;
    }

    @GetMapping("empleados")
    public Map<String, Object> detalles_info2(){
        Empleados e1 = new Empleados("Samuel", "Alonso", "Rua Castro Canseco", "Técnico de Aplicaciones Web", 21, 605618052, 1);
        Map<String, Object> empleados = new HashMap<>();
        empleados.put("Empleado 1: ", e1);
        return empleados;
    }

    //Ejemplo con DTO
    @GetMapping("/dto")
    public ClaseDTO detalles_info(){
        ClaseDTO usuario1 = new ClaseDTO();
        usuario1.setTitulo("Administrador");
        usuario1.setUsuario("Informaticonfig");
        return usuario1;
    }




}
