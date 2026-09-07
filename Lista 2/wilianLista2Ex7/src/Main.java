import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor da renda mensal (R$): ");
        double rendaMensal = input.nextDouble();

        System.out.print("Digite o valor da prestação mensal desejada (R$): ");
        double prestacaoMensal = input.nextDouble();

        if (prestacaoMensal > rendaMensal * 0.30) {
            System.out.println("Financiamento negado por baixa renda");
        } else if (prestacaoMensal > 3000 && rendaMensal < 10000) {
            System.out.println("Financiamento negado por alta prestação");
        } else {
            System.out.println("Financiamento aprovado");
        }
    }
}
