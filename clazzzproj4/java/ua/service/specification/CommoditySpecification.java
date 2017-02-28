package ua.service.specification;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import ua.dto.filter.BasicFilter;
import ua.dto.filter.CommodityFilter;
import ua.entity.Commodity;



public class CommoditySpecification implements Specification<Commodity>{

	private final CommodityFilter filter;
	
	private final List<Predicate> predicates = new ArrayList<>();
	
	public CommoditySpecification(CommodityFilter filter){
		this.filter = filter;
		
	}
	
	@Override
	public Predicate toPredicate(Root<Commodity> root, CriteriaQuery<?> query,
			CriteriaBuilder cb) {
		fetch(root, query);
		query.distinct(true);
		filterBySearch(root, query, cb);
		filterByPrice(root, query, cb);
		filterByProducer(root,query,cb);
		if(predicates.isEmpty())return null;
		Predicate[] array = new Predicate[predicates.size()];
		predicates.toArray(array);
		return cb.and(array);
	}

	private void filterByPrice(Root<Commodity> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
		// TODO Auto-generated method stub
		
	}

	private void filterByProducer(Root<Commodity> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
		// TODO Auto-generated method stub
		
	}

	private void fetch(Root<Commodity> root, CriteriaQuery<?> query){
		if(query.getResultType()!=Long.class){
			root.fetch("category", JoinType.LEFT);
			root.fetch("producer", JoinType.LEFT);
		}
	}
	
	
	
	private void filterBySearch(Root<Commodity> root, CriteriaQuery<?> query, CriteriaBuilder cb){
		if(!filter.getSearch().isEmpty()){
			predicates.add(cb.like(root.get("name"), filter.getSearch()+"%"));
		}
	}
	
}
