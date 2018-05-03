package manterfuncionario;

import java.util.Scanner;
import atributos.AtributosFuncionario;

public class AtualizarFuncionario {

	public void atualizarFuncionario() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Atualizar Funcionário");
		System.out.println("Digite o nome do funcionário: ");
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
			System.out.println("Informe o endereço: ");
			AtributosFuncionario.setEndereco(scanner.nextLine());
			System.out.println("Informe o status: ");
			AtributosFuncionario.setStatus (scanner.nextBoolean());
			System.out.println("Informe o ID do funcionário: ");
			AtributosFuncionario.setIdFuncionario (scanner.nextInt());
			System.out.println("Atualização realizada com Sucesso!");
		}else {
			System.out.println("Nome não encontrado! ");
		}
	}
}
