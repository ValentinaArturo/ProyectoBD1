package com.example.demo.repository;
import com.example.demo.entity.Boleto;
import org.springframework.data.jpa.repository.JpaRepository;



import java.io.Serializable;

public interface boletoRepository extends JpaRepository<Boleto, Serializable>{
}
