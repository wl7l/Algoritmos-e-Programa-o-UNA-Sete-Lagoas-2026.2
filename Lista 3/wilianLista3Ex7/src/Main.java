import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double soma = 0;
        int quantidade = 0;

        System.out.println("Digite uma nota (negativo para encerrar): ");
        double nota = input.nextDouble();

        while (nota >= 0) {
            soma += nota;
            quantidade++;

            System.out.println("Digite uma nota (negativo para encerrar): ");
            nota = input.nextDouble();

        }

        if (quantidade > 0) {
            double media = soma / quantidade;
            System.out.println("\nQuantidade de notas válidas: " + quantidade);
            System.out.printf("Média das notas: %.2f%n", media);
        } else {
            System.out.println("\nNenhuma nota válida foi digitada. Média não calculada.");
        }
    }
}