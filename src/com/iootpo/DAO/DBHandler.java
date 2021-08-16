package com.iootpo.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBHandler {
    private static DBHandler dbConnection;
    private static EntityManager em = null;
    private final EntityManagerFactory emf;

    private DBHandler() {
        emf = Persistence.createEntityManagerFactory("$objectdb/db/p2.odb");
        em = emf.createEntityManager();
    }

    public static DBHandler getConnection() {
        if (dbConnection == null) {
            dbConnection = new DBHandler();
        }
        return dbConnection;
    }

    public EntityManager getEm() {
        return em;
    }

    public EntityManagerFactory getEmf() {
        return emf;
    }

    public static void persist(Object object) {
        em.getTransaction().begin();
        em.persist(object);
        em.getTransaction().commit();
    }
}
