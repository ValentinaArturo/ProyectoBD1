package com.example.demo.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "usuario")
public class User implements Serializable {
    private static final long serialVersionUID = 6176078272901182640L;

	@Id
/*
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
*/

    @Column(name = "id_usuario")
    private int idUsuario;

    @Column(name = "clave")
    private String clave;

    @OneToMany(mappedBy = "idUsuario")
    private List<RolUsuario>rolUsuarioList;

    @OneToMany(mappedBy = "idUsuario")
    private List<RolUsuarioMenu>rolUsuarioMenuList;

    @OneToMany(mappedBy = "idUsuario")
    private List<Persona>personaList;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getContrasenia() {
        return clave;
    }

    public void setContrasenia(String clave) {
        this.clave = clave;
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

    public List<Persona> getPersonaList() {
        return personaList;
    }

    public void setPersonaList(List<Persona> personaList) {
        this.personaList = personaList;
    }
}
