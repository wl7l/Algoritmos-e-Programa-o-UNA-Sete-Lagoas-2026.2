import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("Quantidade total de doações do dia: ");
        int quantidade = input.nextInt();

        if (quantidade <= 0) {
            System.out.println("Nenhuma doação para processar.");
            input.close();
            return;
        }

        double total = 0;
        double maior = 0;
        double menor = 0;

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Valor da doação " + i + " (R$): ");
            double valor = input.nextDouble();

            total += valor;

            if (i == 1) {
                maior = valor;
                menor = valor;
            } else {
                if (valor > maior) {
                    maior = valor;
                }
                if (valor < menor) {
                    menor = valor;
                }
            }
        }
                    System.out.printf("%nTotal arrecadado: R$ %.2f%n", total);
                    System.out.printf("Maior doação: R$ %.2f%n", maior);
                    System.out.printf("Menor doação: R$ %.2f%n", menor);

                    input.close();
                }
            }