package ase.ro.solid;

public class CreditBankAccount implements Account {

	private long balance;
	private String iban;
	private Person accountHolder;
	
	public CreditBankAccount(String iban, Person accountHolder, long balance) {
		this.iban = iban;
		this.accountHolder = accountHolder;
		this.balance = balance;//il cream deja cu o datorie
	}

	@Override
	public void withdraw(long amount) throws InsuficientFundsException {
		throw new UnsupportedOperationException("Cannot withdraw from this account");
	}

	@Override
	public void deposit(long amount) {
		this.balance += amount;

	}

}
