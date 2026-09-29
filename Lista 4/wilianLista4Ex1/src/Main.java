import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um número inteiro: ");

        long num = input.nextInt();
        long fatorial = 1;
        for (long i = 1; i <= num; i++) {
            fatorial *= i;
        }
        System.out.println("O fatorial do seu número é: " + fatorial);
    }
}