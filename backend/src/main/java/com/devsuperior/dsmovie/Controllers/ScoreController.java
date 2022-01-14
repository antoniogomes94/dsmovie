package com.devsuperior.dsmovie.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsmovie.Services.ScoreService;
import com.devsuperior.dsmovie.dto.MovieDTO;
import com.devsuperior.dsmovie.dto.ScoreDTO;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {

	@Autowired
	public ScoreService service;
	
	@PutMapping
	public MovieDTO saveScore(@RequestBody ScoreDTO model){
		MovieDTO movieDTO = service.saveScore(model);
		return movieDTO;
	}
	
	
}
