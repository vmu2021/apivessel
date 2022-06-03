package com.vesselapi.rest;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

public class MixIns {
<<<<<<< HEAD

	@JsonPropertyOrder({ "idCatalogo", "tipo_producto", "id", "descripcion", "precio", "", "precio" })
	public static interface ElectrodomesticoConAlmacen {

		@JsonProperty("idCatalogo")
		long getIdCatalogo();

		@JsonProperty("id")
		long getIdProducto();

		@JsonProperty("descripcion")
		String getDescripcion();

		@JsonProperty("precio")
		double getPrecio();

	}
=======
	
	@JsonPropertyOrder({"idAlmacen", "tipo_producto", "id", "marca", "modelo", "calificacionEnergetica", "precio" })
	public static interface ProductoConCatalogo {
		
		
		
		@JsonProperty("idAlmacen")
		long getIdAlmacen();
		
		@JsonProperty("id")
		long getId();
		
		@JsonProperty("marca")
		String getMarca();
		
		@JsonProperty("modelo")
		String getModelo();
		
		@JsonProperty("calificacionEnergetica")
		char getCalificacionEnergetica();
		
		@JsonProperty("precio")
		double getPrecio();
		
		
	}
	
//	public static interface CatalogoConId() {
//		
//	}
//	
//	public static interface TelevisorConId() {
//		
//	}
//	
//	public static interface LavadoraConAlmacen() {
//		
//	}
>>>>>>> c5800c1b77ebde6f053859b0e04dd124ed9e523c

}
