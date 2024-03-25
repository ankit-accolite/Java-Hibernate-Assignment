package prac.hiberManytoOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import hiberConfig.HiberUtil;

public class App {
  public static void main(String[] args) {
	  SessionFactory sessionFact = HiberUtil.getSessionFactory();
	  Session session = sessionFact.openSession();
	  
	  Project proj1 = new Project("P10k01","Discount_Tour");
	  Project proj2 = new Project("P10k11","WhSmith");
	  Project proj3 = new Project("P10k05","Delhivery");
	  
	  Employee emp1 = new Employee("E001","Ankit","SWE",proj1);
	  Employee emp2 = new Employee("E002","Aan","QA",proj1);

	  Employee emp3 = new Employee("E003","Shreya","SDE",proj2);
	  Employee emp4 = new Employee("E004","Abhishek","Tester",proj2);
	  
	  Employee emp5 = new Employee("E005","Devin","Full-Stack",proj3);
	  
	  session.beginTransaction();
	  session.persist(emp1);
	  session.persist(emp2);
	  session.persist(proj1);
	  
	  session.persist(emp3);
	  session.persist(emp4);
	  session.persist(proj2);
	  
	  session.persist(emp5);
	  session.persist(proj3);
	  
	  session.getTransaction().commit();
	  
	  session.createQuery("from Employee",Employee.class).list().forEach(System.out::println);
  }
}
