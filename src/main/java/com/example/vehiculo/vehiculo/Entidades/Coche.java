package com.example.vehiculo.vehiculo.Entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
//@PrimaryKeyJoinColumn(name = "idVehiculo")
public class Coche extends Vehiculo {
    int puertas;
    int plazas;

    public Coche() {
        super();
    }

    public Coche(String marca, String modelo, int precio, String año, int puertas, int plazas) {
        super(marca, modelo, precio, año);
        this.puertas = puertas;
        this.plazas = plazas;
    }

    public Coche(String marca, String modelo, String año, int precio, Propietario propietario, int puertas, int plazas) {
        super(marca, modelo, año, precio, propietario);
        this.puertas = puertas;
        this.plazas = plazas;
    }

    public Coche(Long idVehiculo, String modelo, String marca, String año, int precio, Propietario propietario, int puertas, int plazas) {
        super(idVehiculo, modelo, marca, año, precio, propietario);
        this.puertas = puertas;
        this.plazas = plazas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "puertas=" + puertas +
                ", plazas=" + plazas +
                '}';
    }

}
