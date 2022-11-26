package com.example.demo.repository;
import com.example.demo.entity.TipoColor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("tipoColorRepository")
public interface tipoColorRepository extends JpaRepository<TipoColor, Serializable>{
}
