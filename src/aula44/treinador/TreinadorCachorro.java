package aula44.treinador;

import aula44.animal.Cachorro;

public class TreinadorCachorro {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		cachorro.setNome("Bob");
		
		DonoCachorro dono = new DonoCachorro();
		dono.ensinarCachorroSentar(cachorro);

	}

}
