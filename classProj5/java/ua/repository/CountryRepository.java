package ua.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ua.entity.Category;
import ua.entity.Country;

public interface CountryRepository  extends JpaRepository<Country, Integer>,   JpaSpecificationExecutor<Country>{

//	@Query("SELECT c FROM Country c LEFT JOIN FETCH c.country WHERE c.id=:id")
//	Country findOne(@Param("id")int id);
	
	Country findByCountry(String country);
}
