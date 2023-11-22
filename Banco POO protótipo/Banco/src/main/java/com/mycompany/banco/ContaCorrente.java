/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

import java.util.Date;

/**
 *
 * @author ugf030
 */
public class ContaCorrente extends ContaBancaria {
    
    public ContaCorrente(String agencia, String conta, int digito, double saldoInicial) {
        super(agencia, conta, digito, saldoInicial);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println();
        System.out.println("*********************************************");
        System.out.println("************* Extrato Bancario **************");
        System.out.println("*********************************************");
        System.out.println();
        
        System.out.println("Gerado em: " + DataUtil.ConverterDateParaDataEHora(new Date()));
        System.out.println();
        
        for(Mov mov : this.movs) {
            
            System.out.println(mov);
        }
        System.out.println();
        System.out.println("*********************************************");
        System.out.println("*********************************************");
        System.out.println("*********************************************");
    }
    
}
