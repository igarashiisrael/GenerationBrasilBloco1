package april06;

public class ClasseAviao {
	//ATRIBUTOS
	
	String marca, origem, destino;
	double preco;
	boolean status, estadoAtual;

	public void Aviao() {
		System.out.println("Companhia Aérea: "+ destino);
		System.out.println("Local de origem:"+ origem);
		System.out.println("Destino: "+ destino);
		System.out.printf("Preço do voo: R$ "+ String.format("%.2f",preco));
		System.out.println();
		
	}
	public void Voo() {
		if (estadoAtual==true)
			System.out.println("O seu voo já decolou! Aperte os cintos!");
		else
			System.out.println("O seu voo vai partir em breve, corra para não ficar pra trás!");
	}
	public void Situacao() {
		if (status==true)
			System.out.println("Sua viagem foi confirmada!");
		else
			System.out.println("Sua viagem foi cancelada! Lamentamos o transtorno.");
	}
}
