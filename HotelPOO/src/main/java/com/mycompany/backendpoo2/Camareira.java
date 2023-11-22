/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.backendpoo2;

import interfaces.ICamareira;

/**
 *
 * @author ugf030
 */
public class Camareira extends Pessoa implements ICamareira {

    public Camareira(String nome, String telefone, String cpf) {
        super(nome, telefone, cpf);
    }

    @Override
    public void arrumarACama() {
       System.out.println("Cama arrumada!");
       System.out.println();
    }

    @Override
    public void limparQuarto() {
       System.out.println("Quarto limpo!");
       System.out.println();
    }
    
}
