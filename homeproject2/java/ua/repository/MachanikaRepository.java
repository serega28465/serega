package ua.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import ua.entity.Category;
import ua.entity.Mechanika;

public interface MachanikaRepository  extends JpaRepository<Mechanika, Integer>, JpaSpecificationExecutor<Mechanika>{

	Mechanika findByMechanika(String mechanika);
	
}
