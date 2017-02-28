package ua.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import ua.entity.Category;
import ua.entity.Size;
import ua.service.specification.SizeSpecification;

public interface SizeRepository  extends JpaRepository<Size, Integer>, JpaSpecificationExecutor<Size>{

	Size findBySize(String size);


	
}
