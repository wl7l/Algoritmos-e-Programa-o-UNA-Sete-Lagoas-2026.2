import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = input.nextInt();
        for (int i = 1; i <= numero; i++) {
            System.out.println("Praticando lógica de programação!");
        }
    }
}
