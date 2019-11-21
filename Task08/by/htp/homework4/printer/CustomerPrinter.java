package by.htp.homework4.printer;

import by.htp.homework4.entity.Customer;
import by.htp.homework4.list.CustomerList;

public class CustomerPrinter {

	public void printCustomer(Customer customer) {

		FullNamePrinter fullNamePrinter = new FullNamePrinter();
		AddressPrinter addressPrinter = new AddressPrinter();
		BankInformationPrinter bankInformationPrinter = new BankInformationPrinter();

		fullNamePrinter.printFullName(customer);
		addressPrinter.printAddress(customer);
		bankInformationPrinter.printBankInformation(customer);

	}

	public void printCustomer(CustomerList customers) {
		customers.getCustomers().forEach(customer -> printCustomer(customer));
		;
	}
}
