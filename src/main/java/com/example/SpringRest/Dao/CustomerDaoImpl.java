//package com.example.SpringRest.Dao;
//
//import com.example.SpringRest.Entity.Customer;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.PersistenceUnit;
//import javax.persistence.Query;
//
//import org.springframework.stereotype.Repository;
//
//@Repository
//public class CustomerDaoImpl implements  CustomerDao {
//    private EntityManagerFactory entityManagerFactory;
//
//    @PersistenceUnit
//    public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
//        this.entityManagerFactory = entityManagerFactory;
//    }
//
//    @Override
//    public void createCustomer(Customer customer) {
//        EntityManager entityManager = this.entityManagerFactory.createEntityManager();
//        entityManager.getTransaction().begin();
//        entityManager.persist(customer);
//        entityManager.getTransaction().commit();
//    }
//
//    @Override
//    public int remove(Long phoneNo) {
//        EntityManager entityManager = this.entityManagerFactory.createEntityManager();
//        entityManager.getTransaction().begin();
//        int result = 0;
//        try {
//            Customer emp = entityManager.find(Customer.class, phoneNo);
//            entityManager.remove(emp);
//            result = 1;
//            entityManager.getTransaction().commit();
//        } catch (Exception exp) {
//            entityManager.getTransaction().rollback();
//        }
//        entityManager.close();
//        return result;
//    }
//
//    @Override
//    public List<Customer> getAll() {
//        EntityManager entityManager = this.entityManagerFactory.createEntityManager();
//        Query query = entityManager.createQuery("Select c from Customer c");
//        return (List<Customer>) query.getResultList();
//    }
//
//    @Override
//    public void update(Long phoneNo, String firstName) {
//        EntityManager entityManager = this.entityManagerFactory.createEntityManager();
//        entityManager.getTransaction().begin();
//        try {
//            Customer cust = entityManager.find(Customer.class, phoneNo);
//            if (cust != null) {
//                cust.setFirstName(firstName);
//            }
//            entityManager.getTransaction().commit();
//        } catch (Exception exp) {
//            entityManager.getTransaction().rollback();
//        }
//    }
//}
