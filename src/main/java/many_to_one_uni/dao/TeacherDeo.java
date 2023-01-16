package many_to_one_uni.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import many_to_one__uni.dto.School;
import many_to_one__uni.dto.Students;
import many_to_one__uni.dto.Teachers;

public class TeacherDeo {
	public EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinayak");
		return entityManagerFactory.createEntityManager();
	}
	
	public void saveTeacher(Teachers teacher,int school_id) {
		EntityManager entityManager=getEntityManager(); 
		EntityTransaction entityTransaction=entityManager.getTransaction();
		School school= entityManager.find(School.class, school_id);
		teacher.setSchool(school);
		entityTransaction.begin();
		entityManager.persist(teacher);
		entityTransaction.commit();
	}
}
