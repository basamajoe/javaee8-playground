/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javalabs.javaee8playground;

import com.javalabs.javaee8playground.model.Customer;
import com.javalabs.javaee8playground.model.Person;
import com.oracle.ozark.core.Models;
import javax.inject.Inject;
import javax.mvc.Controller;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Controller
@Path("hello")
public class HelloController {
    
    @Inject
    private Models myModel;
    
    @GET
    public String hello(){
        myModel.put("hello","Hello MVC 1.0");
        myModel.put("person", new Person("Joe", "Black"));
        myModel.put("customer", new Customer(1234,"Joe", "Black2"));
        return "/hello.jsp";
    }
    
    /*@GET
    @View("hello.jsp")
    public void helloo(){
        myModel.put("hello","Hello MVC 1.0");
        myModel.put("person", new Person("Joe", "Black"));
        myModel.put("customer", new Customer(1234,"Joe", "Black2"));
    }
    
    @GET
    public Response hellooo(){
        myModel.put("hello","Hello MVC 1.0");
        myModel.put("person", new Person("Joe", "Black"));
        myModel.put("customer", new Customer(1234,"Joe", "Black2"));
        return Response.status(Response.Status.OK).entity("hello.jsp").build();
    }
    
    @GET
    public Viewable helloooo(){
        myModel.put("hello","Hello MVC 1.0");
        myModel.put("person", new Person("Joe", "Black"));
        myModel.put("customer", new Customer(1234,"Joe", "Black2"));
        return new Viewable("hello.jsp");
    }*/
}
