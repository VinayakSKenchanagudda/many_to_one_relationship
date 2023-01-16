package many_to_one_uni.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import many_to_one__uni.dto.School;
import many_to_one__uni.dto.Students;

public class StudentDeo {

	public EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinayak");
		return entityManagerFactory.createEntityManager();
	}
	
	public void saveStudent(Students students,int school_id) {
		EntityManager entityManager=getEntityManager(); 
		EntityTransaction entityTransaction=entityManager.getTransaction();
		School school= entityManager.find(School.class, school_id);
		students.setSchool(school);
		entityTransaction.begin();
		entityManager.persist(students);
		entityTransaction.commit();
	}
}
