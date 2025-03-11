package com.example.vehiculo.vehiculo.Repositorios;

import com.example.vehiculo.vehiculo.Entidades.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiculoRepositorio extends JpaRepository<Vehiculo, Long> {
}
