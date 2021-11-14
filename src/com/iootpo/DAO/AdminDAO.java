package com.iootpo.DAO;

import com.iootpo.Model.Admin;
import com.iootpo.Utils.DBHandlerSingleton;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class AdminDAO implements DAOInterface<Admin> {
    private final EntityManager em = DBHandlerSingleton.getConnection().getEm();

    @Override
    public Admin get(String id) {
        return em.find(Admin.class, id);
    }

    @Override
    public List<Admin> getAll() {
        TypedQuery<Admin> query =
                em.createQuery("SELECT admin FROM Admin admin", Admin.class);
        return query.getResultList();

    }

    @Override
    public void create(Admin object) {
        DBHandlerSingleton.persist(object);
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
