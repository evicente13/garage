package com.garage77.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.garage77.model.CSV;
import com.garage77.model.Cliente;
import com.garage77.model.Insumo;
import com.garage77.model.InsumoVehiculo;
import com.garage77.model.Servicio;
import com.garage77.model.Vehiculo;
import com.garage77.repository.IClienteRepository;
import com.garage77.repository.IServicioRepository;
import com.garage77.repository.IVehiculoRepository;
import com.garage77.repository.InsumoRepository;
import com.garage77.repository.InsumoVehiculoRepository;
import com.garage77.repository.UserRepository;

public class CSVController
{
	
	@Autowired
	private IClienteRepository repoCli;
	@Autowired
	private IVehiculoRepository repoVehi;
	@Autowired
	private InsumoRepository repoInsu;
	@Autowired
	private InsumoVehiculoRepository repoInVe;
	@Autowired
	private IServicioRepository repoServ;
	
	
	
	 @PostMapping("/PgCSV")
     public String registrarCSV(@ModelAttribute CSV csv, @RequestParam(value = "action", required = false) String action, Model model) {
         if ("registrar".equals(action)) {


		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");
		
		Cliente cliente = new Cliente();
		cliente.setClienteNombre(csv.getNombreCliente());
		cliente.setClienteTelefono(csv.getTelefonoCliente());
		cliente.setClienteDni(csv.getDniCliente());

		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setPlaca(csv.getPlaca());
		vehiculo.setAñoVehiculo(csv.getAñoVehiculo());
		vehiculo.setKmActual(csv.getKmActual());
		vehiculo.setKmAprox(csv.getKmAprox());
		vehiculo.setMarca(csv.getMarca());
		vehiculo.setModelo(csv.getModelo());
		
		Servicio servicio = new Servicio();
		LocalDateTime fechaHoraRecep = LocalDateTime.parse(csv.getServicioHoraRecep(), formatter);
		servicio.setServicioHoraRecep(fechaHoraRecep);
		LocalDateTime fechaHoraEntrega = LocalDateTime.parse(csv.getServicioHoraEntrega(), formatter);
		servicio.setServicioHoraEntrega(fechaHoraEntrega);
		servicio.setServicioTotal(csv.getServicioTotal());

		InsumoVehiculo insumoVehiculo = new InsumoVehiculo();
		insumoVehiculo.setPlaca(csv.getPlaca());
		insumoVehiculo.setInsumoId(csv.getInsumoId());
		insumoVehiculo.setInsumoPrecio(csv.getInsumoPrecio());

		Insumo insumo = new Insumo();
		insumo.setInsumoId(csv.getInsumoId());
		insumo.setInsumoDescripcion(csv.getInsumoDescripcion());
		insumo.setInsumoPrecio(csv.getInsumoPrecio());
		
		

        // Verificar si ya existe un cliente con el mismo código
          if (repoCli.existsById(csv.getIdCliente()))
          {
               model.addAttribute("mensaje", "El código de Cliente ya existe");
            	   } else {
            	        try {
							Cliente newcliente = repoCli.save(cliente);

							vehiculo.setClienteId(newcliente.getClienteId());
							repoVehi.save(vehiculo);
							
							Servicio nuevoServicio = repoServ.save(servicio);
							insumoVehiculo.setServicioId(nuevoServicio.getServicioId());
							
							repoInVe.save(insumoVehiculo);
							
            	            model.addAttribute("mensaje", "Cliente registrado correctamente");
            	       } catch (Exception e) {
            	            model.addAttribute("mensaje", "Error al registrar al Cliente");
            	            }
            	        }
         }
		 
		 return "PgCSV";
	}
	 
	@GetMapping("/PgCSV/listadoInsumos")
	public String mostrarInsumos(Model model) 
	{
			List <Insumo> listaInsumos = repoInsu.findAll();
			model.addAttribute("insumos", listaInsumos);
			System.out.print(listaInsumos);
			return ("PgCSV");
		} 

}
