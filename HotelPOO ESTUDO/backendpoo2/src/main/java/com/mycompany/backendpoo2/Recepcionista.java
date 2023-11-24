/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.backendpoo2;

import interfaces.IRecepcionista;


public class Recepcionista extends Pessoa implements IRecepcionista {
    
    public Recepcionista(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
    }

    @Override
    public void atenderTelefone() {
        System.out.println("Telefone atendido!");
        System.out.println();
    }

    @Override
    public void ingles() {
        System.out.println("Requesito atendindo");
        System.out.println();
    }
    
}
