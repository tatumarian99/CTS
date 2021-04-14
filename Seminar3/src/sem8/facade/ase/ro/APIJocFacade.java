package sem8.facade.ase.ro;

public class APIJocFacade {
	public static ProfilJucator getProfil(String ipServer,int port, String numeUtilizator, String parola) {
		ServerJoc server = new ServerJoc("10.0.0.10",3306);
		if(server.conectare()) {
			Utilizator utilizator = new Utilizator();
			utilizator.login("Player 1", "1234");
			ProfilJucator profil = utilizator.getProfil();
			String dateProfil = profil.getDateProfil();
			return profil;
		}
		
		return null;
	}
}
