import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a base: ");
        int base = teclado.nextInt();

        System.out.print("Digite o expoente: ");
        int expoente = teclado.nextInt();

        int resultado = 1;

        for (int i = 0; i < expoente; i++) {
            resultado *= base; // resultado = resultado * base
        }

        System.out.print("O resultado é: " + resultado);
        teclado.close();
    }
}
