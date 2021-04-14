package sem8.facade.ase.ro;

public class Utilizator {
	public void login(String userName, String password) {
		System.out.println("Login");
	}
	public ProfilJucator getProfil() {
		return new ProfilJucator();
	}
}
