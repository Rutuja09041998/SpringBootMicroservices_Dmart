package com.rutuja.DmartService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rutuja.DmartService.entity.Dmart;

@Repository
public interface Repo extends JpaRepository<Dmart, Integer>{

	List<Dmart> findByClientid(int id);

	

}
