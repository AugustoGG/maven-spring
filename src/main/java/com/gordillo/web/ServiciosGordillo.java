/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gordillo.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiciosGordillo {
    
    @Bean
    Persona ejecutarGracia(){
        return new CuentaChistes();
    }
  
    
 }    
