package april07;

public class Animal {
	
	
	// ATRIBUTOS - CARACTERISTICAS
			private String nome;
			private int idade;
			

			// METODOS - COMPORTAMENTOS
			public void emitirSom() 
			{
				System.out.println("Emitindo som.");
			}


			public String getNome() {
				return nome;
			}


			public void setNome(String nome) {
				this.nome = nome;
			}


			public int getIdade() {
				return idade;
			}


			public void setIdade(int idade) {
				this.idade = idade;
			}
			

}
