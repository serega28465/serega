package ua.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.entity.Category;
import ua.entity.Color;

public interface ColorRepository  extends JpaRepository<Color, Integer>{

}
