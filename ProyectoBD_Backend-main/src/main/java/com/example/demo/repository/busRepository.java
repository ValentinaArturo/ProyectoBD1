package com.example.demo.repository;
import com.example.demo.entity.Bus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("busRepository")
public interface busRepository extends JpaRepository<Bus, Serializable>{
}
