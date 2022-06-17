package com.vesselapi.entidades;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
//import javax.persistence.Table;
import javax.persistence.Table;

import mdef.MenajeInterfaz;

public class MenajeCatalogo extends ProductosCatalogo implements MenajeInterfaz {

	@Column(name = "RECICLABLE")
	private boolean reciclable;

	public boolean isReciclable() {
		return reciclable;
	}

	public void setReciclable(boolean reciclable) {
		this.reciclable = reciclable;
	}

	@Override
	public String getDescripcionProducto() {
		// TODO Auto-generated method stub
		return super.getDescripcionProducto();
	}

	@Override
	public void setDescripcionProducto(String descripcionProducto) {
		// TODO Auto-generated method stub
		super.setDescripcionProducto(descripcionProducto);
	}

	public MenajeCatalogo() {
	}

}
