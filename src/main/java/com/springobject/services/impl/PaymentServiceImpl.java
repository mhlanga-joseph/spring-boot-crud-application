/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springobject.services.impl;

import com.springobject.dao.AbstractDao;
import com.springobject.dao.PayeeDao;
import com.springobject.dao.PaymentDao;
import com.springobject.models.entity.Payee;
import com.springobject.models.entity.Payment;
import com.springobject.services.PaymentService;
import com.springobject.utils.payload.request.PaymentPostDto;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author joseph Created on Apr 13, 2021, 12:49:28 PM
 */
@Service
@Transactional
public class PaymentServiceImpl extends AbstractServiceImpl<Payment, Long> implements PaymentService {

    private final PaymentDao paymentDao;
    @Autowired
    private PayeeDao payeeDao;

    @Autowired
    public PaymentServiceImpl(PaymentDao paymentDao) {
        super(paymentDao);
        this.paymentDao = paymentDao;
    }

    @Override
    public Payment save(PaymentPostDto postDto) {
        Payment payment = new Payment();
        payment.setAmount(postDto.getAmount());
        payment.setPaymentMethod(postDto.getPaymentMethod());
        Payee payee = new Payee();
        payee.setFirstName(postDto.getFirstName());
        payee.setLastName(postDto.getLastName());
        payee.setEmail(postDto.getEmail());
        payee = payeeDao.save(payee); // managed entity
        payment.setPayee(payee);
        payment = paymentDao.save(payment);
        return payment;
    }

}
