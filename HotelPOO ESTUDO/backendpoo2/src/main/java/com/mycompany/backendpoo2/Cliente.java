/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.backendpoo2;

/**
 *
 * @author ugf030
 */
public class Cliente extends Pessoa {
    
    private int idade;
    
       public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public Cliente(String nome, String telefone, String cpf, int idade) {
        super(nome, telefone, cpf);
        this.idade = idade;
    }
    
}
