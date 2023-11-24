/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.backendpoo2;

public enum EnumTipo {

    BASICO("Básico"), MASTER("Master"), PRESIDENCIAL("Presidencial");
    
    private String valor;
    
    private EnumTipo(String valor){
        this.valor = valor;
    }
    
    public String getValor() {
        return valor;
    }
}
