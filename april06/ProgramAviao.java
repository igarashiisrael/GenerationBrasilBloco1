package april06;

public class ProgramAviao {
	public static void main(String[] args) {

		ClasseAviao CA = new ClasseAviao ();
		
		CA.destino="S�o Paulo";
		CA.estadoAtual=true;
		CA.marca="Quatar";
		CA.origem="Tokyo";
		CA.preco=4500.00;
		CA.status=true;
		
		CA.Aviao();
		CA.Voo();
		CA.Situacao();
		
	}

}
