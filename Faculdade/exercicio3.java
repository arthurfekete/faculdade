import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome, sexo, estadoCivil;
        int idade;
        double salario;

      do{
        System.out.print("Digite o nome: ");
        nome = teclado.nextLine();
      } while (nome.length() <= 3);

      do{
        System.out.print("Digite a idade: ");
        idade = teclado.nextInt();
      } while (idade < 0 || idade > 150);

      do{
        System.out.print("Informe o sexo 'f' ou 'm': ");
        sexo = teclado.next().toLowerCase();
      } while (!sexo.equals("f") && !sexo.equals("m"));

      do{
        System.out.print("Informe o estado civil 's', 'c', 'v' ou 'd': ");
        estadoCivil = teclado.next().toLowerCase();
      } while (!estadoCivil.equals("s") && !estadoCivil.equals("c") && !estadoCivil.equals("v") && !estadoCivil.equals("d"));

      do{
        System.out.print("Informe o salário: ");
        salario = teclado.nextDouble();
      } while (salario < 0);

      System.out.println("\nInformações válidas:");
      System.out.println("Nome: " + nome);
      System.out.println("Idade: " + idade);
      System.out.println("Salário: " + salario);
      System.out.println("Sexo: " + (sexo.equals("f") ? "Feminino" : "Masculino"));
      System.out.println("Estado Civil: " + estadoCivil.toUpperCase());

      teclado.close();
    }
}