import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        do {
            System.out.print("Digite um número entre 0 e 99999: ");
            input = scanner.nextInt();
        } while (input < 0 || input > 99999);

        System.out.println("Praticando lógica de programação " + input +  " vezes " );
    }
}