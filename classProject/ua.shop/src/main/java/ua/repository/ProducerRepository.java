package ua.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.entity.Category;
import ua.entity.Producer;

public interface ProducerRepository  extends JpaRepository<Producer, Integer>{

}
