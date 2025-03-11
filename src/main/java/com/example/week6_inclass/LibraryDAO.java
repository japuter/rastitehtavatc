package com.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class LibraryDAO {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("LibraryPU");

    public static void saveEntity(Object entity) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(entity);
        em.getTransaction().commit();
        em.close();
    }

    public static void close() {
        emf.close();
    }
}
