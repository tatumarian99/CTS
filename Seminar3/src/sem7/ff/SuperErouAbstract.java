package sem7.ff;

public abstract class SuperErouAbstract {
	String nume;
	int puncteViata;
	
	public abstract void seDeplaseaza();

	protected SuperErouAbstract(String nume, int puncteViata) {
		super();
		this.nume = nume;
		this.puncteViata = puncteViata;
	}
	
}
