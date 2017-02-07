package ua.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import ua.entity.Model;

public interface ModelRepository  extends JpaRepository<Model, Integer>{

	Model findByModel(String model);
	
}