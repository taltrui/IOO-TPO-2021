package com.iootpo.DAO;

import java.util.List;

public interface DAOInterface<T> {
    T get(String id);

    List<T> getAll();

    void create(T object);

    void delete(T object);
}
