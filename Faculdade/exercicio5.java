import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a população do país A: ");
        int A = teclado.nextInt();

        System.out.println("Digite a taxa de crescimento da população A: ");
        double crescA = teclado.nextDouble();

        System.out.println("Informe a população do país B: ");
        int B = teclado.nextInt();

        System.out.println("Digite a taxa de crescimento da população B: ");
        double crescB = teclado.nextDouble();

        int i = 0;

        while (A < B) {
            A += (int) (A * crescA / 100);
            B += (int) (B * crescB / 100);
            i++;
        }
        System.out.println("\nA população A se igualar a B demorou " + i + " anos");

        teclado.close();
    }
}

