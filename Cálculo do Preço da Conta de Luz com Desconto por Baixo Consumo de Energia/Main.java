import java.util.Scanner;

//Considerando que o kilowatt = 0.60 R$

class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Insira o kilowatts: ");
    int kW1 = teclado.nextInt();

    System.out.println("Insira o segundo kilowatts: ");
    int kW2 = teclado.nextInt();

    double precoConta = (kW1 * 0.60) + (kW2 * 0.60);

    int kWtotal = kW1 + kW2; 
    
    if (kWtotal < 150) {
      double desconto = precoConta * 0.10;
      precoConta = precoConta - desconto;
      System.out.println("Você recebeu 10% de desconto por baixo consumo de energia!");
    }

    System.out.printf("O preço da conta de luz é: %.2fR$", precoConta);
    
  }
}