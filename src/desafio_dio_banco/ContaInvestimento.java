package desafio_dio_banco;

public class ContaInvestimento extends Conta implements IBanco {

	private double investimentoMinimo;
	private double taxaRendimento;
	protected double saldo;
	
	
	public ContaInvestimento() {
		this.taxaRendimento = 0.030;
		this.investimentoMinimo = 1000;
	}

	public void fimDoMes() {
		if (this.saldo >= investimentoMinimo)
			saldo += saldo * taxaRendimento;
		else
			System.out.println("Sem saldo suficiente para Investimento");
	}
	
	public void imprimirExtrato() {
		System.out.println(" == Extrato de Conta Investimento ==");
		super.imprimirInfosComuns();
	}


}
