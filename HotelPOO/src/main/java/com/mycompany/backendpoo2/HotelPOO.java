/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.backendpoo2;


/**
 *
 * @author ugf030
 */
public class HotelPOO {

    public static void main(String[] args) {
        System.out.println("Hotel POO");
        System.out.println();
        
        Cliente cliente1 = new Cliente("Suares","21 1234-5678","111.111.111-11");
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
        
    }
}
