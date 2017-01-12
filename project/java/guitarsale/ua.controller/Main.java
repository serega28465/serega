package ua.controller;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ua.entity.Category;
import ua.entity.Color;
import ua.entity.Country;
import ua.entity.Grif;
import ua.entity.Materials;
import ua.entity.Mechanika;
import ua.entity.Producer;
import ua.entity.Size;
import ua.entity.Verh;

public class Main {

	public static void main(String[] args) {
		//та сама одиниця з persistence.xml
				final EntityManagerFactory factory = Persistence
						.createEntityManagerFactory("primary");
				//основний інтерфейс для роботи з БД
				final EntityManager em = factory.createEntityManager();
				//почати транзакцію
				em.getTransaction().begin();
				
				Materials materials = new Materials();
				materials.setGrif(" Нато");
				materials.setNiz(" Нато");
				materials.setObechaika("Окуме");
				materials.setVerh("Цельная ель");
				em.persist(materials);
//				Country country1 = new Country();
//				country1.setCountry("Indonesia");
//				em.persist(country1);
//				Producer producer2 = new Producer();
//				producer2.setName("Sigma Guitars");
//				em.persist(producer2);
//				Size size = new Size();
//				size.setSize("4/4");
//				em.persist(size);
//				Color color = new Color();
//				color.setColor("Натуральний");
//				em.persist(color);
//				Mechanika mechanika = new Mechanika();
//				mechanika.setMechanika("Чорний матовий");
//				em.persist(mechanika);
				
				em.getTransaction().commit();
				em.close();
				factory.close();

	}

}
