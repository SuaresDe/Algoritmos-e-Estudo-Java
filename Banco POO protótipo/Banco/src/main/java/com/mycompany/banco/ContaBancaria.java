/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;

/**
 *
 * @author ugf030
 */
public abstract class ContaBancaria {
    private String agencia;
    private String conta;
    private int digito;
    private double saldo;
    private Date dataAbertura;
    protected ArrayList<Mov> movs;
    private double VALOR_MINIMO_DEPOSITO = 10.0;
    
      public ContaBancaria(String agencia, String conta, int digito, double saldoInicial) {
        this.agencia = agencia;
        this.conta = conta;
        this.digito = digito;
        this.saldo = saldoInicial;
        this.dataAbertura = new Date();
        
        this.movs = new ArrayList<Mov>();
        
        Mov mov = new Mov("Abertura de conta", saldoInicial);
    
        this.movs.add(mov);
    }
    
    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public int getDigito() {
        return digito;
    }

    public void setDigito(int digito) {
        this.digito = digito;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public Date getDataAbertura() {
        return dataAbertura;
    }
    
    public void depositar(double valor){
        if(valor < VALOR_MINIMO_DEPOSITO) {
            throw new InputMismatchException("O valor minimo de deposito é R$" + VALOR_MINIMO_DEPOSITO);
        }
        //this.saldo = this.saldo + valor;
        this.saldo += valor;
        
        Mov mov = new Mov("Deposito", valor);
        this.movs.add(mov);
    }
    
    public void sacar(double valor) {
        if(valor > this.saldo){
            throw new InputMismatchException("O saldo é insuficiente");
        }
        //this.saldo = this.saldo - valor;
        this.saldo -= valor;
        
        Mov mov = new Mov("Retirada de valor", valor);
        this.movs.add(mov);
        
    }
    
    public void transferir(double valor, ContaBancaria contaDestino){
    
        this.sacar(valor);
        
        contaDestino.depositar(valor);
    }
    
    public abstract void imprimirExtrato();
    
}

