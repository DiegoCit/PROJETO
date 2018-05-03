package manterfuncionario;

import atributos.AtributosFuncionario;

public class ListarFuncionario {

	public void listarFuncionario() {
		if (AtributosFuncionario.getNomeCompleto() != null) {
			System.out.println(AtributosFuncionario.getNomeCompleto());
		} else {
			System.out.println("Não existe funcionários no sistema. ");
		}
	}

}
