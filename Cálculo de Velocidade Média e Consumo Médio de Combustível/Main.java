import java.util.Scanner;

import javax.xml.namespace.QName;

class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Digite a distancia percorrida pelo carro: ");
    double distancia = teclado.nextDouble();
    System.out.println("Digite o tempo gasto em segundos pelo carro: ");
    int t = teclado.nextInt();
    System.out.println("Digite quanto de gasolina foi consumida pelo carro: ");
    int gasolinaConsumida = teclado.nextInt(); 

    double velocidade = distancia / t;
    double consumoMedio = distancia / gasolinaConsumida;

    System.out.println("A velocidade média do carro foi " + velocidade + "km/h");
    System.out.println("O consumo médio do carro foi de " + consumoMedio + "km/l");
    
    teclado.close();
    
}  }