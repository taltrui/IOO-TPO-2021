package com.iootpo.DAO;

import com.iootpo.Model.Dentist;
import com.iootpo.Utils.DBHandlerSingleton;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

public class DentistDAO implements DAOInterface<Dentist> {
    private final EntityManager em = DBHandlerSingleton.getConnection().getEm();

    @Override
    public Dentist get(String id) {
        return em.find(Dentist.class, id);
    }

    @Override
    public List<Dentist> getAll() {
        TypedQuery<Dentist> query =
                em.createQuery("SELECT dentist FROM Dentist dentist", Dentist.class);
        return query.getResultList();

    }

    @Override
    public void create(Dentist object) {
        DBHandlerSingleton.persist(object);
    }

    @Override
    public void createMultiple(List<Dentist> objects) {
        objects.forEach(this::create);
    }

    @Override
    public void delete(Dentist object) {
        em.remove(object);
    }

    public void update(Dentist object) {
        Dentist userToUpdate = get(object.getRegistration());
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        userToUpdate.setFirstname(object.getFirstName());
        userToUpdate.setLastName(object.getLastName());
        tx.commit();
    }
}