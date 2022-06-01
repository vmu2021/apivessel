package com.vesselapi.entidades;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
//import javax.persistence.Table;

import mdef.Alimentacion;
import mdef.AlimentacionInterfaz;

@Entity
//@Table(name ="ALIMENTACION")
@Access(value = AccessType.FIELD)
@DiscriminatorValue("ALIMENTACION")
public class AlimentacionCatalogo extends ProductosCatalogo implements AlimentacionInterfaz {

	@Column(name = "REFRIGERADO")
	private boolean refrigerable;

	@Override
	public boolean isRefrigerado() {
		return false;
	}

	@Override
	public void setRefrigerado(boolean refrigerado) {

	}

	public AlimentacionCatalogo() {
	}

	public AlimentacionCatalogo(long id, String descripcion, double precio) {
		super(id, descripcion, precio);
	}

}
