/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springobject.controllers;

import com.springobject.services.PaymentService;
import com.springobject.utils.BaseUrl;
import com.springobject.utils.payload.request.PaymentPostDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author joseph Created on Apr 13, 2021, 12:41:13 PM
 */
@RestController
@RequestMapping(value = BaseUrl.BASE_URL + "payments")
public class PaymentController {

    private final PaymentService paymentService;

    @Autowired
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody PaymentPostDto postDto) {
        return ResponseEntity.ok(paymentService.save(postDto));
    }

    @GetMapping
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(paymentService.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> findById(@PathVariable(name = "id", required = true) Long id) {
        return ResponseEntity.ok(paymentService.findById(id));
    }

}
