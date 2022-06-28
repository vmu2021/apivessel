package com.vesselapi.repositorios;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import com.vesselapi.entidades.MenajeConId;

public class MenajeListener {

	private MenajeConIdDAO menajeDAO;
	
	@Autowired
	public void init(MenajeConIdDAO menajeDAO) {
		this.menajeDAO = menajeDAO;
	}
	
	@PrePersist
	@PreUpdate
	public void preGuardarOptica(MenajeConId menajeCreado) throws Exception {
		if (menajeCreado.isReciclable() != true != false ) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "La condicion de reciclable tiene que ser true o false");
		}
	}
}