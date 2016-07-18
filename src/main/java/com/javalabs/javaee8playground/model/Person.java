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
public class Person {
    private String firstname;
    private String secondname;

    public Person(String firstname, String secondname) {
        this.firstname = firstname;
        this.secondname = secondname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }
       
}
