package com.vesselapi.entidades;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
//import javax.persistence.Table;

import mdef.MenajeInterfaz;

@Entity
//@Table(name ="TELEVISORES")
@Access(value = AccessType.FIELD)
@DiscriminatorValue("MENAJE")
public class MenajeCatalogo extends ProductosCatalogo implements MenajeInterfaz {

	@Column(name = "RECICLABLE")
	private boolean reciclable;

	@Override
	public boolean isReciclable() {
		return reciclable;
	}

	@Override
	public void setReciclable(boolean reciclable) {

	}

	public MenajeCatalogo() {
	}

	public MenajeCatalogo(long id, String descripcion, double precio) {
		super(id, descripcion, precio);
	}

}
