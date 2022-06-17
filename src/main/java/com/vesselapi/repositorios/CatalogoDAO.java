package com.vesselapi.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.vesselapi.entidades.CatalogoConId;


@RepositoryRestResource(path="catalogos", collectionResourceRel="catalogos", itemResourceRel="catalogo")
public interface CatalogoDAO extends JpaRepository<CatalogoConId, Long> {

}
