import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Insira o valor de a: ");
    int a = teclado.nextInt();

    System.out.println("Insira o valor de b: ");
    int b = teclado.nextInt();

    int inicio, fim;

    if (a <= b) {
      inicio = a;
      fim = b;
    } else {
      inicio = b;
      fim = a;
    }

    int soma = 0;
    int countPares = 0;

    System.out.println("Números pares no intervalo:");

    for (int i = inicio; i <= fim; i++) {
      if (i % 2 == 0) {
        System.out.print(i + " ");
        soma += i;
        countPares++;
      }
    }

    if (countPares > 0) {
      double media = (double) soma / countPares;
      System.out.println("\nSoma dos números pares: " + soma);
      System.out.println("Média dos números pares: " + media);
    } else {
      System.out.println("\nNenhum número par no intervalo.");
    }

    teclado.close();
  }
}
