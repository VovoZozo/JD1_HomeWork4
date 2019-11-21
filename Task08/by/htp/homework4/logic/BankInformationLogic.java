package by.htp.homework4.logic;

import java.util.ArrayList;

import by.htp.homework4.entity.Customer;
import by.htp.homework4.list.CustomerList;

public class BankInformationLogic {

	public CustomerList cardRange(CustomerList list, long lower, long upper) {

		ArrayList<Customer> customers = list.getCustomers();
		ArrayList<Customer> cardRange = new ArrayList<Customer>();

		for (int i = 0; i < customers.size(); i++) {
			long cardNumber = customers.get(i).getBankInformation().getCardNumber();
			if (cardNumber >= lower && cardNumber <= upper) {
				cardRange.add(customers.get(i));
			}
		}

		CustomerList newList = new CustomerList(cardRange);

		return newList;
	}

}
