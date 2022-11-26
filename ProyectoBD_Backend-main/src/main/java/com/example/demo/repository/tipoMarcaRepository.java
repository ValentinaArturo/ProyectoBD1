package com.example.demo.repository;
import com.example.demo.entity.TipoMarca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("tipoMarcaRepository")
public interface tipoMarcaRepository extends JpaRepository<TipoMarca, Serializable>{
}
