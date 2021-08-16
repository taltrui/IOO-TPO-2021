package com.iootpo.DAO;

import com.iootpo.Model.User;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class UserDAO implements AbstractDAO<User> {
    private final EntityManager em = DBHandler.getConnection().getEm();

    @Override
    public User get(String id) {
        TypedQuery<User> query =
                em.createQuery("SELECT user FROM User user WHERE user.userName like :id", User.class).setParameter("id", id);
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
        DBHandler.persist(object);
    }

    @Override
    public void createMultiple(List<User> objects) {

    }

    @Override
    public void delete(User object) {

    }

}
