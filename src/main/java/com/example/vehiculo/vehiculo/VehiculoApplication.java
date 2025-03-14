package com.example.vehiculo.vehiculo;

import com.example.vehiculo.vehiculo.Entidades.*;
import com.example.vehiculo.vehiculo.Repositorios.PropietarioRepositorio;
import com.example.vehiculo.vehiculo.Repositorios.VehiculoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class VehiculoApplication implements CommandLineRunner {

	@Autowired
	private VehiculoRepositorio vehiculoRepositorio;


	public static void main(String[] args) {
		SpringApplication.run(VehiculoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// PROBANDO EL FINDALL de serie
		/*List<Vehiculo> ve = vehiculoRepositorio.findAll();
		if (ve.isEmpty()) {
			System.out.println("No hay vehículos en la base de datos.");
		} else {
			for (Vehiculo v : ve) {
				System.out.println(v);
			}
		}
		// PROBANDO UN MÉTODO PERSONALIZADO
		List <Vehiculo> veMarc = vehiculoRepositorio.findAllByMarca("Marca20");
		for (Vehiculo vM : veMarc) {
			System.out.println(vM);

		// PROBANDO PAGINACION
		int pagina = 2; // Página inicial
		int tamano = 5; // Número de elementos por página
		Pageable pageable = PageRequest.of(pagina, tamano);  // Crear objeto Pageable

		// Obtener una página de vehículos
		Page<Vehiculo> vehiculosPaginados = vehiculoRepositorio.findAll(pageable);

		// Mostrar los vehículos de la página
		System.out.println("Vehículos en la página " + pagina + ":");
		vehiculosPaginados.getContent().forEach(System.out::println);

		// Verificar si existe un vehiculo por su id y su tipo concreto

		boolean existsCoche = vehiculoRepositorio.existsByIdVehiculoAndVehiculoType(1L, Moto.class);

		System.out.println(existsCoche);

		// Devolver un vehiculoDTO

		VehiculoDTO vehiculoDTO = vehiculoRepositorio.findVehiculoDTOById(22L);

		System.out.println(vehiculoDTO);

		// devolver todos los vehículos en formato VehiculoDTO

		vehiculoRepositorio.findAllVehiculoDTO().forEach(System.out::println);

         // devolver todos los vehiculos dto ordenados y paginados

        Sort sort = Sort.by(Sort.Direction.DESC, "propietario");
		int pagina = 0;
		int tamaño = 20;
		Pageable pageable = PageRequest.of(pagina, tamaño, sort);

		vehiculoRepositorio.findAllVehiculoDTOSortedAndPaged(pageable).forEach(System.out::println);

		*/














	}
}