package org.example.ferreteria.service;

import org.example.ferreteria.dtos.ArticulosDTO;
import org.example.ferreteria.entity.Articulos;
import org.example.ferreteria.mapper.ArticuloMapper;
import org.example.ferreteria.repository.Repo_Articulos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ArticuloService {
    @Autowired
   private Repo_Articulos repoArticulos;

    public List<ArticulosDTO> Consulta(){
        return  repoArticulos.findAll().stream().map(ArticuloMapper::toDTO)
                .collect(Collectors.toList());
    }

    public ArticulosDTO InsertaArticulo(ArticulosDTO dto){
        Articulos articulos = ArticuloMapper.toEntity(dto);
        Articulos guardado = repoArticulos.save(articulos);
        return ArticuloMapper.toDTO(guardado);
    }

    public ArticulosDTO buscarPorId(Long id){
        Articulos articulos = repoArticulos.findById(id)
                .orElseThrow(() -> new RuntimeException("Articulo con id " + id + " no encontrado"));

        return ArticuloMapper.toDTO(articulos);
    }

    public ArticulosDTO actualizarArticulo(Long id, ArticulosDTO dto){
        Optional<Articulos> existe = repoArticulos.findById(id);

        if (existe.isPresent()){
            Articulos articulo = existe.get();
            articulo.setId(dto.getId());
            articulo.setNombrearticulo(dto.getNombrearticulo());
            articulo.setPrecio(dto.getPrecio());
            articulo.setExistencia(dto.getExistencia());

            Articulos guardar = repoArticulos.save(articulo);
            return ArticuloMapper.toDTO(guardar);

        }else{
            throw new RuntimeException("Articulo no encontrado con id: " + id);
        }

    }

    public String borrarArticulos(@PathVariable Long id){
        if(repoArticulos.existsById(id)){
            repoArticulos.deleteById(id);
            return "Artículo eliminado correctamente";
        }else{
            return "No se ha encontrado el articulo con id " + id;
        }
    }
}
