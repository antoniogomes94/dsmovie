package com.devsuperior.dsmovie.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsmovie.Services.MovieService;
import com.devsuperior.dsmovie.dto.MovieDTO;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {

	@Autowired
	public MovieService service;
	
	@GetMapping
	public Page<MovieDTO> findAll(Pageable model){
		return service.findAll(model);
	}
	
	@GetMapping(value = "/{id}")
	public MovieDTO findById(@PathVariable long id){
		return service.findById(id);
	}
	
	
}
