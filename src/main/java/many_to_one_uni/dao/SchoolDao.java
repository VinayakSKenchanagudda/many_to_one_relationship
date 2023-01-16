package many_to_one_uni.dao;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import many_to_one__uni.dto.School;
import many_to_one__uni.dto.Students;
import many_to_one__uni.dto.Teachers;

public class SchoolDao {

	public EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vinayak");
		return entityManagerFactory.createEntityManager();
	}
	
//	public void saveSchool(List<Students> studentList,List<Teachers> teacherList)
//	{
//		EntityManager entityManager=getEntityManager(); 
//		EntityTransaction entityTransaction=entityManager.getTransaction();
//		entityTransaction.begin();
//		for(Students students:studentList)
//		{
//			entityManager.persist(students.getSchool());
//			entityManager.persist(students);
//		}
//		for(Teachers teachers:teacherList)
//		{
//			entityManager.persist(teachers.getSchool());
//			entityManager.persist(teachers);
//		}
//		entityTransaction.commit();
//	}
//	
//	public void updateSchool(int id,School school)
//	{
//		EntityManager entityManager=getEntityManager(); 
//		EntityTransaction entityTransaction=entityManager.getTransaction();
//		School recoveryschool= entityManager.find(School.class,id);
//		if(recoveryschool !=null)
//		{
//			recoveryschool.setId(id);
//			entityTransaction.begin();
//			entityManager.merge(recoveryschool);
//			entityTransaction.commit(); 
//		}
//		else {
//			System.out.println("school not found and ");
//		}
//	}
//	public void deleteSchool(int id)
//	{
//		EntityManager entityManager=getEntityManager(); 
//		EntityTransaction entityTransaction=entityManager.getTransaction();
//		School recoveryschool= entityManager.find(School.class,id);
//		if(recoveryschool !=null)
//		{
//			recoveryschool.setId(1);
//			entityTransaction.begin();
//			entityManager.remove(recoveryschool);
//			entityTransaction.commit();
//		}
//		else {
//			System.out.println("school not found");
//		}
//	}
//	
	
	public void saveSchool(School school)
	{
		EntityManager entityManager=getEntityManager(); 
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(school);
		entityTransaction.commit();
	}
	
}
