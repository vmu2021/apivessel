package com.vesselapi.entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import mdef.Catalogo;

@Entity
@Table(name="CATALOGOS")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class CatalogoConId extends Catalogo {
	
	  private List<ProductoConId> productosCatalogo = new ArrayList<>();
	  
	  @OneToMany(cascade = CascadeType.ALL, targetEntity=ProductoConId.class, mappedBy = "catalogo")
	  public List<ProductoConId> getProductosCatalogo() {
	    return productosCatalogo;
	  }
	  
	  public void setProductosCatalogo(List<ProductoConId> productosCatalogo) {
	    this.productosCatalogo = productosCatalogo;
	  }  
	  
	  public void addProductoConId(ProductoConId producto) {
	    getProductosCatalogo().add(producto);
	    producto.setCatalogo(this);
	  }

	public CatalogoConId() {
	}

	public CatalogoConId(String descripcion) {
		super(descripcion);
	}
	  
	 

}
