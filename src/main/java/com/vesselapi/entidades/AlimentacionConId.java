package com.vesselapi.entidades;

import com.vesselapi.repositorios.AlimentacionListener;

import mdef.AlimentacionInterfaz;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;

@Entity
@EntityListeners(AlimentacionListener.class)
@Access(value = AccessType.FIELD)
@DiscriminatorValue("ALIMENTACION")
public class AlimentacionConId extends ProductoConId implements AlimentacionInterfaz {

	private boolean refrigerado;

	@Override
	public boolean isRefrigerado() {
		return refrigerado;
	}

	@Override
	public void setRefrigerado(boolean refrigerado) {
		this.refrigerado = refrigerado;

	}

	public AlimentacionConId() {
		super();
	}

	public AlimentacionConId(String descripcion, double precio) {
		super(descripcion, precio);
	}

}
