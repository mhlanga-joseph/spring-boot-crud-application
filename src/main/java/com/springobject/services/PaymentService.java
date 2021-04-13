/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springobject.services;

import com.springobject.models.entity.Payment;
import com.springobject.utils.payload.request.PaymentPostDto;

/**
 *
 * @author joseph Created on Apr 13, 2021, 12:49:21 PM
 */
public interface PaymentService extends AbstractService<Payment, Long> {

    public Payment save(PaymentPostDto postDto);
}
