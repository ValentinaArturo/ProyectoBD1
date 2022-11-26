package com.example.demo.repository;
import com.example.demo.entity.TipoEncomienda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("tipoEncomiendaRepository")
public interface tipoEncomiendaRepository extends JpaRepository<TipoEncomienda, Serializable>{
}
