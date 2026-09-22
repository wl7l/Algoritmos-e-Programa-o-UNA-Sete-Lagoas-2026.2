import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            String senha = "0";
            String senha_correta = "2026";
            int tentativas = 0;

        System.out.print("Digite uma senha inteira de 4 dígitos: ");
        String senha_digitada = input.nextLine();
        tentativas++; // Essa primeira digitação vai contar como uma tentativa.

        while (!senha_digitada.equals(senha_correta)) { // .equals usado para a string.
            System.out.println("Senha Incorreta, Tente novamente!");
            System.out.println("Digite a senha de 4 dígitos: ");
            senha_digitada = input.nextLine();
            tentativas++;
        }

        System.out.println("Acesso Autorizado!");
        System.out.println("Total de tentativas: " + tentativas );
        }
    }
