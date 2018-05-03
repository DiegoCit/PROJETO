package manterfuncionario;

import java.util.Scanner;

import atributos.AtributosFuncionario;

public class ExcluirFuncionario {

	public void excluirFuncionario() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Excluir funcionário");
		System.out.println("Digite o nome do funcionário: ");
		String Nome = scanner.nextLine();
		
		if (Nome == AtributosFuncionario.getNomeCompleto()) {
			System.out.println("Funcionário excluído");
		}else {
			System.out.println("Não existe funcionários no sistema com esse nome. ");
		}
	}
}
