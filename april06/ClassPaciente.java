package april06;

public class ClassPaciente {
	
	String nome, situacao;
	int idade;
	boolean emergency=true;
	
	public void Data () {
		System.out.println("Nome: "+nome);
		System.out.println("Idade "+idade);
		System.out.println("Estado de Saúde: "+situacao);
	}
	public void Status() {
		if(emergency==true)
			System.out.println("Você precisa de atendimento emergêncial!");
		else
			System.out.println("Por favor, aguarde até ser chamado.");
	}
	

}
