package april06;

public class ClassBank {
	
	//ATRIBUTO
	String banco;
	int conta, ag;
	double saldo;
	
	//METODOS
	public void Data() {
		System.out.println("Banco: "+banco);
		System.out.println("Conta: "+ conta);
		System.out.println("Agência: "+ ag);
		System.out.println("Saldo em conta: "+ saldo);
	}
	
	public void Negocia() {
		if (saldo<0)
			System.out.println("Seu saldo é negativo. Entre em contato para tentar conseguir um crédito especial.");
	}

}
