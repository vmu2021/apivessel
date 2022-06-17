package com.vesselapi.entidades;

import javax.persistence.DiscriminatorColumn;

import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import mdef.Catalogo;
import mdef.Producto;

//@Entity
//@Table(name = "PRODUCTOS")
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "TIPO_PRODUCTO", discriminatorType = DiscriminatorType.STRING)
public class ProductosCatalogo extends Producto {

	private long id;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	@ManyToOne(fetch = FetchType.LAZY, targetEntity = CatalogoConId.class)
	@JoinColumn(name = "CATALOGO")	
	public Catalogo getCatalogo() {
		return super.getCatalogo();
	}
	
	@Override
	public String getDescripcionProducto() {
		// TODO Auto-generated method stub
		return super.getDescripcionProducto();
	}

	@Override
	public double getPrecio() {
		// TODO Auto-generated method stub
		return super.getPrecio();
	}
	


	public ProductosCatalogo() {
		super();
	}
	




}
