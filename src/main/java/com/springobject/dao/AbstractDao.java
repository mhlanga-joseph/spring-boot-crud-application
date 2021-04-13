/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.springobject.dao;

import com.springobject.models.entity.AbstractEntity;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 *
 * @author joseph
 * Created on Apr 13, 2021, 12:25:57 PM
 * @param <T>
 * @param <ID>
 */
@NoRepositoryBean
public interface AbstractDao<T extends AbstractEntity, ID extends Serializable> extends JpaRepository<T, ID>{

}
