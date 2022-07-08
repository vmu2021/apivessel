package com.vesselapi.repositorios;

import javax.persistence.PrePersist;


import javax.persistence.PreUpdate;
import com.vesselapi.entidades.AlimentacionConId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;


@Component
public class AlimentacionListener {
//private AlimentacionConIdDAO alimentacionDAO;

//	@Autowired
//	public void init(AlimentacionConIdDAO alimentacionDAO) {
//		this.alimentacionDAO = alimentacionDAO;
//	}

	@PrePersist
	public void preGuardarAlimentacion(AlimentacionConId alimentacionCreada) throws Exception {
		if (alimentacionCreada.getPrecio() < 0) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "El precio tiene que ser mayor que 0");
		}
	}

	

}
