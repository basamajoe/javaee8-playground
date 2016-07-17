/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javalabs.javaee8playground.model;

/**
 *
 * @author jose
 */
public class Customer extends Person {
    private Integer customerId;

    public Customer(Integer customerId, String firstName, String secondName) {
        super(firstName, secondName);
        this.customerId = customerId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }
}
