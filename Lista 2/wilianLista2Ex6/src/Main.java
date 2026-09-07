import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o código do produto (1 a 40): ");
        int codigo = input.nextInt();

        System.out.println("Digite a quantidade do produto: ");
        int quantidade = input.nextInt();

        double precoUnitario = 0.0;

        // Tabela 1
        if (codigo >= 1 && codigo <= 10) {
            precoUnitario = 10.00;

        } else if (codigo >= 11 && codigo <= 20) {
            precoUnitario = 15.00;

        } else if (codigo >= 21 && codigo <= 30) {
            precoUnitario = 20.00;

        } else if (codigo >= 31 && codigo <= 40) {
            precoUnitario = 30.00;
        } else {
            System.out.println("Código do produto invalido!");
            return;
        }

            double precoTotal = precoUnitario * quantidade;
            double percentualDesconto = 0.0;

            if (precoTotal <= 250.00) {
                percentualDesconto = 0.05;
            } else if (precoTotal <= 500.00) {
                percentualDesconto = 0.10;
            } else {
                percentualDesconto = 0.15;
            }

            double valorDesconto = precoTotal * percentualDesconto;
            double precoFinal = precoTotal - valorDesconto;

            System.out.println("\n--- RESUMO DA NOTA FISCAL ---");
            System.out.printf("Preço unitário: R$ %.2f\n", precoUnitario);
            System.out.printf("Preço total da nota: R$ %.2f\n", precoTotal);
            System.out.printf("Valor do desconto: R$ %.2f (%.0f%%)\n", valorDesconto, percentualDesconto * 100);
            System.out.printf("Preço final da nota: R$ %.2f\n", precoFinal);

        }
    }