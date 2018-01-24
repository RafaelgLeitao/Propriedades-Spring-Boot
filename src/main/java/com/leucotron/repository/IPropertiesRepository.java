package com.leucotron.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface IPropertiesRepository extends PagingAndSortingRepository<JProperties, String> {

	@Query("Select p from JProperties p where p.nome like %:filtro%")
	public List<JProperties> findByFiltro(@Param("filtro") String filtro);

}
