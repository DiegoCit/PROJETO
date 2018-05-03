package manterfuncionario;

import java.util.Scanner;
import atributos.AtributosFuncionario;

public class AtualizarFuncionario {

	public void atualizarFuncionario() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Atualizar Funcion�rio");
		System.out.println("Digite o nome do funcion�rio: ");
		String Nome = scanner.nextLine();
		
		if (Nome == AtributosFuncionario.getNomeCompleto()) {
			System.out.println("Informe o nome completo: ");
			AtributosFuncionario.setNomeCompleto(scanner.nextLine());
			System.out.println("Informe o CPF: ");
			AtributosFuncionario.setCpf (scanner.nextLine());
			System.out.println("Informe o RG: ");
			AtributosFuncionario.setRg (scanner.nextLine());
			System.out.println("Informe o telefone: ");
			AtributosFuncionario.setTelefone (scanner.nextLine());
			System.out.println("Informe o e-mail: ");
			AtributosFuncionario.setEmail (scanner.nextLine());
			System.out.println("Informe o endere�o: ");
			AtributosFuncionario.setEndereco(scanner.nextLine());
			System.out.println("Informe o status: ");
			AtributosFuncionario.setStatus (scanner.nextBoolean());
			System.out.println("Informe o ID do funcion�rio: ");
			AtributosFuncionario.setIdFuncionario (scanner.nextInt());
			System.out.println("Atualiza��o realizada com Sucesso!");
		}else {
			System.out.println("Nome n�o encontrado! ");
		}
	}
}
