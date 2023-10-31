import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Insira o número de alunos: ");
    int n = teclado.nextInt();

    if (n <= 0) {
      System.out.println("Número inválido de alunos.");
      return; 
    }

    double soma = 0.0;

    for (int i = 1; i <= n; i++) {
      System.out.println("Insira a nota do aluno " + i + ": ");
      double nota = teclado.nextDouble();
      soma += nota;
    }

    if (n > 0) {
      double media = soma / n;
      System.out.println("Média da turma: " + media);
    } else {
      System.out.println("Não há notas para calcular a média.");
    }

    teclado.close();
  }
}
