package com.iootpo.DAO;

import com.iootpo.Model.User;
import com.iootpo.Utils.DBHandlerSingleton;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

public class UserDAO implements AbstractDAO<User> {
    private final EntityManager em = DBHandlerSingleton.getConnection().getEm();

    @Override
    public User get(String id) {
        return em.find(User.class, id);
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

    public void update(User object) {
        User userToUpdate = get(object.getDni());
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        userToUpdate.setAddress(object.getAddress());
        userToUpdate.setPassword(object.getPassword());
        tx.commit();
    }

}
