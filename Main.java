import java.util.Scanner;

public class Main {
    public static void main(String [] args) {

        Scanner teclado = new Scanner(System.in);

        float x;

        float y;

        System.out.println("Digite X: ");
        x = teclado.nextFloat();

        System.out.println("Digite Y: ");
        y = teclado.nextFloat();

        float soma = x + y;
        float subtracao = x - y;
        float multiplicacao = x * y;
        float divisao = x / y;

        System.out.printf("Soma de X e Y: %f\n", soma);
        System.out.printf("Subtração de X e Y: %f\n", subtracao);
        System.out.printf("Multiplicação de X e Y: %f\n", multiplicacao);
        System.out.printf("Divisão de X e Y: %f\n", divisao);
    }
}