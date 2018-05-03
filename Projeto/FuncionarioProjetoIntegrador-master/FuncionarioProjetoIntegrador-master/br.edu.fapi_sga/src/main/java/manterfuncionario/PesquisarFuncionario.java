package manterfuncionario;

import java.util.Scanner;
import atributos.AtributosFuncionario;

import atributos.AtributosFuncionario;

public class PesquisarFuncionario {

	public void pesquisarFuncionario() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Pesquisar funcionario");
		System.out.println("Digite o nome do funcionario: ");
		String Nome = scanner.nextLine();
		System.out.println("Digite o CPF do funcionario: ");
		String CPF = scanner.nextLine();
		if (Nome == AtributosFuncionario.getNomeCompleto() && CPF == AtributosFuncionario.getCpf()) {
			System.out.println("Nome: " + AtributosFuncionario.getNomeCompleto());
			System.out.println("CPF: " + AtributosFuncionario.getCpf());
		}else {
			System.out.println("Nao existe dados para esse funcionario ");
		}
	}
}
