package ua.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ua.entity.Category;
import ua.entity.Producer;

public interface ProducerRepository  extends JpaRepository<Producer, Integer>{

//	@Query("SELECT p FROM Producer p LEFT JOIN FETCH p.producer WHERE p.id=:id")
//	Producer findOne(@Param("id")int id);
}
