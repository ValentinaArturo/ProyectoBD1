package com.example.demo.repository;
import com.example.demo.entity.TarifaEncomienda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("tarifaEncomiendaRepository")
public interface tarifaEncomiendaRepository extends JpaRepository<TarifaEncomienda, Serializable>{
}
