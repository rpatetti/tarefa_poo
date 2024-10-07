package exercicio_modulo_13;

public class Programa {
	
	public static void main(String args[]) {
		PessoaFisica pessoaFisica = new PessoaFisica();
		pessoaFisica.setNome("Rafael");
		pessoaFisica.setEndereco("Rua Java, 8 - SP");
		pessoaFisica.setSobrenome("Patetti");
		pessoaFisica.setCpf(12345678L);
		System.out.println("Nome: " + pessoaFisica.getNome() + "\n" + "Sobrenome: " + pessoaFisica.getSobrenome() + "\n" + "CPF: " + pessoaFisica.getCpf() + "\n" + "Endereço: " + pessoaFisica.getEndereco());
		
		System.out.println();
		
		PessoaJuridica pessoaJuridica = new PessoaJuridica();
		pessoaJuridica.setNome("EBAC");
		pessoaJuridica.setEndereco("Rua Java, 7 - SP");
		pessoaJuridica.setFantasia("Curso Backend");
		pessoaJuridica.setCnpj(12345678L);
		System.out.println("Nome: " + pessoaJuridica.getNome() + "\n" + "Fantasia: " + pessoaJuridica.getFantasia() + "\n" + "CNPJ: " + pessoaJuridica.getCnpj() + "\n" + "Endereço: " + pessoaJuridica.getEndereco());
		
	}
	
	
	
}
