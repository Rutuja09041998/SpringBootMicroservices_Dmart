package com.rutuja.ClientService.entity;

import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity
@Component
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String clientname;
	@Transient
	private List<Dmart> dmarts;
	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Client(int id, String clientname, List<Dmart> dmarts) {
		super();
		this.id = id;
		this.clientname = clientname;
		this.dmarts = dmarts;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClientname() {
		return clientname;
	}
	public void setClientname(String clientname) {
		this.clientname = clientname;
	}
	public List<Dmart> getDmarts() {
		return dmarts;
	}
	public void setDmarts(List<Dmart> dmarts) {
		this.dmarts = dmarts;
	}
	
	@Override
	public String toString() {
		return "Client [id=" + id + ", clientname=" + clientname + ", dmarts=" + dmarts + "]";
	}
	
}
