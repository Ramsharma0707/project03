package in.co.rays.project_3.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate DataSource is provides the object of sessionfactory and session
 * 
 * @author Ram Sharma
 * 
 */
public class HibDataSource {
	private static SessionFactory sessionFactory = null;// sessionfactory ka obj banaya

	public static SessionFactory getSessionFactory() {//session factory ko get kiya

		if (sessionFactory == null) {
			sessionFactory = new Configuration().configure().buildSessionFactory();
		}
		return sessionFactory;
	}

	public static Session getSession() {//session ko get kiya

		Session session = getSessionFactory().openSession();
		return session;

	}

	public static void closeSession(Session session) {
		
		if (session != null) {
			session.close();
		}
	}
}
