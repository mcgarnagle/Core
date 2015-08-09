package core;

import javax.persistence.EntityManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import core.entity.User;
import core.persistence.PersistenceManager;

@SpringBootApplication
public class CoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoreApplication.class, args);
		System.out.println("hello");

//		User user = new User();
//		user.setUsername("rick");
//
//		EntityManager em = PersistenceManager.INSTANCE.getEntityManager();
//		em.getTransaction().begin();
//		em.persist(user);
//		em.getTransaction().commit();
//		em.close();
//		PersistenceManager.INSTANCE.close();
//		System.out.println("done");
	}
}
