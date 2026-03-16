package org.example.ferreteria.controller;
import org.example.ferreteria.dtos.ArticulosDTO;
import org.example.ferreteria.entity.Articulos;
import org.example.ferreteria.service.ArticuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/articulos")
public class ArticulosController {

    @Autowired
    private ArticuloService articuloService;

    @GetMapping
    public List<ArticulosDTO> listar(){
        return articuloService.Consulta();
    }
    @GetMapping("/{id}")
    public ArticulosDTO buscarPorId(@PathVariable Long id){
        return articuloService.buscarPorId(id);
    }
   @PostMapping()
    public ArticulosDTO insertarArticulo(@RequestBody ArticulosDTO articulosDTO){
        return articuloService.InsertaArticulo(articulosDTO);
    }

    @PutMapping("/{id}")
    public ArticulosDTO actualizarArticulo(@PathVariable Long id, @RequestBody ArticulosDTO articulosDTO){
        return articuloService.actualizarArticulo(id, articulosDTO);
    }

    @DeleteMapping("/{id}")
    public String eliminarArticulo(@PathVariable Long id){
        return articuloService.borrarArticulos(id);
    }



}
