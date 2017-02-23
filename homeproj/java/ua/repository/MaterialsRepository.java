package ua.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ua.entity.Category;
import ua.entity.Material;
import ua.entity.Materials;
import ua.entity.Producer;


public interface MaterialsRepository  extends JpaRepository<Materials, Integer>{

	

//	@Query("SELECT m FROM Materials m LEFT JOIN FETCH m.material WHERE m.id=:id")
//	Materials findOne(@Param("id")int id);
	
//	@Query("SELECT m FROM Material m LEFT JOIN FETCH m.materials WHERE m.id=:id")
//	List<Material> findAll();
	
//	@Query("SELECT m FROM Material m LEFT JOIN FETCH m.materials WHERE m.id=:id")
//	Material findOne(@Param("id")int id);
}
