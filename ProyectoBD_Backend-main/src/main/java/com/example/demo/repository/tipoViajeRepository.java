package com.example.demo.repository;
import com.example.demo.entity.TipoViaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("tipoViajeRepository")
public interface tipoViajeRepository extends JpaRepository<TipoViaje, Serializable>{
}
