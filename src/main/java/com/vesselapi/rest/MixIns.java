package com.vesselapi.rest;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

public class MixIns {

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

}
