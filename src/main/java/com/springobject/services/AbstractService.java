/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springobject.services;

import com.springobject.models.entity.AbstractEntity;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author joseph Created on Apr 13, 2021, 12:26:29 PM
 * @param <T>
 * @param <ID>
 */
public interface AbstractService<T extends AbstractEntity, ID extends Serializable> {

    public T save(T entity);

    public List<T> save(List<T> entities);

    public List<T> findAll();

    public Optional<T> findById(ID entityId);

    public void deleteById(ID entityId);
}
