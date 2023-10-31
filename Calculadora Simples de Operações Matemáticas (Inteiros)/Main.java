import java.util.Scanner;

public class Main {
    public static void main(String [] args) {

        Scanner teclado = new Scanner(System.in);

        int x;

        int y;

        System.out.println("Digite X: ");
        x = teclado.nextInt();

        System.out.println("Digite Y: ");
        y = teclado.nextInt();

        int soma = x + y;
        int subtracao = x - y;
        int multiplicacao = x * y;
        int divisao = x / y;

        System.out.printf("Soma de X e Y: %d\n", soma);
        System.out.printf("Subtração de X e Y: %d\n", subtracao);
        System.out.printf("Multiplicação de X e Y: %d\n", multiplicacao);
        System.out.printf("Divisão de X e Y: %d\n", divisao);
    }
}