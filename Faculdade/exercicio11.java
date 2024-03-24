import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int num1 = teclado.nextInt();

        System.out.print("Informe o segundo número: ");
        int num2 = teclado.nextInt();

        int menor = Math.min(num1, num2); // Assumir o menor número dentre os dois
        int maior = Math.max(num1, num2); // Assumir o maior número dentre os dois

        System.out.println("Números inteiros no intervalo [" + menor + ", " + maior + "]:");

        int soma = 0;

        for (int i = menor; i <= maior; i++) {
            System.out.println(i);
            soma += i; // soma = soma + i
        }

        System.out.println("A soma dos números no intervalo é: " + soma);
        teclado.close();
    }
}