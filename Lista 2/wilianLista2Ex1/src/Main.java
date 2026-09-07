import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a idade do nadador: ");
        int idade = input.nextInt();

        if (idade <= 12) {
            System.out.println("Categoria: Infantil");
        } else if (idade <= 17) {
            System.out.println("Categoria: Juvenil");
        } else {
            System.out.println("Categoria: Adulto");
        }
    }
}