package com.example.demo.service;
import com.example.demo.entity.*;
import com.example.demo.repository.encomiendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/crear")
@CrossOrigin
public class creacionEncomiendaService {
    /*@Autowired
    tarifaEncomiendaRepository tarifaEncomiendaRepository;*/

    @Autowired
    encomiendaRepository encomiendaRepository;



    @PostMapping(path = "/encomienda")
    private Encomienda crear(@RequestBody Encomienda encomienda){
        int id = encomiendaRepository.findAll().size();
        id++;
        encomienda.setIdEncomienda(id);
        return encomiendaRepository.save(encomienda);
    }

}
