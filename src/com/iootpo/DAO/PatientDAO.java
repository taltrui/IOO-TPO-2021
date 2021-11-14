package com.iootpo.DAO;

import com.iootpo.Model.Patient;
import com.iootpo.Utils.DBHandlerSingleton;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

public class PatientDAO implements AbstractDAO<Patient> {
    private final EntityManager em = DBHandlerSingleton.getConnection().getEm();

    @Override
    public Patient get(String id) {
        return em.find(Patient.class, id);
    }

    @Override
    public List<Patient> getAll() {
        TypedQuery<Patient> query =
                em.createQuery("SELECT user FROM Patient user", Patient.class);
        return query.getResultList();

    }

    @Override
    public void create(Patient object) {
        DBHandlerSingleton.persist(object);
    }

    @Override
    public void createMultiple(List<Patient> objects) {
        objects.forEach(this::create);
    }

    @Override
    public void delete(Patient object) {
        DBHandlerSingleton.delete(object);
    }

    public void update(Patient object) {
        Patient patientToUpdate = get(object.getUserName());
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        patientToUpdate.setAddress(object.getAddress());
        patientToUpdate.setPassword(object.getPassword());
        tx.commit();
    }

}
