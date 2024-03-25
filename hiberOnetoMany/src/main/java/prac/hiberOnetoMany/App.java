package prac.hiberOnetoMany;

import org.hibernate.*;
import java.util.*;

import hiberConfig.HiberUtil;

public class App {
  public static void main(String[] args) {
    SessionFactory sessionFact = HiberUtil.getSessionFactory();
    Session session = sessionFact.openSession();
    
    Account acc1 = new Account("BKI0001011","Savings","Priority");
    Account acc2 = new Account("BKI0001047","Current","Business");
    
    Account acc3 = new Account("BKI0001055","Savings","Priority");
    
    Account acc4 = new Account("BKI0001051","Demat","Priority");
    Account acc5 = new Account("BKI0001057","Savings","Normal");
    Account acc6 = new Account("BKI0001058","Current","Business");

    List<Account> list1 = new ArrayList<>();
    list1.add(acc1);
    list1.add(acc2);

    List<Account> list2 = new ArrayList<>();
    list2.add(acc3);
    
    List<Account> list3 = new ArrayList<>();
    list3.add(acc4);
    list3.add(acc5);
    list3.add(acc6);
    
    Customer cust1 = new Customer("A0101501","Ankit","15-03-2002",list1);
    Customer cust2 = new Customer("A0101502","Amit","10-02-2000",list2);
    Customer cust3 = new Customer("A0101503","Aryan","02-11-2001",list3);
    session.beginTransaction();
    session.persist(cust1);
    session.persist(cust2);
    session.persist(cust3);
    session.persist(acc1);
    session.persist(acc2);
    session.persist(acc3);
    session.persist(acc4);
    session.persist(acc5);
    session.persist(acc6);
    session.getTransaction().commit();

    System.out.println("Displaying Table : ");
    session.createQuery("from Customer",Customer.class).list().forEach(System.out::println);
    session.close();
  
  }
}
