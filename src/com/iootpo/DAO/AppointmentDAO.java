package com.iootpo.DAO;

import com.iootpo.Model.Appointment;
import com.iootpo.Utils.DBHandlerSingleton;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class AppointmentDAO implements DAOInterface<Appointment> {
    private final EntityManager em = DBHandlerSingleton.getConnection().getEm();

    @Override
    public Appointment get(String id) {
        return em.find(Appointment.class, id);
    }

    @Override
    public List<Appointment> getAll() {
        TypedQuery<Appointment> query =
                em.createQuery("SELECT appointment FROM Dentist appointment", Appointment.class);
        return query.getResultList();

    }

    @Override
    public void create(Appointment object) {
        DBHandlerSingleton.persist(object);
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