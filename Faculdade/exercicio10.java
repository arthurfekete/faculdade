import java.util.Scanner;
public class exercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Inform o primeiro número: ");
        int num1 = teclado.nextInt();

        System.out.print("Informe o segundo número: ");
        int num2 = teclado.nextInt();

        int menor = Math.min(num1, num2);
        int maior = Math.max(num1, num2);

        System.out.println("Números inteiros no intervalo [" + menor + ", " + maior + "]:");
        for (int i = menor; i <= maior; i++) {
            System.out.println(i);
        }

        teclado.close();
    }
}
