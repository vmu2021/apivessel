package com.vesselapi.entidades;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

import mdef.AlimentacionInterfaz;


public class AlimentacionCatalogo extends ProductosCatalogo implements AlimentacionInterfaz {
	
	@Column(name = "REFRIGERABLE")	
	private boolean refrigerable;
	
	public boolean isRefrigerable() {
		return refrigerable;
	}

	public void setRefrigerable(boolean refrigerable) {
		this.refrigerable = refrigerable;
	}

	public AlimentacionCatalogo() {
	}

	@Override
	public boolean isRefrigerado() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setRefrigerado(boolean refrigerado) {
		// TODO Auto-generated method stub
		
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

	


}
