package menu;

import java.util.Scanner;
import manterfuncionario.CadastrarFuncionario;
import manterfuncionario.ExcluirFuncionario;
import manterfuncionario.AtualizarFuncionario;
import manterfuncionario.ListarFuncionario;
import manterfuncionario.PesquisarFuncionario;

public class ManterFuncionario {

	public static void main(String[] args) {
            
                Scanner scanner = new Scanner(System.in);
                int opcao = 0;
                while (opcao == 0){
		System.out.println("Menu Funcionarios");
		System.out.println("Digite 0 p/ retornar ao menu");
		System.out.println("Digite 1 p/ cadastrar um funcionario");
		System.out.println("Digite 2 p/ atualizar um funcionario");
		System.out.println("Digite 3 p/ listar os funcionarios");
		System.out.println("Digite 4 p/ pesquisar um funcionario");
		System.out.println("Digite 5 p/ excluir um funcionario");
		System.out.println("Opcao:");
		 opcao = scanner.nextInt();

		if (opcao == 1) {
			CadastrarFuncionario funcionario = new CadastrarFuncionario();
			funcionario.cadastrarFuncionario();
		}
		if (opcao == 2) {
			AtualizarFuncionario atualizar = new AtualizarFuncionario();
			atualizar.atualizarFuncionario();
		}
		if (opcao == 3) {
			ListarFuncionario listar = new ListarFuncionario();
			listar.listarFuncionario();
		}
		if (opcao == 4) {
			PesquisarFuncionario pesquisar = new PesquisarFuncionario();
			pesquisar.pesquisarFuncionario();
		}
		if (opcao == 5) {
			ExcluirFuncionario excluir = new ExcluirFuncionario();
			excluir.excluirFuncionario();
		}
	}
    }
}
