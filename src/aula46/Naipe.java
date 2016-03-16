package aula46;

public enum Naipe {

	OURO("vermelho"),
	PAUS("preto"),
	ESPADA("preto"),
	COPAS("vermelho");
	
	private String cor;
	
	Naipe(String cor)
	{
		this.cor = cor;
	}
	
	
	
	public String getCor()
	{
		return cor;
	}
}
