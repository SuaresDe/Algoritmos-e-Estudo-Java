/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.backendpoo2;
import interfaces.IRecepcionista;
import interfaces.ICamareira;

public class Gerente extends Pessoa implements IRecepcionista, ICamareira {
    
    public Gerente(String nome, String telefone, String cpf){
        
        super(nome, telefone, cpf);
        
    }

    @Override
    public void atenderTelefone() {
        System.out.println("Telefone atendido pelo gerente!");
        System.out.println();
    }

    @Override
    public void ingles() {
        System.out.println("Requisito atendido!");
        System.out.println();
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
        
   
        
    