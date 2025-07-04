package com.bancandes.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="oficinas")
public class OficinaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer id_oficina;
    private String nombre;
    private String direccion;
    private Integer puntos_atencion;

    public OficinaEntity(Integer id_oficina, String nombre, String direccion, Integer puntos_atencion,
            Integer id_gerente_ofi, Integer id_persona) {
        this.id_oficina = id_oficina;
        this.nombre = nombre;
        this.direccion = direccion;
        this.puntos_atencion = puntos_atencion;
    }

    public OficinaEntity()
    {;}

    public Integer getId_oficina() {
        return id_oficina;
    }

    public void setId_oficina(Integer id_oficina) {
        this.id_oficina = id_oficina;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getPuntos_atencion() {
        return puntos_atencion;
    }

    public void setPuntos_atencion(Integer puntos_atencion) {
        this.puntos_atencion = puntos_atencion;
    }
    
}
