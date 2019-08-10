package com.app.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionUtility {
    private static SessionFactory sessionFac;
    private static Session session;
    private static Configuration config;

    public static Session getSession() {
        try {
            config = new Configuration();
            sessionFac = config.configure().buildSessionFactory();
        } catch (Throwable e) {
            System.err.println("Error in creating SessionFactory object." + e.getMessage());
            throw new ExceptionInInitializerError(e);
        }

        session = sessionFac.openSession();
        return session;
    }
}
