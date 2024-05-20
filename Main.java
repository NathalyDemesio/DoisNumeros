import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int valor1 = 0;
    int valor2 = 0;

      //limpa a tela
    System.out.println("\033[H\033[2J");

    System.out.print("\nDigite um valor inteiro:");
    valor1 = entrada.nextInt();

    System.out.print("\nDigite outro valor inteiro:");
    valor2 = entrada.nextInt();

    if(valor1 == valor2) {
      System.out.println("Os valores são iguais.");
    } else {
      if(valor1 > valor2) {
        System.out.println("O primeiro número é maior que o segundo.");
      } else {
        System.out.println("O segundo número é maior que o primeiro.");
      }
    }
  }
}
