/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.banco;

/**
 *
 * @author ugf030
 */
public class Banco {

    public static void main(String[] args) {
        
        System.out.println("Banco Digital");
        System.out.println("");
        
        ContaCorrente conta = new ContaCorrente("0001", "1234", 5, 100.0);
        
        System.out.println("Saldo atual R$: " + conta.getSaldo());
        System.out.println();
        
        conta.depositar(250.0);
        System.out.println("Saldo atual R$: " + conta.getSaldo());
        System.out.println();
         
        conta.sacar(150.0);
        System.out.println("Saldo atual R$: " + conta.getSaldo());
        System.out.println();
        
        ContaPoupanca conta2 = new ContaPoupanca("0001", "4321", 6, 200.0);
        
        
        
        System.out.println("Saldo atual da conta 2 R$: " + conta2.getSaldo());
        System.out.println();
        conta2.transferir(100, conta);
        System.out.println("Saldo atual da conta 2 R$: " + conta2.getSaldo());
        System.out.println();
        
        System.out.println("Saldo atual R$: " + conta.getSaldo());
        System.out.println();
        
        var f1 = DataUtil.ConverterDateParaDataEHora(conta2.getDataAbertura());
        //DataUtil util = new DataUtil();
        //var formatado = util.ConverterDateParaData(conta2.getDataAbertura());
        
        conta.imprimirExtrato();
        conta2.imprimirExtrato();
        
        
    }
}
