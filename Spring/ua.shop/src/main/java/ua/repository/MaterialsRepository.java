package ua.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.entity.Category;
import ua.entity.Materials;

public interface MaterialsRepository  extends JpaRepository<Materials, Integer>{

}
