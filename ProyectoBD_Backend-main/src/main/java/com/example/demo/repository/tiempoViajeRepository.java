package com.example.demo.repository;
import com.example.demo.entity.TiempoViaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("tiempoViajeRepository")
public interface tiempoViajeRepository extends JpaRepository<TiempoViaje, Serializable>{
}
