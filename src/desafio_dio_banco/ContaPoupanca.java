package desafio_dio_banco;

public class ContaPoupanca extends Conta{

		
		public void imprimirExtrato() {
			System.out.println(" == Extrato de Conta Poupanca ==");
			super.imprimirInfosComuns();
		}


	
}
