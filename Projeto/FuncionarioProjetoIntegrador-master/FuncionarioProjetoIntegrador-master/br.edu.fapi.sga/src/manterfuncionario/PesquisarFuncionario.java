package manterfuncionario;

import java.util.Scanner;
import atributos.AtributosFuncionario;

import atributos.AtributosFuncionario;

public class PesquisarFuncionario {

	public void pesquisarFuncionario() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Pesquisar funcion�rio");
		System.out.println("Digite o nome do funcion�rio: ");
		String Nome = scanner.nextLine();
		System.out.println("Digite o CPF do funcion�rio: ");
		String CPF = scanner.nextLine();
		if (Nome == AtributosFuncionario.getNomeCompleto() && CPF == AtributosFuncionario.getCpf()) {
			System.out.println("Nome: " + AtributosFuncionario.getNomeCompleto());
			System.out.println("CPF: " + AtributosFuncionario.getCpf());
		}else {
			System.out.println("N�o existe dados para esse funcion�rio ");
		}
	}
}
