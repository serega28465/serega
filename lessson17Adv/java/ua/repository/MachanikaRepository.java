package ua.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.entity.Category;
import ua.entity.Mechanika;

public interface MachanikaRepository  extends JpaRepository<Mechanika, Integer>{

}
