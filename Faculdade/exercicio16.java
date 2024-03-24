public class exercicio16 {
    public static void main(String[] args) {
        int primeiro = 0;
        int segundo = 1;
        int proximo = 0;

        System.out.println("Série de Fibonacci até o termo que supera 500:");

        while (proximo <= 500) {
            if (proximo == 0) {
                System.out.print(primeiro);
            } else {
                System.out.print(", " + proximo);
            }

            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }

        System.out.println(); 
    }
}
