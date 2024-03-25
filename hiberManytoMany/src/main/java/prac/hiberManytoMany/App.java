package prac.hiberManytoMany;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import hiberConfig.HiberUtil;

public class App {
  public static void main(String[] args) {
	  SessionFactory sessionFact = HiberUtil.getSessionFactory();
	  Session session = sessionFact.openSession();
	  
	  Student std1 = new Student(1001,"Ankit","2022-24");
	  Student std2 = new Student(1002,"Arul","2022-24");
	  
	  Assignment asg1 = new Assignment("B00k11","System Design");
	  Assignment asg2 = new Assignment("B00K12","OS");
	  
	  List<Assignment> list1 = new ArrayList<>();
	  list1.add(asg1);
	  
	  List<Assignment> list2 = new ArrayList<>();
	  list2.add(asg1);
	  list2.add(asg2);
	  
	  std1.setAssignments(list1);
	  std2.setAssignments(list2);
	  
	  List<Student> stdlist1 = new ArrayList<>();
	  stdlist1.add(std1);
	  stdlist1.add(std2);
	  
	  List<Student> stdlist2 = new ArrayList<>();
	  stdlist2.add(std2);
	  
	  asg1.setStudents(stdlist1);
	  asg2.setStudents(stdlist2);
	  
	  session.beginTransaction();
	  session.persist(std1);
	  session.persist(std2);
	  
	  session.persist(asg1);
	  session.persist(asg2);
	  
	  session.getTransaction().commit();
	  
	  session.createQuery("from Student",Student.class).list().forEach(System.out::println);
	  
	  session.close();
  }
}
