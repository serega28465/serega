package ua.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.entity.Category;
import ua.entity.Commodity;

public interface CommodityRepository  extends JpaRepository<Commodity, Integer>{

}
