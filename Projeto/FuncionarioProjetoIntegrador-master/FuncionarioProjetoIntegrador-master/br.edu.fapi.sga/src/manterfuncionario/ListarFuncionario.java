package manterfuncionario;

import atributos.AtributosFuncionario;

public class ListarFuncionario {

	public void listarFuncionario() {
		if (AtributosFuncionario.getNomeCompleto() != null) {
			System.out.println(AtributosFuncionario.getNomeCompleto());
		} else {
			System.out.println("N�o existe funcion�rios no sistema. ");
		}
	}

}
