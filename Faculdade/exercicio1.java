import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nota;

        do {
            System.out.print("Digite uma nota entre zero e dez: ");
            nota = teclado.nextInt();

            if (nota < 0 || nota > 10) {
                System.out.println("Valor inválido! Digite novamente.");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("Nota válida: " + nota);
        teclado.close();
    }
}