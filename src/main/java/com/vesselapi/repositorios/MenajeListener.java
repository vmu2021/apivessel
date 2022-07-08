package com.vesselapi.repositorios;



import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

import com.vesselapi.entidades.MenajeConId;

@Component
public class MenajeListener {

//	private MenajeConIdDAO menajeDAO;
//
//	@Autowired
//	public void init(MenajeConIdDAO menajeDAO) {
//		this.menajeDAO = menajeDAO;
//	}

	@PrePersist
	public void preGuardarMenaje(MenajeConId menajeCreado) throws Exception {
		if (menajeCreado.getPrecio() < 0)  {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
					"El precio tiene que ser mayor que 0");
		}
	}
	
	
}
