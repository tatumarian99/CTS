package ase.ro.solid;

public interface Payable {
	void withdraw(long amount) throws InsuficientFundsException;

}
