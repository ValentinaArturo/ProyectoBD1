package com.example.demo.service;

import com.example.demo.entity.*;
import com.example.demo.repository.UserRepository;
import com.example.demo.repository.rolUsuarioRepository;
import com.example.demo.repository.rolUsuarioMenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.repository.menuRepository;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/login")
@CrossOrigin
public class LoginService {

    @Autowired
    UserRepository userRepository;

    @Autowired
     menuRepository menuRepository;

    @Autowired
    rolUsuarioRepository rolUsuarioRepository;

    @Autowired
    rolUsuarioMenuRepository rolUsuarioMenuRepository;



    //Servicio que devuelve un objeto del user si lo encuentra si es en blanco o null es porque no pasa la validacion
    @PostMapping(path = "/user")
    private ArrayList loginTeacher(@RequestBody User credentials) {
        ArrayList usuario =new ArrayList<>();
        usuario.add(user(credentials));
        return usuario;
    }

    private ArrayList user(User credentials){
        ArrayList roles = new ArrayList<>();
        int longitud = userRepository.findByIdUsuarioAndClave(credentials.getIdUsuario(),credentials.getContrasenia()).size();
        if(longitud>0){
            Optional<RolUsuario> rolUsuario = rolUsuarioRepository.findById(credentials.getIdUsuario());
            List<RolUsuarioMenu> rolUsuarioMenu = rolUsuarioMenuRepository.findByIdUsuario(credentials.getIdUsuario());
            Optional<User> usuario= userRepository.findById(credentials.getIdUsuario());
            roles.add(usuario);
            roles.add(rolUsuario);
            roles.add(rolUsuarioMenu);
            return roles;
        }else{
            User  usario= new User();
            usario.setIdUsuario(0);
            RolUsuarioMenu rolis = new RolUsuarioMenu();
            roles.add(usario);
            roles.add(rolis);
            return roles;
        }
    }
}
