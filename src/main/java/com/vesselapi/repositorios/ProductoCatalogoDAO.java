package com.vesselapi.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.vesselapi.entidades.ProductoConId;


@RepositoryRestResource(path="productos", collectionResourceRel="productos", itemResourceRel="producto")
public interface ProductoCatalogoDAO extends JpaRepository<ProductoConId, Long>{

//	@RestResource(path = "por-descripcion")
//	List<ProductosCatalogo> findByDescripcion(@Param("descripcion")String descripcion);
//	
//	@RestResource(path = "por-precio")
//	List<ProductosCatalogo> findByPrecio(@Param("precio") double precio);
//	
//	@RestResource(path = "tipo-refrigerable")
//	List<ProductosCatalogo> findByRefirgerable(@Param("refrigerable") boolean refrigerable);
//	
//	@RestResource(path = "tipo-reciclable")
//	List<ProductosCatalogo> findByReciclable(@Param("reciclable") boolean reciclable);
}
