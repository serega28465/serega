package ua.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import ua.entity.Category;
import ua.entity.Color;
import ua.service.specification.ColorSpecification;

public interface ColorRepository  extends JpaRepository<Color, Integer>, JpaSpecificationExecutor<Color>{

	Color findByColor(String color);


}
