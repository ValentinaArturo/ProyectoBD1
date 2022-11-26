package com.example.demo.service;
import com.example.demo.entity.*;
import com.example.demo.repository.encomiendaRepository;
import com.example.demo.repository.boletoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/consulta")
@CrossOrigin
public class consultaBoletoService {
    @Autowired
    boletoRepository boletoRepository;

    @GetMapping(path = "/boletos")
    private List<Boleto> boletos(){;
        return boletoRepository.findAll();
    }
}
