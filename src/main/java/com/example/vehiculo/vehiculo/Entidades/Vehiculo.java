package com.example.vehiculo.vehiculo.Entidades;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
abstract class Vehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idVehiculo;
    String marca;
    String modelo;
    String año;
    int precio;
    @ManyToOne
    @JoinColumn(name = "idPropietario")
    Propietario propietario;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int precio, String año) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.año = año;
    }

    public Vehiculo(String marca, String modelo, String año, int precio, Propietario propietario) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precio = precio;
        this.propietario = propietario;
    }

    public Vehiculo(Long idVehiculo, String modelo, String marca, String año, int precio, Propietario propietario) {
        this.idVehiculo = idVehiculo;
        this.modelo = modelo;
        this.marca = marca;
        this.año = año;
        this.precio = precio;
        this.propietario = propietario;
    }

    public Long getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(Long idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "idVehiculo=" + idVehiculo +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año='" + año + '\'' +
                ", precio=" + precio +
                ", propietario=" + propietario +
                '}';
    }
}
