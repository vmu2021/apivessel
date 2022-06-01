package com.vesselapi.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.vesselapi.entidades.MenajeCatalogo;

@RepositoryRestResource(path = "menajes", itemResourceRel = "menaje", collectionResourceRel = "menaje")
public interface MenajeCatalogoDAO extends JpaRepository<MenajeCatalogo, Long> {

}
