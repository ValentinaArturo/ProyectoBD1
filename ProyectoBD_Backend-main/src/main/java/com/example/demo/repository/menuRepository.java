package com.example.demo.repository;

import com.example.demo.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("menuRepository")
public interface menuRepository extends JpaRepository<Menu, Serializable> {
}
