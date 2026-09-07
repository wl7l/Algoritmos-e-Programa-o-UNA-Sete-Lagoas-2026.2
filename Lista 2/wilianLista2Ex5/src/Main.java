import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = input.nextDouble();

        System.out.println("Escolha a unidade de conversão:");
        System.out.println("1 - Fahrenheit");
        System.out.println("2 - Kelvin");
        System.out.print("Opção: ");
        int opcao = input.nextInt();

        switch (opcao) {
            case 1:
                double fahrenheit = celsius * 1.8 + 32;
                System.out.printf("Temperatura em Fahrenheit: %.2f °F%n", fahrenheit);
                break;
            case 2:
                double kelvin = celsius + 273.15;
                System.out.printf("Temperatura em Kelvin: %.2f K%n", kelvin);
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
}
