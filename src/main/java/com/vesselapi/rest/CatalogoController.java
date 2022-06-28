package com.vesselapi.rest;

import java.util.List;
import java.util.Set;

import org.springframework.data.rest.webmvc.PersistentEntityResource;
import org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vesselapi.entidades.CatalogoConId;
import com.vesselapi.repositorios.CatalogoConIdDAO;

@RepositoryRestController
public class CatalogoController {

	private CatalogoConIdDAO catalogoDao;

	public CatalogoController(CatalogoConIdDAO catalogoDao) {
		this.catalogoDao = catalogoDao;
	}

	@GetMapping("/catalogos/search/por-tipo-producto")
	@ResponseBody
	public CollectionModel<PersistentEntityResource> getCatalogosConProductos(
			@RequestParam("tieneAlimentacion") boolean tieneAlimentacion,
			@RequestParam("tieneMenaje") boolean tieneMenaje, PersistentEntityResourceAssembler assembler) {

		Set<CatalogoConId> catalogos = catalogoDao.getCatalogosConProductos(tieneAlimentacion,tieneMenaje);

		return assembler.toCollectionModel(catalogos);
	}
}
