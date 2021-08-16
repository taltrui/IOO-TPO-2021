package com.iootpo.DAO;

import javax.persistence.Entity;
import java.util.List;

public interface AbstractDAO<T> {
    T get(String id);

    List<T> getAll();

    void create(T object);

    void createMultiple(List<T> objects);

    void delete(T object);
}
