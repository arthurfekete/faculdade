import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número entre 1 e 10 para gerar a tabuada:");
        int numero = teclado.nextInt();

        if (numero >= 1 && numero <= 10) {
            System.out.println("Tabuada de " + numero + ":");

            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                System.out.println(numero + " x " + i + " = " + resultado);
            }
        } else {
            System.out.println("Número inválido. Por favor, digite um número entre 1 e 10.");
        }

        teclado.close();
    }
}