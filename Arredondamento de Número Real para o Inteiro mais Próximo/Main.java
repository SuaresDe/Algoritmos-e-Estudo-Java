import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Insira um número real: ");
    double n = teclado.nextDouble();

    int arredondado;
    arredondado = (int) Math.round(n);

    System.out.println(arredondado);
  }
}