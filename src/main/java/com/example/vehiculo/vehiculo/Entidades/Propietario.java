package com.example.vehiculo.vehiculo.Entidades;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class Propietario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idPropietario;
    String nombre;
    String apellidos;
    @OneToMany(mappedBy = "propietario")
    List<Vehiculo> vehiculos;

    public Propietario() {
    }

    public Propietario(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Propietario(String nombre, String apellidos, List<Vehiculo> vehiculos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.vehiculos = vehiculos;
    }

    public Propietario(Long idPropietario, String nombre, String apellidos, List<Vehiculo> vehiculos) {
        this.idPropietario = idPropietario;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.vehiculos = vehiculos;
    }

    public Long getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(Long idPropietario) {
        this.idPropietario = idPropietario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "idPropietario=" + idPropietario +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", vehiculos=" + vehiculos +
                '}';
    }
}
