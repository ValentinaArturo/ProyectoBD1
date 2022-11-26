package com.example.demo.entity;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Rol")
public class Rol {
    @Id
    @Column(name = "id_rol")
    private int idRol;

    @Column(name = "descrpcion")
    private int descrpcion;

    @Column(name = "permiso_insertar")
    private int permisoInsertar;

    @Column(name = "permiso_actualizar")
    private int permisoActualizar;

    @Column(name = "permiso_eliminar")
    private int permisoEliminar;

    @Column(name = "permiso_consultar")
    private int permisoConsultar;

    @OneToMany(mappedBy = "idRol")
    private List<RolUsuario>rolUsuarioList;

    @OneToMany(mappedBy = "idRol")
    private List<RolUsuarioMenu>rolUsuarioMenuList;

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public int getDescrpcion() {
        return descrpcion;
    }

    public void setDescrpcion(int descrpcion) {
        this.descrpcion = descrpcion;
    }

    public int getPermisoInsertar() {
        return permisoInsertar;
    }

    public void setPermisoInsertar(int permisoInsertar) {
        this.permisoInsertar = permisoInsertar;
    }

    public int getPermisoActualizar() {
        return permisoActualizar;
    }

    public void setPermisoActualizar(int permisoActualizar) {
        this.permisoActualizar = permisoActualizar;
    }

    public int getPermisoEliminar() {
        return permisoEliminar;
    }

    public void setPermisoEliminar(int permisoEliminar) {
        this.permisoEliminar = permisoEliminar;
    }

    public int getPermisoConsultar() {
        return permisoConsultar;
    }

    public void setPermisoConsultar(int permisoConsultar) {
        this.permisoConsultar = permisoConsultar;
    }

    public List<RolUsuario> getRolUsuarioList() {
        return rolUsuarioList;
    }

    public void setRolUsuarioList(List<RolUsuario> rolUsuarioList) {
        this.rolUsuarioList = rolUsuarioList;
    }

    public List<RolUsuarioMenu> getRolUsuarioMenuList() {
        return rolUsuarioMenuList;
    }

    public void setRolUsuarioMenuList(List<RolUsuarioMenu> rolUsuarioMenuList) {
        this.rolUsuarioMenuList = rolUsuarioMenuList;
    }
}
