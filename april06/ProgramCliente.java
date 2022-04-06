package april06;

public class ProgramCliente {
	public static void main(String[] args) {
		
		ClasseCliente CC = new ClasseCliente();
		
		CC.aprove=true;
		CC.idade=25;
		CC.name="Israel";
		CC.produto="Crédito Especial";
		CC.sobrenome="Igarashi";
		
		CC.Dados();
		CC.Aprovou();
		CC.Maior();
	}


}
