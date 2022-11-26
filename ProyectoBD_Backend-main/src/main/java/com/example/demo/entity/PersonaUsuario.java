package com.example.demo.entity;

public class PersonaUsuario extends Persona{
	private static final long serialVersionUID = -7136099256218151393L;
	private String clave;

    public String getClave() {
        return clave;
    }

    public void setContrasenia(String clave) {
        this.clave = clave;
    }
}
