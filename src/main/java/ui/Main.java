package ui;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import pojo.Actor;
import repository.HibernateUtil;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        EntityManager entityManager = HibernateUtil.getEntityManager();
        Actor bradPitt = new Actor();
        bradPitt.setFirstName("Brad");
        bradPitt.setLastName("Pitt");
        bradPitt.setNationality("american");
        bradPitt.setDateOfBirth(LocalDate.of(1963,12,18));

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(bradPitt);
        transaction.commit();

    }
}
