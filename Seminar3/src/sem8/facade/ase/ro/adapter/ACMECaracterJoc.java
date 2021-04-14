package sem8.facade.ase.ro.adapter;

public abstract class ACMECaracterJoc {
	protected String nume;
	protected int puncteViata;
	
	public ACMECaracterJoc(String nume, int puncteViata) {
		super();
		this.nume = nume;
		this.puncteViata = puncteViata;
	}
	
	public abstract void seDeplaseaza();
	public abstract void esteLovit(int puncte);
	public abstract void seVindeca(int puncte);
}
