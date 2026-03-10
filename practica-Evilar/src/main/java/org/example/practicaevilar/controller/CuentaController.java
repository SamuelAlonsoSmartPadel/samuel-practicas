package org.example.practicaevilar.controller;

import org.example.practicaevilar.model.Cuenta;
import org.example.practicaevilar.service.CuentaService;
import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/cuenta")
public class CuentaController {
    private final CuentaService cuentaService;

    public CuentaController(CuentaService cuentaService) {
        this.cuentaService = cuentaService;
    }


    @PostMapping
    public Cuenta save(@RequestBody Cuenta cuenta){
        return cuentaService.save(cuenta);
    }

    @GetMapping
    public List<Cuenta> getAllAccounts(){
        return cuentaService.getAllAccounts();
    }

    @GetMapping("/{id}")
    public Cuenta getAccountById(@PathVariable Long id){
        return cuentaService.getAccountById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteAccount(@PathVariable Long id){
         cuentaService.deleteAccount(id);
    }

    @DeleteMapping
    public void deleteAllAccounts(){
        cuentaService.deleteAll();
    }

    @PutMapping
    public Cuenta updateAccount(@RequestBody Cuenta cuenta){
       return cuentaService.updateAccount(cuenta);
    }
}

