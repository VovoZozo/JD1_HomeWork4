package by.htp.homework4.printer;

import by.htp.homework4.entity.BankInformation;
import by.htp.homework4.entity.Customer;
import by.htp.homework4.entity.CustomerList;

public class BankInformationPrinter {

	public void printBankInformation(Customer customer) {
		printBankInformation(customer.getBankInformation());
	}

	public void printBankInformation(CustomerList customers) {
		customers.getCustomers().forEach(customer -> printBankInformation(customer.getBankInformation()));
	}

	public void printBankInformation(BankInformation bankInformation) {
		System.out.println("Bank Information:");
		System.out.println("Card Number --- " + bankInformation.getCardNumber() + ";");
		System.out.println("Bank Account Number --- " + bankInformation.getBankAccountNumber() + ".\n");
	}

}
