import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int vogais = 0;
    int digitos = 0;
    int outros = 0;

    System.out.println("Digite caracteres (termine com um ponto '.'): ");

    while (true) {
      char caracter = teclado.next().charAt(0);

      if (caracter == '.') {
        break; 
      }

      if (Character.isLetter(caracter)) {
        char lowercase = Character.toLowerCase(caracter);
        if (lowercase == 'a' || lowercase == 'e' || lowercase == 'i' || lowercase == 'o' || lowercase == 'u') {
          vogais++;
        }
      } else if (Character.isDigit(caracter)) {
        digitos++;
      } else {
        outros++;
      }
    }

    System.out.println("Quantidade de vogais: " + vogais);
    System.out.println("Quantidade de dígitos: " + digitos);
    System.out.println("Quantidade de outros caracteres: " + outros);

    teclado.close(); 
  }
}
