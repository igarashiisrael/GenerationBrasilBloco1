package april06;

public class ClasseCliente {
	
	String name, sobrenome, produto;
	int idade;
	boolean aprove;
	
	public void Dados() {
		System.out.println("Nome do cliente: "+ name + " "+ sobrenome);
		System.out.println("Produto: "+ produto);
		System.out.println("Idade: "+ idade);
	}
	public void Aprovou() {
		if (aprove==true)
			System.out.println("O cliente foi aprovado no processo.");
		else
			System.out.println("O cliente foi recusado. Tente novamente em alguns meses.");	
	}
	public void Maior() {
		if (idade>=18)
			System.out.println("O cliente é maior de idade");
		else
			System.out.println("O cliente ainda é muito novo.");
			
	}
}
