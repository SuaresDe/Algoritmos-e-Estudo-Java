/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;
import java.util.Date;

public class Mov {
  
    private String descricao;
    private Date data;
    private double valor;
    
    public Mov(String descricao, Double valor) {
        this.descricao = descricao;
        this.data = new Date();
        this.valor = valor;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString(){
        
        String dataFormatada = DataUtil.ConverterDateParaDataEHora(this.getData());
        return this.getDescricao() + " - " + dataFormatada + " - R$" + this.getValor();
        
    }  
}
