package com.vesselapi.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.vesselapi.entidades.CatalogoConId;


@RepositoryRestResource(path = "catalogos", itemResourceRel = "catalogo", collectionResourceRel = "catalogos")
public interface CatalogoIdDAO extends JpaRepository<CatalogoConId, Long> {

}
