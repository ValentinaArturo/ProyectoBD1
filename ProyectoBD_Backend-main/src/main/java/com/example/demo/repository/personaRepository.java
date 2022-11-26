package com.example.demo.repository;
import com.example.demo.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("personaRepository")
public interface personaRepository extends JpaRepository<Persona, Serializable>{
}
