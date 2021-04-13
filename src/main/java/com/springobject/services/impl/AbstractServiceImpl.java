/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springobject.services.impl;

import com.springobject.dao.AbstractDao;
import com.springobject.models.entity.AbstractEntity;
import com.springobject.services.AbstractService;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Component;

/**
 *
 * @author joseph Created on Apr 13, 2021, 12:26:37 PM
 * @param <T>
 * @param <ID>
 */
@Component
public abstract class AbstractServiceImpl<T extends AbstractEntity, ID extends Serializable> implements AbstractService<T, ID> {

    private final AbstractDao<T, ID> abstractDao;

    public AbstractServiceImpl(AbstractDao<T, ID> abstractDao) {
        this.abstractDao = abstractDao;
    }

    @Override
    public T save(T entity) {
        return abstractDao.save(entity);
    }

    @Override
    public List<T> save(List<T> entities) {
        entities
                .stream()
                .forEach(entity -> abstractDao.save(entity));
        return entities;
    }

    @Override
    public List<T> findAll() {
        return abstractDao.findAll();
    }

    @Override
    public Optional<T> findById(ID entityId) {
        return abstractDao.findById(entityId);
    }

    @Override
    public void deleteById(ID entityId) {
        abstractDao.deleteById(entityId);
    }

}
