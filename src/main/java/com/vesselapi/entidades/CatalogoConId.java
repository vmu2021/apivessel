package com.vesselapi.entidades;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import mdef.*;

@Entity
@Table(name = "CATALOGOS")
public class CatalogoConId extends Catalogo {

	@OneToMany(cascade = CascadeType.ALL, targetEntity = ProductosCatalogo.class, mappedBy = "catalogo")
	private Collection<ProductosCatalogo> productos = new ArrayList<ProductosCatalogo>();

}
