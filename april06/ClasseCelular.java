package april06;

public class ClasseCelular {
	
	//Crie uma classe cliente e apresente os atributos e métodos referentes
	//esta classe.
	//Celular
	
	//ATRIBUTOS
	String cor;
	double tamanho;
	int armazenamento;
	boolean seguro=true;
	double preco;
	boolean status=false;
	//METODO CONSTRUTOR
	
	public ClasseCelular(String c, double t, int a, double p) {
		this.cor=c;
		this.tamanho=t;
		this.armazenamento=a;
		this.seguro=true;
		this.preco=p;
		this.status=false;
	}
	
	//METODOS - COMPORTAMENTOS
	
	public void estado() {
		System.out.println("Obrigado pela sua compra. \nSeguem abaixo os dados do seu novo GenPhone 13:\n");
		System.out.println("Cor: "+this.cor);
		System.out.println("Tamanho da tela: "+this.tamanho+ "''polegadas.");
		System.out.println("Armazenamento interno: "+this.armazenamento+" GB");
		System.out.printf("Preço final: R$ "+ String.format("%.2f",this.preco));
		System.out.println();
	}
	public void seguro() {
		if(seguro==false)
			System.out.println("Seu aparelho não possuí seguro, você está desprotegido.");
		else
			System.out.println("Você ganhou um ano de seguro grátis para seu novo aparelho");
	}
		
	public void status() {
		if(status==false)
			System.out.println("O seu aparelho está desligado. Carregue antes de utilizar!");
		else 
			System.out.println("Seu telefone está ligado e atualmente com 87% de bateria!");
   }		
}





