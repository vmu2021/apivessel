package com.vesselapi.entidades;

import javax.persistence.DiscriminatorColumn;

import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import javax.persistence.Table;

import mdef.Producto;

@Entity
@Table(name = "PRODUCTOS")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TIPO_PRODUCTO", discriminatorType = DiscriminatorType.STRING)
public class ProductosCatalogo extends Producto {

	private CatalogoConId catalogoConId;

	public CatalogoConId getCatalogoConId() {
		return catalogoConId;
	}

	public void setCatalogoConId(CatalogoConId catalogoConId) {
		this.catalogoConId = catalogoConId;
	}

	public ProductosCatalogo() {
	}

	public ProductosCatalogo(long id, String descripcion, double precio) {
		super(id, descripcion, precio);
	}

}
