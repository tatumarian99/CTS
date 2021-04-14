package sem8.facade.ase.ro;

public class TestFacade {

	public static void main(String[] args) {
		ServerJoc server = new ServerJoc("10.0.0.10",3306);
		if(server.conectare()) {
			Utilizator utilizator = new Utilizator();
			utilizator.login("Player 1", "1234");
			ProfilJucator profil = utilizator.getProfil();
			String dateProfil = profil.getDateProfil();
		}
		
		ProfilJucator profil2=APIJocFacade.getProfil("10.0.0.1", 3306, "player2", "123456");
		String dateProfil=profil2.getDateProfil();

	}

}
