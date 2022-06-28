package com.vesselapi.entidades;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;

import mdef.MenajeInterfaz;


@Entity
@EntityListeners(MenajeListener.class)
@Access(value=AccessType.FIELD)
@DiscriminatorValue("MENAJE")
public class MenajeConId extends ProductoConId implements MenajeInterfaz {

	private boolean reciclable;

	@Override
	public boolean isReciclable() {
		return false;
	}

	@Override
	public void setReciclable(boolean reciclable) {
		this.reciclable = reciclable;
	}

	public MenajeConId() {}

	public MenajeConId(String nombre, double precio) {
		super(nombre,precio);
	}

	
	

	

}
