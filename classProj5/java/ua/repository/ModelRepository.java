package ua.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import ua.entity.Model;
import ua.entity.Size;

public interface ModelRepository  extends JpaRepository<Model, Integer>, JpaSpecificationExecutor<Model>{

	Model findByModel(String model);
	
}