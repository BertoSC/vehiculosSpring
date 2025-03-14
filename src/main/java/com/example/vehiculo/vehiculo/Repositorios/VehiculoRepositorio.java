package com.example.vehiculo.vehiculo.Repositorios;

import com.example.vehiculo.vehiculo.Entidades.Vehiculo;
import com.example.vehiculo.vehiculo.Entidades.VehiculoDTO;
import org.hibernate.query.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
 // Importación correcta
import org.springframework.data.domain.Pageable;  // Importación correcta
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface VehiculoRepositorio extends JpaRepository<Vehiculo, Long> {

    List<Vehiculo> findAllByMarca(String marca);

    // Consulta personalizada para comprobar si existe un vehículo con un id y un tipo específico

    // La consulta toma todos los vehiculos y utiliza case para setear true o false si encuentra alguno
    // TYPE se usa en situaciones de herencia, para recibir en la consulta el .class de la subclase que estás buscando

    @Query("SELECT CASE WHEN COUNT(v) > 0 THEN TRUE ELSE FALSE END " +
            "FROM Vehiculo v WHERE v.idVehiculo = :idVehiculo AND TYPE(v) = :vehiculoType")
    boolean existsByIdVehiculoAndVehiculoType(@Param("idVehiculo") Long idVehiculo,
                                              @Param("vehiculoType") Class vehiculoType);


    // Devuelve el vehículo en un objeto VehiculoDTO  a partir de un id
    @Query("SELECT new com.example.vehiculo.vehiculo.Entidades.VehiculoDTO(v.idVehiculo, v.marca, v.modelo, v.año, v.precio, CONCAT(v.propietario.nombre,' ',v.propietario.apellidos))" +
            "from Vehiculo v where v.idVehiculo= :idVehiculo")
    VehiculoDTO findVehiculoDTOById(@Param("idVehiculo") Long idVehiculo);


    // Devuelve todos los vehiculos en formato VehiculoDTO
    @Query("SELECT new com.example.vehiculo.vehiculo.Entidades.VehiculoDTO(v.idVehiculo, v.marca, v.modelo, v.año, v.precio, CONCAT(v.propietario.nombre,' ',v.propietario.apellidos))"+
            "from Vehiculo v")
    List<VehiculoDTO> findAllVehiculoDTO();

    // Devuelve todos los vehiculos en formato VehiculoDTO, pero paginados y ordenados
    @Query("SELECT new com.example.vehiculo.vehiculo.Entidades.VehiculoDTO(v.idVehiculo, v.marca, v.modelo, v.año, v.precio, CONCAT(v.propietario.nombre,' ',v.propietario.apellidos))"+
            "from Vehiculo v")
    List<VehiculoDTO> findAllVehiculoDTOSortedAndPaged(Pageable pageable);



}
