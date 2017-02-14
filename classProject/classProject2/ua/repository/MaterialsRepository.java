package ua.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.entity.Category;
import ua.entity.Material;
import ua.entity.Materials;

public interface MaterialsRepository  extends JpaRepository<Materials, Integer>{

//
//	Materials findByMaterials(Material verh, Material niz, Material obechaika, Material grif);

}
