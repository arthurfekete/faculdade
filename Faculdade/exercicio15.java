import java.util.Scanner;
public class exercicio15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a quantidade de termos da série: ");
        int termos = teclado.nextInt();

        int primeiro = 0;
        int segundo = 1;

        if (termos <= 0){
            System.out.println("Número inválido. Por favor, informe um número maior que 0.");
        } else if (termos == 1){
            System.out.print(primeiro);
        } else {
            System.out.print(primeiro + ", " + segundo);

            for (int i = 3; i <= termos; i++) {
                int proximo = primeiro + segundo;
                System.out.print(", " + proximo);
                primeiro = segundo;
                segundo = proximo;
            }

            System.out.println(); 
        }

        teclado.close();
    }
}