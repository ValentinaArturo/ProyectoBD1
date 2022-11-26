package com.example.demo.repository;

import com.example.demo.entity.RolUsuarioMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository("rolUsuarioMenuRepository")
public interface rolUsuarioMenuRepository extends JpaRepository<RolUsuarioMenu, Serializable> {
    List<RolUsuarioMenu> findByIdUsuario(int idUsuario);
}
