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

import mdef.Producto;



@Entity
@Table(name = "PRODUCTOS")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TIPO_PRODUCTO", discriminatorType = DiscriminatorType.STRING)
public class ProductoConId extends Producto {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_CATALOGO", referencedColumnName = "id")
	private CatalogoConId catalogo;

	public CatalogoConId getCatalogo() {
		return catalogo;
	}

	public void setCatalogo(CatalogoConId catalogo) {
		this.catalogo = catalogo;
	}

	public ProductoConId() {}

	public ProductoConId(String descripcion, double precio) {
		super(descripcion,precio);

	
	}
}
