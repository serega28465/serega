package ua.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import ua.dto.form.CommodityForm;
import ua.entity.Category;
import ua.entity.Color;
import ua.entity.Commodity;

public interface CommodityRepository  extends JpaRepository<Commodity, Integer>, JpaSpecificationExecutor<Commodity>{



	@Query("SELECT c FROM Commodity c LEFT JOIN FETCH c.category LEFT JOIN FETCH c.producer")
	List<Commodity> findAll();
	
	@Query(value="SELECT c FROM Commodity c LEFT JOIN FETCH c.category LEFT JOIN FETCH c.producer",
			countQuery="SELECT count(c.id) FROM Commodity c")
	Page<Commodity> findAll(Pageable pageable);



	
	
}
