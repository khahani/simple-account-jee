package com.khahani.demo.persist;

import com.khahani.demo.account.Record;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class RecordStorage {
    private SessionFactory factory;

    public RecordStorage() {
        try {
            factory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public int add(Record r) {
        Session session;
        try{
            session = factory.getCurrentSession();
        }catch (HibernateException e){
            session = factory.openSession();
        }

        Transaction tx = null;
        Integer recordID = null;

        try {
            tx = session.beginTransaction();
            RecordEntity record = new RecordEntity();
            record.setDay(r.getDay());
            record.setMonth(r.getMonth());
            record.setDescription(r.getDescription());
            record.setAmount(r.getAmount());
            record.setStatus(r.getStatus());
            record.setTime(r.getTime());
            recordID = (Integer) session.save(record);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return null == recordID ? -1 : recordID;
    }
}
