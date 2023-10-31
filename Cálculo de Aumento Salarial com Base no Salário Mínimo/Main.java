import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    double salario;
    double salarioMinimo;
    double aumento;

    salarioMinimo = 1400;
    
    System.out.println("Insira o Salario: ");
    salario = teclado.nextDouble();

      if (salario < salarioMinimo) {
        
      aumento = salario * 0.20;
      salario +=  aumento;
      System.out.println("Salario menor que o minino, aumento de 20% aplicado.");
      System.out.println("Novo salario: " + salario);
        
      } else {
        
      aumento = salario * 0.10;
      salario += aumento;
      System.out.println("Salario maior que o minimo, aumento de 10% aplicado.");
      System.out.println("Novo salario: " + salario);

      teclado.close();
      }
    
    
  }
}