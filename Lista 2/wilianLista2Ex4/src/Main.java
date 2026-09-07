import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = input.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = input.nextInt();

        System.out.println("Digite o terceiro número: ");
        int num3 = input.nextInt();

        int maior = num1;

        if (num2 > maior) {
            maior = num2;
        }
        if (num3 > maior) {
            maior = num3;
        }
            System.out.println("O Maior número é: " + maior);
    }
}