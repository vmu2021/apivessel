package com.vesselapi.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.vesselapi.entidades.AlimentacionCatalogo;

@RepositoryRestResource(path = "alimentacion", collectionResourceRel = "alimentos",itemResourceRel = "alimento")
public interface AlimentacionCatalogoDAO extends JpaRepository<AlimentacionCatalogo, Long>{

}
