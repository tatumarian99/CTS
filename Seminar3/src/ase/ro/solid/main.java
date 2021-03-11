package ase.ro.solid;

import java.util.HashMap;
import java.util.Map;

public class main {

	public static void main(String[] args) {
		Map<Person, BankAccount> employees = new HashMap <> ();
		
		//cream persoane pe care sa le adaugam in structura
		Person p1 = new Person("Chuck Noris");
		BankAccount b1 = new BankAccount("RF4876R8734678434", p1);
		
		Person p2 = new Person("Arnols");
		BankAccount b2 = new FeeBankAccount("ING4876R8734678434", p2);
		
		Person p3 = new Person("Van Damme");
		BankAccount b3 = new BankAccount("BT4876R8734678434", p3);
		
		employees.put(p1, b1);
		employees.put(p2, b2);
		employees.put(p3, b3);
		
		//e ziua de salariu si vrem sa le adaugam bani in cont
		for(Account a : employees.values()) {
			a.deposit(1000);
		}
		
		for(Account a : employees.values()) {
			try {
				a.withdraw(10);
			} catch (InsuficientFundsException ex) {
				System.out.println(ex.getMessage());
			}
		}
	}

}
