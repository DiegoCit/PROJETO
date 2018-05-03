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
		System.out.println("Funcionários");
		System.out.println("Digite 0 p/ retornar ao menu");
		System.out.println("Digite 1 p/ cadastrar um funcionário");
		System.out.println("Digite 2 p/ atualizar um funcionário");
		System.out.println("Digite 3 p/ listar os funcionários");
		System.out.println("Digite 4 p/ pesquisar um funcionário");
		System.out.println("Digite 5 p/ excluir um funcionário");
		System.out.println("Opcao:");
		int opcao = scanner.nextInt();

		if (opcao == 1) {
			CadastrarFuncionario funcionario = new CadastrarFuncionario();
			funcionario.cadastrarFuncionario();
		}
		if (opcao == 2) {
			AtualizarFuncionario func = new AtualizarFuncionario();
			func.atualizarFuncionario();
		}
		if (opcao == 3) {
			ListarFuncionario funcio = new ListarFuncionario();
			funcio.listarFuncionario();
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
