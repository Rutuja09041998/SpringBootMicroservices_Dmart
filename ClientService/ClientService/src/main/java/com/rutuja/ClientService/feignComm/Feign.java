package com.rutuja.ClientService.feignComm;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.rutuja.ClientService.entity.Dmart;


@Configuration
@FeignClient(name="DmartService")
public interface Feign {

	@GetMapping("/dmart/all")
	public List<Dmart> getAllName();
	
	@GetMapping("/dmart/findById/{id}")
	public Dmart getById(@PathVariable int id);
	
	@GetMapping("/dmart/findByClientId/{id}")
	public List<Dmart> getByClient(@PathVariable int id);
}
