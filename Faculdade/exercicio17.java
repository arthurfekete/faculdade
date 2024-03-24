import java.util.Scanner;

public class exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro para calcular o fatorial: ");
        int numero = scanner.nextInt();

        int resultado = 1;
        for (int i = numero; i >= 1; i--) {
            resultado *= i;
        }

        System.out.println("O fatorial de " + numero + " é: " + resultado);

        scanner.close();
    }
}