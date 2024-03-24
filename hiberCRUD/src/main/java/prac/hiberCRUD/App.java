package prac.hiberCRUD;

import org.hibernate.*;

import hiberConfig.HiberConfig;

public class App {
  public static void main(String[] args) {
    Laptop l1 = new Laptop("Pavellion");
    Laptop l2 = new Laptop("A-Series");
    SessionFactory sessionFact = HiberConfig.getSessionFactory();
    Session session = sessionFact.openSession();
    

    session.beginTransaction();
    session.persist(l1);
    session.persist(l2);
    session.getTransaction().commit();
    
    System.out.println("Table after Insertion : ");
    session.createQuery("from Laptop",Laptop.class).list().forEach(System.out::println);

    session.beginTransaction();
    session.remove(l1);
    session.getTransaction().commit();
    System.out.println("Table after Deletion : ");
    session.createQuery("from Laptop",Laptop.class).list().forEach(System.out::println);
    
    session.beginTransaction();
    l2.setModel("Narzo-Series");
    session.merge(l2);
    session.getTransaction().commit();
    System.out.println("Table after Updation : ");
    session.createQuery("from Laptop",Laptop.class).list().forEach(System.out::println);
    
    
    session.close();
  }
}
