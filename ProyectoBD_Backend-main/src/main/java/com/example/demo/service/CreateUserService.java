package com.example.demo.service;

import com.example.demo.entity.Persona;

import com.example.demo.entity.PersonaUsuario;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.repository.personaRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/crear")
@CrossOrigin
public class CreateUserService {
    @Autowired
    personaRepository personaRepository;

    @Autowired
    UserRepository userRepository;

    @PostMapping(path = "/persona")
    private Persona crear(@RequestBody PersonaUsuario persona){
        

        int valor = guardarUsuario(persona.getClave());
        Persona person = new Persona();
        person.setIdPersona(valor);
        person.setIdDocumentoIdentificacion(persona.getIdDocumentoIdentificacion());
        person.setNit(persona.getNit());
        person.setTelefono(persona.getTelefono());
        person.setApellido(persona.getApellido());
        person.setNombre(persona.getNombre());
        person.setDireccion(persona.getDireccion());
        person.setIdUsuario(valor);
        person.setCorreo(persona.getCorreo());
        person.setIdTipoPersona(persona.getIdTipoPersona());
        System.out.println(person);

         return  personaRepository.save(person);
    }

    private int guardarUsuario (String contrasenia){
        User usuario = new User();
        int id = userRepository.findAll().size();
        id++;
        System.out.println("id -> "+id);
        System.out.println("contraseña -> "+contrasenia);
        usuario.setIdUsuario(id);
        /*usuario.setContrasenia(contrasenia);*/
        usuario.setContrasenia(new MD5().encripta(contrasenia));
        userRepository.save(usuario);
        return id;
    }
}
