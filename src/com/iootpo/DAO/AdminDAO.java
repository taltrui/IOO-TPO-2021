package com.iootpo.DAO;

import com.iootpo.Model.Admin;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class AdminDAO implements AbstractDAO<Admin> {
    private final EntityManager em = DBHandler.getConnection().getEm();

    @Override
    public Admin get(String id) {
        TypedQuery<Admin> query =
                em.createQuery("SELECT admin FROM User admin WHERE admin.id like :id", Admin.class).setParameter("id", id);
        return query.getSingleResult();
    }

    @Override
    public List<Admin> getAll() {
        TypedQuery<Admin> query =
                em.createQuery("SELECT admin FROM User admin", Admin.class);
        return query.getResultList();

    }

    @Override
    public void create(Admin object) {
        DBHandler.persist(object);
    }

    @Override
    public void createMultiple(List<Admin> objects) {
        objects.forEach(this::create);
    }

    @Override
    public void delete(Admin object) {
        em.remove(object);
    }

}
