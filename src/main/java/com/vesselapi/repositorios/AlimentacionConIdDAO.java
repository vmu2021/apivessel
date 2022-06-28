package com.vesselapi.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.vesselapi.entidades.AlimentacionConId;

@RepositoryRestResource(path = "alimentos", itemResourceRel = "alimento", collectionResourceRel = "alimentos")
public interface AlimentacionConIdDAO extends JpaRepository<AlimentacionConId, Long>{

}
