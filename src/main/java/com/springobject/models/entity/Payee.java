/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springobject.models.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author joseph Created on Apr 13, 2021, 12:44:09 PM
 */
@Entity
@Table(name = "payees")
public class Payee extends AbstractEntity {

    private String firstName;
    private String lastName;
    private String email;
    private Integer phoneNumber;

    public Payee() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
