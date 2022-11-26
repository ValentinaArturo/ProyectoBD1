package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Viaje;

import java.io.Serializable;
import java.util.List;


public interface viajeRepository extends JpaRepository<Viaje, Serializable> {
    List<Viaje> findByIdReservacion(int id);
}
