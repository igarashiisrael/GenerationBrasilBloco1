package april06;

public class ClassPatinete {
		//ATRIBUTOS
	String marca, cor, modelo;
	double preco;
	
	//METODOS
	public void Informacoes() {
		System.out.println("Marca: "+marca);
		System.out.println("Modelo: "+modelo);
		System.out.println("Cor: "+cor);
		System.out.println("Preço : R$"+preco);
		System.out.println();
	}
	public void Promo() {
		if(preco>5000.00)
			System.out.println("Você ganhou um voucher de 15%");
		else
			System.out.println("Obrigado pela compra!");
	}
	
}
