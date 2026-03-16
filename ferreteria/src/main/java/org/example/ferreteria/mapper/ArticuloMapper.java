package org.example.ferreteria.mapper;

import org.example.ferreteria.dtos.ArticulosDTO;
import org.example.ferreteria.entity.Articulos;

public class ArticuloMapper {
    public static ArticulosDTO toDTO(Articulos articulo){
        return new ArticulosDTO(articulo.getId(),
                                articulo.getNombrearticulo(),
                                articulo.getPrecio(),
                                articulo.getExistencia());
    }

    public static Articulos toEntity(ArticulosDTO articulosDTO){
        return new Articulos(articulosDTO.getId(),
                articulosDTO.getNombrearticulo(),
                articulosDTO.getPrecio(),
                articulosDTO.getExistencia());
    }


}
