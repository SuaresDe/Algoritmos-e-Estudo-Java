import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Insira um número: ");
    int n = teclado.nextInt();

    if (n % 2 == 0) {
      System.out.println("O número é par");
    } else {
      System.out.println("O número é impar");
    }
  }
}