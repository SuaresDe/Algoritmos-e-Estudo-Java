import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Insira o caractere da operação (+, -, *, /): ");
    char op = teclado.next().charAt(0);

    System.out.println("Insira o valor de a: ");
    double a = teclado.nextDouble();

    System.out.println("Insira o valor de b: ");
    double b = teclado.nextDouble();

    double resultado = 0.0;

    if (op == '+') {
      resultado = a + b;
    } else if (op == '-') {
      resultado = a - b;
    } else if (op == '*') {
      resultado = a * b;
    } else if (op == '/') {
      if (b != 0) {
        resultado = a / b;
      } else {
        System.out.println("Erro: Divisão por zero não é permitida.");
        return;
      }
    } else {
      System.out.println("Caractere aritmético incorreto");
      return;
    }

    teclado.close();
    System.out.println(a + " " + op + " " + b + " = " + resultado);
  }
}
