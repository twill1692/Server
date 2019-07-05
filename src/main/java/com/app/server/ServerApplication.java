package com.app.server;
import com.app.player.PlayerEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServerApplication {
	private static SessionFactory seshFac;
	private static Transaction trans = null;

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
		
		try {
			Configuration config = new Configuration();
			seshFac = config.configure().buildSessionFactory();
		} catch (Throwable e) {
			System.err.println("Error in creating SessionFactory object." + e.getMessage());
			throw new ExceptionInInitializerError(e);
		}

		Session sesh = seshFac.openSession();

		try {
		trans = sesh.beginTransaction();
		PlayerEntity player = new PlayerEntity("Bob", "Ross");
		sesh.save(player);
		trans.commit();
		} catch (Exception e) {
			if (trans != null){
				 trans.rollback();
			System.err.println("Transaction error: " + e.getMessage());
			}
		} finally {
			sesh.close();
			seshFac.close();
		}
	}
}
