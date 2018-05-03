package manterfuncionario;

import java.util.Scanner;

import atributos.AtributosFuncionario;

public class ExcluirFuncionario {

	public void excluirFuncionario() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Excluir funcion�rio");
		System.out.println("Digite o nome do funcion�rio: ");
		String Nome = scanner.nextLine();
		
		if (Nome == AtributosFuncionario.getNomeCompleto()) {
			System.out.println("Funcion�rio exclu�do");
		}else {
			System.out.println("N�o existe funcion�rios no sistema com esse nome. ");
		}
	}
}
