package com.example.vehiculo.vehiculo.Entidades;

public class VehiculoDTO {
    private Long idVehiculo;
    private String marca;
    private String modelo;
    private String año;
    private int precio;
    private String propietario;

    public VehiculoDTO(){}

    public VehiculoDTO(Long idVehiculo, String marca, String modelo, String año, int precio, String propietario) {
        this.idVehiculo = idVehiculo;
        this.marca = marca;
        this.modelo = modelo;
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

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public static VehiculoDTO of (Vehiculo vehiculo){
        return new VehiculoDTO(vehiculo.getIdVehiculo(), vehiculo.getMarca(), vehiculo.getModelo(), vehiculo.getAño(), vehiculo.getPrecio(),
                vehiculo.getPropietario().getNombre()+" "+vehiculo.getPropietario().getApellidos());
    }

    @Override
    public String toString() {
        return "VehiculoDTO{" +
                "idVehiculo=" + idVehiculo +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año='" + año + '\'' +
                ", precio=" + precio +
                ", propietario='" + propietario + '\'' +
                '}';
    }
}
