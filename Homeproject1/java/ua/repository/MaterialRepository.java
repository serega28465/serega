package ua.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.entity.Category;
import ua.entity.Material;

public interface MaterialRepository  extends JpaRepository<Material, Integer>{

}
