package hiberConfig;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import prac.hiberCRUD.Laptop;

public class HiberConfig {
	public static SessionFactory getSessionFactory()
	{
		Configuration config = new Configuration();
		SessionFactory sessionFact = null;
		
		Properties settings = new Properties();
		settings.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
		settings.put(Environment.URL,"jdbc:mysql://localhost:3306/Laptop");
		settings.put(Environment.USER,"root");
		settings.put(Environment.PASS,"123456");
		
		settings.put(Environment.SHOW_SQL,"true");
		settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
        settings.put(Environment.HBM2DDL_AUTO, "create-drop");
		
		config.setProperties(settings);
		config.addAnnotatedClass(Laptop.class);
		
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
	                .applySettings(config.getProperties()).build();

		sessionFact = config.buildSessionFactory(serviceRegistry);

		
		return sessionFact;
	}
}
