package com.rutuja.DmartService.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rutuja.DmartService.entity.Dmart;
import com.rutuja.DmartService.repository.Repo;

@RestController
@RequestMapping("/dmart")
public class Rest {

	@Autowired
	private Repo repo;
	
	@PostMapping("/save")
	public Dmart saveName(@RequestBody Dmart dmart) {
		return repo.save(dmart);
	}
	
	@GetMapping("/all")
	public List<Dmart> getAllName(){
		return repo.findAll();
	}
	
	@GetMapping("/findById/{id}")
	public Dmart getById(@PathVariable int id) {
		Optional<Dmart> optional=repo.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}
	
	@GetMapping("/findByClientId/{id}")
	public List<Dmart> getByClient(@PathVariable int id){
	   return repo.findByClientid(id);
	}
}
