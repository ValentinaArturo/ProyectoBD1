package com.example.demo.service;

import com.example.demo.entity.*;

import com.example.demo.repository.boletoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/crear")
@CrossOrigin
public class crearBoletoService {
    @Autowired
    boletoRepository boletoRepository;

    @PostMapping(path = "/boleto")
    private Boleto crear(@RequestBody Boleto boleto){
        int id = boletoRepository.findAll().size();
        Optional<Boleto> boleito = boletoRepository.findById(id);
        int codigo = boleito.get().getNumero_Boleto();
        id = boleito.get().getIdBoleto();
        id++;
        codigo++;
        boleto.setIdBoleto(id);
        boleto.setNumero_Boleto(codigo);
        return boletoRepository.save(boleto);
    }
}
