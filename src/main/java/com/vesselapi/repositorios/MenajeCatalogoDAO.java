package com.vesselapi.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.vesselapi.entidades.MenajeConId;

@RepositoryRestResource(path = "menajes", collectionResourceRel = "menajes",itemResourceRel = "menaje")
public interface MenajeCatalogoDAO extends JpaRepository<MenajeConId, Long> {

}
