package by.htp.homework4.logic;

import java.util.ArrayList;
import java.util.List;

import by.htp.homework4.entity.Customer;
import by.htp.homework4.entity.CustomerList;

public class BankInformationLogic {

	public CustomerList cardRange(CustomerList list, long lower, long upper) {

		List<Customer> customers = list.getCustomers();
		List<Customer> cardRange = new ArrayList<Customer>();

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
