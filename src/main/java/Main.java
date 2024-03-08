import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade de números: ");
        int n = scanner.nextInt();

        int numero;
        int soma = 0;
        int i = 0;

        while (i < n) {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();
            soma = soma + numero;
            i = i + 1;
        }

        scanner.close();

        System.out.println("O somatório dos números é: " + soma);
    }
}
