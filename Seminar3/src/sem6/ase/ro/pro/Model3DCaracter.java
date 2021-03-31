package sem6.ase.ro.pro;

import java.util.ArrayList;
import java.util.Random;

public class Model3DCaracter {
	String culoare;
	int inaltime;
	ArrayList<Integer> puncte=new ArrayList<>();
	public Model3DCaracter(String culoare) {
		this.culoare=culoare;
		System.out.println("Incarcare model 3d din fisier....");
		try {
			Thread.sleep(2000);
			Random random=new Random(10);
			for(int i=0;i<20;i++) {
				this.puncte.add(random.nextInt(1000));
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
