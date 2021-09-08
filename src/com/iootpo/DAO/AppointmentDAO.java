package com.iootpo.DAO;

import com.iootpo.Model.Appointment;
import com.iootpo.Model.Dentist;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class AppointmentDAO implements AbstractDAO<Appointment> {
    private final EntityManager em = DBHandler.getConnection().getEm();

    @Override
    public Appointment get(String id) {
        TypedQuery<Appointment> query =
                em.createQuery("SELECT appointment FROM Appointment appointment WHERE appointment.id like :id", Appointment.class).setParameter("id", id);
        return query.getSingleResult();
    }

    @Override
    public List<Appointment> getAll() {
        TypedQuery<Appointment> query =
                em.createQuery("SELECT appointment FROM Dentist appointment", Appointment.class);
        return query.getResultList();

    }

    @Override
    public void create(Appointment object) {
        DBHandler.persist(object);
    }

    @Override
    public void createMultiple(List<Appointment> objects) {
        objects.forEach(this::create);
    }

    @Override
    public void delete(Appointment object) {
        em.remove(object);
    }

}