import java.util.Scanner;
public class questao2 {
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  String username, password;

  System.out.println("Cadastro de Usuário");
  System.out.print("Digite seu nome de usuário: ");
  username = scanner.nextLine();

  System.out.print("Digite sua senha: ");
  password = scanner.nextLine();
  if (password.equals(username))
  System.out.println("Erro: A senha não pode ser igual ao nome de usuário.");
  while (password.equals(username));
  System.out.println("Usuário cadastrado com sucesso!");
  scanner.close();
  }

    
}
