package com.app.service;

import java.util.List;

public interface BaseService<D, K> {

    List<D> findAll();
    D findById(K id);
    D insert(D d);
    D update(D d);
    boolean deleteById(K id);

}
