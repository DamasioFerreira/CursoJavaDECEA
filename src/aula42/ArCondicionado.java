package aula42;

import javax.swing.JOptionPane;

public class ArCondicionado {
	
	private int temperatura;
	double teste;
	
	//private
	//protected
	//public
	
	public void trocarTemperatura(int temperatura)
	{
		if(temperatura >=17 && temperatura <= 25)
		{
			this.temperatura = temperatura;
		}
		else
		{
			mensagemErro();
		}
	}
		
	private void mensagemErro()
	{
		JOptionPane.showMessageDialog(null, "Temperatura deve ser maior ou igual a 17 e menour ou igual a 25!");
	}
	
	public int obterTemperatura()
	{
		return temperatura;
	}
}
