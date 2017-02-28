package ua.service.specification;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import ua.dto.filter.BasicFilter;
import ua.entity.Category;
import ua.entity.Material;
import ua.entity.Materials;

public class MaterialsSpecification implements Specification<Materials>{

private final BasicFilter filter;
	
private final List<Predicate> predicates = new ArrayList<>();
	public MaterialsSpecification(BasicFilter filter) {
		this.filter = filter;
	}

	private void fetch(Root<Materials> root, CriteriaQuery<?> query){
		if(query.getResultType()!=Long.class){
			root.fetch("material", JoinType.LEFT);
		}
	}
	
	@Override
	public Predicate toPredicate(Root<Materials> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
		fetch(root,query);
		if(filter.getSearch().isEmpty()) return null;
		return cb.like(root.get("materials"), filter.getSearch()+"%");
	}
	
}
