package manterfuncionario;

import java.util.Scanner;
import atributos.AtributosFuncionario;

public class CadastrarFuncionario {

	Scanner scanner = new Scanner(System.in);
	private String nomeCompleto;
	private String cpf;
	private String rg;
	private String telefone;
	private String email;
	private String endereco;
	private boolean status;
	private int idFuncionario;
	
	public void cadastrarFuncionario() {
		System.out.println("Cadastrar Funcionário");
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
		System.out.println("Cadastro realizado com Sucesso!");
	}
}
