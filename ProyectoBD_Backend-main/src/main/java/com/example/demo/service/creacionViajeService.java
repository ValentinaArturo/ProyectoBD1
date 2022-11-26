package com.example.demo.service;
import com.example.demo.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.repository.viajeRepository;


@RestController
@RequestMapping("/crear")
@CrossOrigin
public class creacionViajeService {


    @Autowired
    viajeRepository viajeRepository;



    @PostMapping(path = "/viaje")
    private Viaje crear(@RequestBody Viaje viaje){
        int id = viajeRepository.findAll().size();
        id++;
        viaje.setIdReservacion(id);
        return viajeRepository.save(viaje);
    }

}
