package com.example.demo.repository;
import com.example.demo.entity.Encomienda;
import org.springframework.data.jpa.repository.JpaRepository;



import java.io.Serializable;
import java.util.List;


public interface encomiendaRepository extends JpaRepository<Encomienda, Serializable> {
    List<Encomienda> findByIdPersona(int id);
}
