import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int quantidadeAlunos = 0;
    double soma = 0.0;
    double maiorNota = Double.MIN_VALUE;
    double menorNota = Double.MAX_VALUE;

    System.out.println("Digite as notas dos alunos (-1 para encerrar):");

    while (true) {
      double nota = teclado.nextDouble();

      if (nota == -1) {
        break; 
      }

      quantidadeAlunos++;
      soma += nota;

      if (nota > maiorNota) {
        maiorNota = nota;
      }

      if (nota < menorNota) {
        menorNota = nota;
      }
    }

    if (quantidadeAlunos > 0) {
      double media = soma / quantidadeAlunos;
      System.out.println("Quantidade de alunos: " + quantidadeAlunos);
      System.out.println("Média da turma: " + media);
      System.out.println("Maior nota: " + maiorNota);
      System.out.println("Menor nota: " + menorNota);
    } else {
      System.out.println("Nenhuma nota foi inserida.");
    }

    teclado.close(); 
  }
}
