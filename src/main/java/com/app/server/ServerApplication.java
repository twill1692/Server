package com.app.server;
import com.app.player.PlayerEntity;
import com.app.utility.SessionUtility;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.app"})
public class ServerApplication {
	private static Transaction transaction = null;
	private static Session session;

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);

		session = SessionUtility.getSession();
		try {
		transaction = session.beginTransaction();
		PlayerEntity player = new PlayerEntity("Bob", "Ross");
		session.save(player);
		transaction.commit();
		} catch (Exception e) {
			if (transaction != null){
				 transaction.rollback();
			System.err.println("Transaction error: " + e.getMessage());
			}
		} finally {
			session.close();
		}
	}
}
