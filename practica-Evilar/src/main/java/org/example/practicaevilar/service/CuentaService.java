package org.example.practicaevilar.service;

import org.example.practicaevilar.model.Cuenta;
import org.example.practicaevilar.repository.CuentaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CuentaService {
    private final CuentaRepository cuentaRepository;

    public CuentaService(CuentaRepository cuentaRepository) {
        this.cuentaRepository = cuentaRepository;
    }

    public Cuenta save(Cuenta cuenta){
        return cuentaRepository.save(cuenta);
    }

    public List<Cuenta> getAllAccounts(){
        return cuentaRepository.findAll();
    }

    public Cuenta getAccountById(Long id){
        Optional<Cuenta> getAccount = cuentaRepository.findById(id);
        return getAccount.get();
    }

    public void deleteAccount(Long id){
        cuentaRepository.deleteById(id);
    }

    public void deleteAll(){
        cuentaRepository.deleteAll();
    }

    public Cuenta updateAccount(Cuenta cuenta){
         return cuentaRepository.save(cuenta);
    }




}
