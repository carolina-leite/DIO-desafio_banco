package desafio_dio_banco;

public class ContaCorrente extends Conta{


	public void imprimirExtrato() {
		System.out.println(" == Extrato de Conta Corrente ==");
		super.imprimirInfosComuns();
	}
	
}
