package april06;

public class ClassWorker {
	//ATRIBUTOS
	String cargo, nome, setor;
	double salario;
	int idade;
	boolean promove;
	
	//METODOS
	public void Information() {
		System.out.println("Nome do funcionário: "+ nome);
		System.out.println("Idade: "+ idade);
		System.out.println("Cargo: "+ cargo);
		System.out.println("Setor: "+ setor);
		System.out.println();
	}
	public void Promotion() {
		if (promove==true)
		System.out.println("Parabéns!!! Você recebeu uma promoção de cargo!");
		else
		System.out.println("Continue dando seu melhor!");
	}
}
