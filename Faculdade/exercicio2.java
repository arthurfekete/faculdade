import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String usuario, senha;

        do {
            System.out.print("Digite o nome de usuário: ");
            usuario = teclado.nextLine();

            System.out.print("Digite a senha: ");
            senha = teclado.nextLine();

            if (senha.equals(usuario)) {
                System.out.println("Erro: A senha não pode ser igual ao nome de usuário. Digite novamente.");
            }
        } while (senha.equals(usuario));

        System.out.println("Cadastro realizado com sucesso!");
        teclado.close();
    }
}
