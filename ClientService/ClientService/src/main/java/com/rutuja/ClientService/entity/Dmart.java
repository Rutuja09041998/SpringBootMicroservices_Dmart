package com.rutuja.ClientService.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Component
public class Dmart {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int price;
	private int clientid;
	
	public Dmart() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Dmart(int id, String name, int price, int clientid) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.clientid = clientid;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getClientid() {
		return clientid;
	}
	public void setClientid(int clientid) {
		this.clientid = clientid;
	}
	
	@Override
	public String toString() {
		return "Dmart [id=" + id + ", name=" + name + ", price=" + price + ", clientid=" + clientid + "]";
	}

}
