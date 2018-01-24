package com.leucotron.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.leucotron.repository.JProperties;
import com.leucotron.repository.IPropertiesRepository;

@RestController
@RequestMapping("/api")
public class JPropertiesController {

	@Autowired
	private IPropertiesRepository repository;

	@RequestMapping(value = "/find/{filtro}", method = RequestMethod.GET)
	List<JProperties> findByFiltro(@PathVariable("filtro") String filtro) {
		return repository.findByFiltro(filtro);
	}

}
