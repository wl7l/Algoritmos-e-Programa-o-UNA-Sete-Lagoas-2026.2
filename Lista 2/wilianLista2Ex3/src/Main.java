import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = input.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
            System.out.println("O quadrado de " + numero + " é " + (numero * numero) + ".");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
            System.out.println("O cubo de " + numero + " é " + (numero * numero * numero) + ".");
        }
    }
}