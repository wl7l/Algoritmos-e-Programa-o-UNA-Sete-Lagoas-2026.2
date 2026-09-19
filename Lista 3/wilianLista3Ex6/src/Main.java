import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            int senha_correta = 2026;
            int tentativas = 0;

        System.out.print("Digite uma senha inteira de 4 dígitos: ");
        int digitada = input.nextInt();
        tentativas++;

        while (digitada != senha_correta) {
            System.out.println("Senha Incorreta, Tente novamente!");
            System.out.println("Digite a senha de 4 dígitos: ");
            digitada = input.nextInt();
            tentativas++;

        }

        System.out.println("Acesso Autorizado!");
        System.out.println("Total de tentativas: " + tentativas );
        }
    }
