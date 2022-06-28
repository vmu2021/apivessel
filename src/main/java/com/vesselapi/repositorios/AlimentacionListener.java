package com.vesselapi.repositorios;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import com.vesselapi.entidades.AlimentacionConId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.server.ResponseStatusException;

public class AlimentacionListener {
private AlimentacionConIdDAO alimentacionDAO;
	
	@Autowired
	public void init(AlimentacionConIdDAO alimentacionDAO) {
		this.alimentacionDAO = alimentacionDAO;
	}
	
	@PrePersist
	@PreUpdate
	public void preGuardarAlimentacion(AlimentacionConId alimentacionCreada) throws Exception {
		if (alimentacionCreada.isRefrigerado()) {
			
		}
	}
	
}
