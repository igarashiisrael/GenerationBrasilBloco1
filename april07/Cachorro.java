package april07;

public class Cachorro extends Animal{
	
	private String latido;
	private String brincar;
	
	public void correr() 
	{
		System.out.println("..correndo atrás de um gato");
	}

	public String getLatido() {
		return latido;
	}

	public void setLatido(String latido) {
		this.latido = latido;
	}

	public String getBrincar() {
		return brincar;
	}

	public void setBrincar(String brincar) {
		this.brincar = brincar;
	}

}
