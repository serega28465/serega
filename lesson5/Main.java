package ua.controller;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ua.entity.Category;
import ua.entity.Color;
import ua.entity.Commodity;
import ua.entity.Country;
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
	
		List<Producer> producers = em.createQuery("SELECT p FROM Producer p WHERE p.id IN (:ids)", Producer.class)
				.setParameter("ids", Arrays.asList(1,2,3,4,5))
				.getResultList();
		
		
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
//		model.setModel("E 550");
//		em.persist(model);
		
//		Materials materials1 = new Materials();
//		materials1.setGrif("Червоне дерево");
//		materials1.setNiz("el");
//		materials1.setObechaika("Dub");
//		materials1.setVerh("Palisandr");
//		em.persist(materials1);
		
//		Producer producer1 = new Producer();
//		producer1.setName("YAMAHA");
//		em.persist(producer1);
	
//		Color color1 = new Color();
//		color1.setColor("Black");
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
	
		em.getTransaction().commit();
		em.close();
		factory.close();
	}
}
