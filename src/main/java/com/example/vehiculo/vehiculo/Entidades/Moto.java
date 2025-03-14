package com.example.vehiculo.vehiculo.Entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
//@PrimaryKeyJoinColumn(name = "idVehiculo")
public class Moto extends Vehiculo{
    String cilindrada;
    String tipo;

    public Moto() {
        super();
    }

    public Moto(String marca, String modelo, int precio, String año, String cilindrada, String tipo) {
        super(marca, modelo, precio, año);
        this.cilindrada = cilindrada;
        this.tipo = tipo;
    }

    public Moto(String marca, String modelo, String año, int precio, Propietario propietario, String cilindrada, String tipo) {
        super(marca, modelo, año, precio, propietario);
        this.cilindrada = cilindrada;
        this.tipo = tipo;
    }

    public Moto(Long idVehiculo, String modelo, String marca, String año, int precio, Propietario propietario, String cilindrada, String tipo) {
        super(idVehiculo, modelo, marca, año, precio, propietario);
        this.cilindrada = cilindrada;
        this.tipo = tipo;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "idVehiculo=" + idVehiculo +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año='" + año + '\'' +
                ", precio=" + precio +
                ", propietario=" + propietario.nombre +
                ", cilindrada='" + cilindrada + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
