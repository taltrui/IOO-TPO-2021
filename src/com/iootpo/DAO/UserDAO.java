package com.iootpo.DAO;

import com.iootpo.Model.User;
import com.iootpo.Utils.DBHandlerSingleton;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class UserDAO implements AbstractDAO<User> {
    private final EntityManager em = DBHandlerSingleton.getConnection().getEm();

    @Override
    public User get(String id) {
        TypedQuery<User> query =
                em.createQuery("SELECT user FROM User user WHERE user.dni like :id", User.class).setParameter("id", id);
        return query.getSingleResult();
    }

    @Override
    public List<User> getAll() {
        TypedQuery<User> query =
                em.createQuery("SELECT user FROM User user", User.class);
        return query.getResultList();

    }

    @Override
    public void create(User object) {
        DBHandlerSingleton.persist(object);
    }

    @Override
    public void createMultiple(List<User> objects) {
        objects.forEach(this::create);
    }

    @Override
    public void delete(User object) {
        DBHandlerSingleton.delete(object);
    }

}
