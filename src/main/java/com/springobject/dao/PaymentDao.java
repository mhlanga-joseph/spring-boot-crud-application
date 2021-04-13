/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.springobject.dao;

import com.springobject.models.entity.Payment;
import org.springframework.stereotype.Repository;

/**
 *
 * @author joseph
 * Created on Apr 13, 2021, 12:51:15 PM
 */
@Repository
public interface PaymentDao extends AbstractDao<Payment, Long>{

}
