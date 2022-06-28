package com.vesselapi.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.vesselapi.entidades.CatalogoConId;


@RepositoryRestResource(path="catalogos", collectionResourceRel="catalogos", itemResourceRel="catalogo")
public interface CatalogoConIdDAO extends JpaRepository<CatalogoConId, Long>, CatalogoConIdDAOCustom {

	@RestResource(exported = false)
	void delete(CatalogoConId catalogo);
	
	@RestResource(path="por-nombre")
	List<CatalogoConId>findByNombreIgnoeCase(@Param("nombre")String txt);
}
