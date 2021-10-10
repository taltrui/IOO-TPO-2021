package com.iootpo.DAO;

import com.iootpo.Model.Dentist;
import com.iootpo.Utils.DBHandlerSingleton;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class DentistDAO implements AbstractDAO<Dentist> {
    private final EntityManager em = DBHandlerSingleton.getConnection().getEm();

    @Override
    public Dentist get(String id) {
        TypedQuery<Dentist> query =
                em.createQuery("SELECT dentist FROM Dentist dentist WHERE dentist.id like :id", Dentist.class).setParameter("id", id);
        return query.getSingleResult();
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

}