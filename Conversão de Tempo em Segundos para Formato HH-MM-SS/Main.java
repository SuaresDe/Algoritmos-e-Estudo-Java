import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int t;
    int horas;
    int minutos;
    int segundos;  
    
    System.out.println("Insira um tempo qualquer em segunda: ");
    t = teclado.nextInt();

    horas = t / 3600;
    minutos = (t % 3600) / 60;
    segundos = t % 60;

    System.out.println(horas + ":" + minutos + ":" + segundos);
    
  }
}