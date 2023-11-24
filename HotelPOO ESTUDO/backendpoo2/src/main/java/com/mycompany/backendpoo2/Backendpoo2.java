/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.backendpoo2;

import java.util.ArrayList;
import static java.util.Comparator.comparing;
import java.util.stream.Stream;


/**
 *
 * @author ugf030
 */
public class Backendpoo2 {

    public static void main(String[] args) {
        System.out.println("Hotel POO");
        System.out.println();
        
        Recepcionista recepcionista1 = new Recepcionista("Maria","11 12821872","123.123.121-11");
        
        recepcionista1.atenderTelefone();
        recepcionista1.ingles();
        
        Camareira camareira1 = new Camareira("Joana","21 123123142","123.123.123-12");
    
        camareira1.arrumarACama();
        camareira1.limparQuarto();
        
        System.out.println("Recepcionista faltou!");
        System.out.println();
        System.out.println("Telefone toca...");
        
        Gerente gerente1 = new Gerente("João","11 987654321","987.654.321-11");
        gerente1.atenderTelefone();
        
        Quarto quarto1 = new Quarto();
        quarto1.setNumero("101A");
        quarto1.setValor(100.0);
        quarto1.setTipo(EnumTipo.BASICO);
    
        Quarto quarto2 = new Quarto();
        quarto2.setNumero("102A");
        quarto2.setValor(200.0);
        quarto2.setTipo(EnumTipo.MASTER);
        
        Quarto quarto3 = new Quarto();
        quarto3.setNumero("103A");
        quarto3.setValor(300.0);
        quarto3.setTipo(EnumTipo.PRESIDENCIAL);
        
        System.out.println(quarto2.getTipo());
        System.out.println(quarto2.getTipo().getValor());
        
        Cliente cliente1 = new Cliente("Suares","21 1234-5678","111.111.111-11", 20);
        Cliente cliente2 = new Cliente("Roberto","21 1894-5678","112.111.111-22", 20);
        Cliente cliente3 = new Cliente("Maria","21 1904-5678","113.111.111-33", 25);
        Cliente cliente4 = new Cliente("Tales","21 1564-5678","114.111.111-44", 30);
        
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        
        clientes.add(cliente1);
        clientes.add(cliente1);
        clientes.add(cliente1);
        clientes.add(cliente1);
        
        
        clientes.stream().count();
        clientes.size();
        
        //clientes.stream().limit(2).forEach(c -> System.out.println(c.getNome()));
        
        //clientes.stream().skip(2)
        
        //clientes.stream().sorted();
        
        //clientes.stream().sorted(comparing(Cliente::getIdade));
        
        //clientes.stream().filter(c -> c.getIdade() > 25);
        
    
        
    }
}
