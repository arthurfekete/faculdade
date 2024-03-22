import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int maior = Integer.MIN_VALUE; 

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            int numero = teclado.nextInt();
            
            if (numero > maior) {
                maior = numero; 
            }
        }

        System.out.println("O maior número digitado é: " + maior);

        teclado.close(); 
    }
}
