/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springobject.models.entity;

import com.springobject.utils.enums.PaymentMethodEnum;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author joseph Created on Apr 13, 2021, 12:41:51 PM
 */
@Entity
@Table(name = "payments")
public class Payment extends AbstractEntity {

    private Double amount;
    @Enumerated(EnumType.STRING)
    private PaymentMethodEnum paymentMethod;
    @OneToOne
    private Payee payee;

    public Payment() {
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public PaymentMethodEnum getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethodEnum paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Payee getPayee() {
        return payee;
    }

    public void setPayee(Payee payee) {
        this.payee = payee;
    }

}
