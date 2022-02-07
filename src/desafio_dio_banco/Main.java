package desafio_dio_banco;

public class Main {

	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		Conta Cpoupanca = new ContaPoupanca();
		Conta CInvestimento = new ContaInvestimento();
		
		cc.depositar(50.00);
		cc.transferir(20, Cpoupanca);
		cc.transferir(5, CInvestimento);
		CInvestimento.depositar(1500);
		
		
		
		cc.imprimirExtrato();
		Cpoupanca.imprimirExtrato();
		CInvestimento.imprimirExtrato();
		

	}

}
