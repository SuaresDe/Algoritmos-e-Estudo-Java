import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    System.out.println("Insira um número inteiro n: ");
    int n = teclado.nextInt();

    System.out.println("Insira o limite inferior do intervalo: ");
    int inferior = teclado.nextInt();

    System.out.println("Insira o limite superior do intervalo: ");
    int superior = teclado.nextInt();

    if (inferior > superior) {
      System.out.println("Valor do intervalo incorreto..."); }
    else if (n < inferior) {
        System.out.println("n está antes do intervalo."); }
    else if (n >= inferior && n <= superior) {
        System.out.println("n está dentro do intervalo."); } 
    else {
        System.out.println("n está depois do intervalo.");
    } 
    
  }
}