package by.htp.homework4.entity;

import java.util.Objects;

public class Customer {

	private FullName fullName;
	private Address address;
	private BankInformation bankInformation;

	public Customer() {

	}

	public Customer(FullName fullName, Address address, BankInformation bankInformation) {
		this.fullName = fullName;
		this.address = address;
		this.bankInformation = bankInformation;
	}

	public FullName getFullName() {
		return fullName;
	}

	public void setFullName(FullName fullName) {
		this.fullName = fullName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public BankInformation getBankInformation() {
		return bankInformation;
	}

	public void setBankInformation(BankInformation bankInformation) {
		this.bankInformation = bankInformation;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, bankInformation, fullName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(address, other.address) && Objects.equals(bankInformation, other.bankInformation)
				&& Objects.equals(fullName, other.fullName);
	}

	@Override
	public String toString() {
		return "\nCustomer [\nfullName=" + fullName + ",\naddress=" + address + ",\nbankInformation=" + bankInformation
				+ "\n]";
	}

}
