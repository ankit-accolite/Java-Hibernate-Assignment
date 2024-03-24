package prac.hiberOnetoOne;

import org.hibernate.*;

import hiberConfig.HiberUtil;

public class App {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    SessionFactory sessionFact = HiberUtil.getSessionFactory();
    Session session = sessionFact.openSession();
    
    Artist artist1 = new Artist(1003,"Amit Gaur");
    Painting paint1 = new Painting(3,2000,artist1);
      
    Artist artist2 = new Artist(1004,"Haven Gor");
    Painting paint2 = new Painting(4,8000,artist2);
    
    session.beginTransaction();
    session.persist(paint1);
    session.persist(artist1);

    session.persist(paint2);
    session.persist(artist2);
   
    
    session.getTransaction().commit();
    
    session.createQuery("from Painting",Painting.class).list().forEach(System.out::println);
    
    session.close();
  }
}
