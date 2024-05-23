package com.rutuja.ClientService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rutuja.ClientService.entity.Client;

@Repository
public interface Repo extends JpaRepository<Client, Integer>{

}
