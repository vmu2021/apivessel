package com.vesselapi.repositorios;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.transaction.annotation.Transactional;

import com.vesselapi.entidades.AlimentacionConId;
import com.vesselapi.entidades.CatalogoConId;
import com.vesselapi.entidades.MenajeConId;
import com.vesselapi.entidades.ProductoConId;

@Transactional(readOnly = true)
public class CatalogoConIdDAOImpl implements CatalogoConIdDAOCustom {

	@Autowired
	  CatalogoConIdDAO catalogoDao;
	  AlimentacionConIdDAO alimentacionDao;
	  MenajeConIdDAO menajeDao;
	  ProductoConIdDAO productoDao;
	

	 @Autowired
	 public CatalogoConIdDAOImpl(@Lazy CatalogoConIdDAO catalogoConIdDAO, 
		      AlimentacionConIdDAO alimentacionConIdDAO, MenajeConIdDAO menajeConIdDAO,
		      ProductoConIdDAO productoConIdDAO) {
		 this.catalogoDao = catalogoConIdDAO;
		 this.alimentacionDao = alimentacionConIdDAO;
		 this.menajeDao = menajeConIdDAO;
		 this.productoDao = productoConIdDAO;
		 
	 }
	 
	 @PersistenceContext
	  EntityManager entityManager;
	 @Override
	 public Set<CatalogoConId> getCatalogosConProductos(boolean tieneAlimentacion,boolean tieneMenaje) {

	    Set<CatalogoConId> catalogosFiltrados = new HashSet<CatalogoConId>();
	    List<ProductoConId> productos = productoDao.findAll();
	    List<AlimentacionConId> alimentaciones = alimentacionDao.findAll();
	    List<MenajeConId> menajes = menajeDao.findAll();
	    
	    if (tieneAlimentacion && tieneMenaje) {      
	      for (AlimentacionConId alimentacion : alimentaciones) {
	        catalogosFiltrados.add(alimentacion.getCatalogo());
	      }
	      for (MenajeConId menaje : menajes) {
	        catalogosFiltrados.add(menaje.getCatalogo());
	      }
	    }
	    
	    if (!tieneAlimentacion && !tieneMenaje) {   
	      for (MenajeConId menaje : menajes) {
	        catalogosFiltrados.add(menaje.getCatalogo());
	      }
	      for (AlimentacionConId alimentacionEliminar : alimentaciones) {
	        catalogosFiltrados.remove(alimentacionEliminar.getCatalogo());
	      }
	    }
	    
	    if (tieneAlimentacion && !tieneMenaje) {
	      for (AlimentacionConId alimentacion : alimentaciones) {
	        catalogosFiltrados.add(alimentacion.getCatalogo());
	      }
	      for (MenajeConId menajeEliminar : menajes) {
	        catalogosFiltrados.remove(menajeEliminar.getCatalogo());
	      }
	    }
	    
	    if (!tieneAlimentacion && !tieneMenaje) {
	      for (ProductoConId producto : productos) {
	        catalogosFiltrados.add(producto.getCatalogo());
	      }
	      for (AlimentacionConId alimentacionEliminar : alimentaciones) {
	        catalogosFiltrados.remove(alimentacionEliminar.getCatalogo());
	      }
	      for (MenajeConId menajeEliminar : menajes) {
	        catalogosFiltrados.remove(menajeEliminar.getCatalogo());
	      }
	    }

	    return catalogosFiltrados;
	  }

}
