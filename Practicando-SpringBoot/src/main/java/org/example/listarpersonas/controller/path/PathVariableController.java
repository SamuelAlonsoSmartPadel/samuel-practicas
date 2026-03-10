package org.example.listarpersonas.controller.path;

import org.example.listarpersonas.controller.request.ParametroDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api/variable")
public class PathVariableController {

    @Value("${config.usuario}")
    private String usuario;

    @Value("${config.codigo}")
    private String codigo;

    @Value("${config.mensaje}")
    private String mensaje;

    @Value("${config.valores}")
    private String[] valores;

    @GetMapping("/pagina1/{mensjae}")
    public ParametroDTO pagina1(@PathVariable String mensjae){

        ParametroDTO parametro1 = new ParametroDTO();
        parametro1.setInformacion(mensjae);
        return parametro1;
    }

    @GetMapping("valores")
    public Map<String, Object> values(){
        Map<String, Object>json = new HashMap<>();
        json.put("Usuario", usuario);
        json.put("Codigo", codigo);
        json.put("Mensaje", mensaje);
        json.put("Valores", valores);

        return json;
    }

}
