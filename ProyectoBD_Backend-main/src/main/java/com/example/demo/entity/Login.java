package com.example.demo.entity;
import javax.persistence.*;

@Entity
@Table(name = "Login")
public class Login {
    @Id
    @Column(name = "id_usuario")
    private int idUsuario;

    @Column(name = "id_rol")
    private int idRol;

    @Column(name = "id_menu")
    private int idMenu;

    @Column(name = "opcion_menu")
    private int opcionMenu;

    @Column(name = "pagina")
    private int pagina;

    @Column(name = "descripcion")
    private int descripcion;

    @Column(name = "permiso_insertar")
    private int permisoInsertar;

    @Column(name = "permiso_actualizar")
    private int permisoActualizar;

    @Column(name = "permiso_eliminar")
    private int permisoEliminar;

    @Column(name = "permiso_consultar")
    private int permisoConsultar;

    @Column(name = "contrasenia")
    private int contrasenia;

    @Column(name = "nombre")
    private int nombre;

    @Column(name = "apellido")
    private int apellido;

    @Column(name = "telefono")
    private int telefono;

    @Column(name = "correo")
    private int correo;

    @Column(name = "direccion")
    private int direccion;

    @Column(name = "nit")
    private int nit;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public int getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(int idMenu) {
        this.idMenu = idMenu;
    }

    public int getOpcionMenu() {
        return opcionMenu;
    }

    public void setOpcionMenu(int opcionMenu) {
        this.opcionMenu = opcionMenu;
    }

    public int getPagina() {
        return pagina;
    }

    public void setPagina(int pagina) {
        this.pagina = pagina;
    }

    public int getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(int descripcion) {
        this.descripcion = descripcion;
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

    public int getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(int contrasenia) {
        this.contrasenia = contrasenia;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public int getApellido() {
        return apellido;
    }

    public void setApellido(int apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCorreo() {
        return correo;
    }

    public void setCorreo(int correo) {
        this.correo = correo;
    }

    public int getDireccion() {
        return direccion;
    }

    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }
}
