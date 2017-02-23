package ua.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import ua.entity.Category;
import ua.entity.Material;

public interface MaterialRepository  extends JpaRepository<Material, Integer>, JpaSpecificationExecutor<Material>{

	Material findByMaterial(String material);

	@Query("SELECT m FROM Materials m LEFT JOIN FETCH m.material WHERE m.id=:id")
	List<Material> findAll();
}
