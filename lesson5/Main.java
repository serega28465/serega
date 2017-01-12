package ua.controller;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import ua.entity.Category;
import ua.entity.Color;
import ua.entity.Commodity;
import ua.entity.Country;
import ua.entity.Material;
import ua.entity.Materials;
import ua.entity.Model;
import ua.entity.Producer;

public class Main {

	public static void main(String[] args) {
		//та сама одиниця з persistence.xml
		final EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("primary");
		//основний інтерфейс для роботи з БД
		final EntityManager em = factory.createEntityManager();
		//почати транзакцію
		em.getTransaction().begin();

		
		
		CriteriaBuilder cb = em.getCriteriaBuilder();
		
		CriteriaQuery<Country> query = cb.createQuery(Country.class);
		
		Root<Country> root = query.from(Country.class);
		query.select(root);
		Expression<String> country = root.get("country");
		Predicate coPredicate = cb.like(country, "U%");
		query.where(coPredicate);
		List<Country> items = em.createQuery(query).getResultList();

		/////////////
		
		CriteriaQuery<Category> query1 = cb.createQuery(Category.class);
		
		Root<Category> root1 = query1.from(Category.class);
		query1.select(root1);
		Expression<String> category = root1.get("category");
		Predicate caPredicate = cb.like(category, "Аккуст%");
		query1.where(caPredicate);
		List<Category> commodity = em.createQuery(query1).getResultList();
		///////
		
		

//		Materials materials = new Materials();
//		materials.setVerh(em.find(Material.class, 2));
//		materials.setObechaika(em.find(Material.class, 3));
//		materials.setNiz(em.find(Material.class, 2));
//		materials.setGrif(em.find(Material.class, 2));
//		em.persist(materials);
//		Material material = new Material();
//		material.setMaterial("Кедр");
//		em.persist(material);
		
//		Commodity commodity = em.createQuery("SELECT c FROM Commodity c JOIN i.category WHERE c.category = :category", Commodity.class)
//				.setParameter("category", "Акустичні")
//				.getResultList();
		
//		List<Commodity> commodity = em.createQuery("SELECT com FROM Commodity com JOIN com.country c WHERE c.country = :country", Commodity.class)
//				.setParameter("country", "Ukraine")
//				.getResultList();
//		
//		List<Commodity> commodity1 = em.createQuery("SELECT com FROM Commodity com JOIN com.category c WHERE c.category = :category", Commodity.class)
//				.setParameter("category", "Класичні гітари")
//				.getResultList();
//		
//		List<Commodity> commodity2 = em.createQuery("SELECT com FROM Commodity com JOIN com.color c WHERE c.color = :color", Commodity.class)
//				.setParameter("color", "Black")
//				.getResultList();
//		
//		List<Commodity> commodity3 = em.createQuery("SELECT com FROM Commodity com JOIN com.model m WHERE m.model = :model", Commodity.class)
//				.setParameter("model", "E 770")
//				.getResultList();
		
//		List<Commodity> commodity4 = em.createQuery("SELECT com FROM Commodity com JOIN com.producer p WHERE p.producer = :_name", Commodity.class)
//				.setParameter("producer", "YAMAHA")
//				.getResultList();
//		List<Commodity> commodity5 = em.createQuery("SELECT com FROM Commodity com JOIN com.materials mat where mat.materials = :materials", Commodity.class)
//				.setParameter("materials", "el")
//				.getResultList();
//		Country country = new Country();
//		country.setCountry("China");
//		em.persist(country);
				
	
//		List<Producer> producers = em.createQuery("SELECT p FROM Producer p WHERE p.id IN (:ids)", Producer.class)
//				.setParameter("ids", Arrays.asList(1,2,3,4,5))
//				.getResultList();
		
		
//		List<Country> countrys = em.createQuery("SELECT con FROM Country con WHERE con.id IN (:ids)", Country.class)
//				.setParameter("country", "Ukr%")
//				.getResultList();
		
//		List<BigDecimal> specificationDigitals = 
//				//просто шукає в діапазоні
//				em.createQuery("SELECT sd FROM SpecificationDigital sd WHERE sd.value BETWEEN :first AND :second")
//				.setParameter("first", new BigDecimal("3.20"))
//				.setParameter("second", new BigDecimal("6.50"))
//				.getResultList();
		
//		Commodity commodity = new Commodity();
//		commodity.setCategory(em.find(Category.class, 1));
//		commodity.setColor(em.find(Color.class, 1));
//		commodity.setCountry(em.find(Country.class, 1));
//		commodity.setMaterials(em.find(Materials.class, 1));
//		commodity.setModel(em.find(Model.class, 1));
//		commodity.setNos(6);
//		commodity.setPrice(null);
//		commodity.setProducer(em.find(Producer.class, 1));
//		commodity.setSize(1);
//		em.persist(commodity);
		
//		Model model = new Model();
//		model.setModel("E 880");
//		em.persist(model);
		
//		Materials materials1 = new Materials();
//		materials1.setGrif("Червоне дерево");
//		materials1.setNiz("el");
//		materials1.setObechaika("Dub");
//		materials1.setVerh("Palisandr");
//		em.persist(materials1);
		
//		Producer producer1 = new Producer();
//		producer1.setName("Trembita");
//		em.persist(producer1);
	
//		Color color1 = new Color();
//		color1.setColor("Natural");
//		em.persist(color1);
	
		
//		Category category1 = new Category();
//		category1.setCategory("Акустичні гітари");
//		em.persist(category1);
//		Category category2 = new Category();
//		category2.setCategory("Класичні гітари");
//		em.persist(category2);
//		Category category3 = new Category();
//		category3.setCategory("Електро гітари");
//		em.persist(category3);
//		Category category4 = new Category();
//		category4.setCategory("Бас-гітари");
//		em.persist(category4);
//		Category category5 = new Category();
//		category5.setCategory("Укулєлє (Гавайські гітари)");
//		em.persist(category5);
//	
		em.getTransaction().commit();
		em.close();
		factory.close();
	}
}
