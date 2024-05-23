package com.rutuja.ClientService.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rutuja.ClientService.entity.Client;
import com.rutuja.ClientService.entity.Dmart;
import com.rutuja.ClientService.feignComm.Feign;
import com.rutuja.ClientService.repository.Repo;

@RestController
@RequestMapping("/client")
public class Rest {

	@Autowired
	private Repo repo;
	
	@Autowired
	private Feign feign;
	
	@PostMapping("/save")
	public Client save(@RequestBody Client client) {
		return repo.save(client);
	}
	
			
	@GetMapping("/all")
	public List<Client> getAll(){
		List<Client> listClient=repo.findAll();
		return listClient.stream().map(Client->{
		List<Dmart> listDmart=feign.getByClient(Client.getId());
			Client.setDmarts(listDmart);
			return Client;
		}).toList();
	}
	
	@GetMapping("/findById/{id}")
	public Client getById(@PathVariable int id) {
		Optional<Client> optional=repo.findById(id);
		if(optional.isPresent()) {
			Client client=optional.get();
			List<Dmart> listDmart=feign.getByClient(id);
			client.setDmarts(listDmart);
			return client;
		}
		return null;
	}
}
