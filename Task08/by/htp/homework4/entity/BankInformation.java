package by.htp.homework4.entity;

import java.util.Objects;

public class BankInformation {

	private long cardNumber;
	private String bankAccountNumber;

	public BankInformation(long cardNumber, String bankAccountNumber) {
		this.cardNumber = cardNumber;
		this.bankAccountNumber = bankAccountNumber.toUpperCase();
	}

	public BankInformation() {

	}

	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bankAccountNumber, cardNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankInformation other = (BankInformation) obj;
		return Objects.equals(bankAccountNumber, other.bankAccountNumber) && cardNumber == other.cardNumber;
	}

	@Override
	public String toString() {
		return "BankInformation [cardNumber=" + cardNumber + ", bankAccountNumber=" + bankAccountNumber + "]";
	}

}
