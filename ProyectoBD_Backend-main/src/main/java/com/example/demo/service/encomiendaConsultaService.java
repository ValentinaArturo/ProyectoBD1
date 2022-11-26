package com.example.demo.service;
import com.example.demo.entity.*;

import com.example.demo.repository.encomiendaRepository;
import com.example.demo.repository.rutaRepository;
import com.example.demo.repository.tarifaEncomiendaRepository;
import com.example.demo.repository.tipoEncomiendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/encomiendas")
@CrossOrigin
public class encomiendaConsultaService {
    @Autowired
    encomiendaRepository encomiendaRepository;

    @Autowired
    rutaRepository rutaRepository;

    @Autowired
    tarifaEncomiendaRepository tarifaEncomiendaRepository;

    @Autowired
    tipoEncomiendaRepository tipoEncomiendaRepository;

    @GetMapping(path = "/consulta")
    private ArrayList encomiendas(){
        ArrayList algo = new ArrayList<>();

        List<Encomienda> encomienda = encomiendaRepository.findAll();
        List<Ruta> ruta = rutaRepository.findAll();
        List<TarifaEncomienda> tarifaEncomienda = tarifaEncomiendaRepository.findAll();
        List<TipoEncomienda> tipoEncomienda = tipoEncomiendaRepository.findAll();
        /*algo.add(encomienda);
        algo.add(Ruta);*/
        algo.add(tarifaEncomienda);
        /*algo.add(TipoEncomienda);*/
        return algo;
    }

    @GetMapping (path = "/consultas/{id}")
    private List<Encomienda> encomiedas(@PathVariable ("id") int id ){
        return encomiendaRepository.findByIdPersona(id);
    }
}
