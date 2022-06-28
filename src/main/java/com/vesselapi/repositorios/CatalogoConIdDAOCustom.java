package com.vesselapi.repositorios;

import java.util.Set;

import com.vesselapi.entidades.CatalogoConId;

public interface CatalogoConIdDAOCustom {
	Set<CatalogoConId>getCatalogosConProductos(boolean tieneAlimentacion, boolean tieneMenaje);
}
