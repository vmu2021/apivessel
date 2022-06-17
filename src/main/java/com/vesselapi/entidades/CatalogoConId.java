package com.vesselapi.entidades;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import mdef.*;

//@Entity
//@Table(name = "CATALOGO")
public class CatalogoConId extends Catalogo {

	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	@Override
	@OneToMany(cascade = CascadeType.ALL, targetEntity = ProductosCatalogo.class, mappedBy = "catalogo")	
	public Collection<Producto> getProductos() {		
		return super.getProductos();
	}

	@Override
	public String getDescripcion() {
		return super.getDescripcion();
	}

	@Override
	public void setDescripcion(String descripcion) {
		super.setDescripcion(descripcion);
	}
	


	public CatalogoConId() {
		super();
	}

	@Override
	public String toString() {
		return "CatalogoConId [getId()=" + getId() + ", getDescripcion()=" + getDescripcion() + ", getProductos()="
				+ getProductos() + "]";
	}

	

	

}
