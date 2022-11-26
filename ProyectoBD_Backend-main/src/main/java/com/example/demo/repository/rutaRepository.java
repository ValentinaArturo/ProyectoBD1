package com.example.demo.repository;
import com.example.demo.entity.Ruta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("rutaRepository")
public interface rutaRepository extends JpaRepository<Ruta, Serializable>{
}
