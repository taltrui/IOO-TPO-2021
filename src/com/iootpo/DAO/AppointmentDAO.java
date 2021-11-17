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
                em.createQuery("SELECT appointment FROM Appointment appointment", Appointment.class);
        return query.getResultList();

    }

    @Override
    public void create(Appointment object) {
        DBHandlerSingleton.persist(object);
    }

    @Override
    public void delete(Appointment object) {
        em.remove(object);
        em.clear();
    }

    public List<Appointment> getAllByDentistAndDay(String registration, String selectedDay) {
        TypedQuery<Appointment> query =
                em.createQuery("SELECT appointment FROM Appointment appointment WHERE appointment.dentistId like :id and appointment.day like :day", Appointment.class).setParameter("id", registration).setParameter("day", selectedDay);
        return query.getResultList();
    }

    public List<Appointment> getAllByDentist(String registration) {
        TypedQuery<Appointment> query =
                em.createQuery("SELECT appointment FROM Appointment appointment WHERE appointment.dentistId like :id", Appointment.class).setParameter("id", registration);
        return query.getResultList();
    }
}