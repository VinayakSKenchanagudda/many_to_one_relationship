package many_to_one_uni.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import many_to_one__uni.dto.School;
import many_to_one__uni.dto.Students;
import many_to_one__uni.dto.Teachers;
import many_to_one_uni.dao.SchoolDao;
import many_to_one_uni.dao.StudentDeo;

public class MainSchool {
public static void main(String[] args) {
//	Students s1=new Students();
//	s1.setName("smith");
//	s1.setStandard(10);
//	
//	Students s2=new Students();
//	s2.setName("martin");
//	s2.setStandard(3);
//	
//
//	Students s3=new Students();
//	s3.setName("ramu");
//	s3.setStandard(12);
//	
//	Teachers t1=new Teachers();
//	t1.setName("shella");
//	t1.setSalary(10000);
//	t1.setSubject("biology");
//	
//	Teachers t2=new Teachers();
//	t2.setName("mala");
//	t2.setSalary(10040);
//	t2.setSubject("ziology");
//	
//	Teachers t3=new Teachers();
//	t3.setName("shella");
//	t3.setSalary(10000);
//	t3.setSubject("biology");
//	
//	School school=new School();
//	school.setName("basaweswar");
//	school.setAddress("mrcolony");
//	school.setLocation("karnataka");
//	
//	s1.setSchool(school);
//	s2.setSchool(school);
//	s3.setSchool(school);
//	t1.setSchool(school);
//	t2.setSchool(school);
//	t3.setSchool(school);
//	
//	List<Students> studentsList=new ArrayList<Students>();
//	studentsList.add(s1);
//	studentsList.add(s2);
//	studentsList.add(s3);
//	
//	List<Teachers> teachersList=new ArrayList<Teachers>();
//	teachersList.add(t1);
//	teachersList.add(t2);
//	teachersList.add(t3);
//	SchoolDao  dao=new SchoolDao();
//	dao.saveSchool(studentsList, teachersList);
//	SchoolDao  dao=new SchoolDao();
//	dao.deleteSchool(1);
	//main
//	School school=new School();
//	school.setName("basaweswar");
//	school.setAddress("mrcolony");
//	school.setLocation("karnataka");
//	SchoolDao  dao=new SchoolDao();
//	dao.saveSchool(school);
	
//	Students s1=new Students();
//	s1.setName("smith");
//	s1.setStandard(10);
//	StudentDeo deoStudent=new StudentDeo();
//	deoStudent.saveStudent(s1, 1);
	
	Teachers t1=new Teachers();
	t1.setName("shella");
	t1.setSalary(10000);
	t1.setSubject("biology");
}
}
