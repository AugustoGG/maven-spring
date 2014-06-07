/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gordillo.web;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class ProbarPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    ApplicationContext ctx=new AnnotationConfigApplicationContext(ServiciosGordillo.class);    
    Persona p=ctx.getBean(Persona.class);
    System.out.println(p.ejecutarGracia());
    }
    
}
