package by.htp.homework4.main;

import java.util.ArrayList;
import java.util.List;

import by.htp.homework4.entity.Address;
import by.htp.homework4.entity.BankInformation;
import by.htp.homework4.entity.Customer;
import by.htp.homework4.entity.CustomerList;
import by.htp.homework4.entity.FullName;
import by.htp.homework4.logic.BankInformationLogic;
import by.htp.homework4.logic.CustomerComparator;
import by.htp.homework4.view.CustomerPrinter;
import by.htp.homework4.view.FullNamePrinter;

public class MainCustomer {

	public static void main(String[] args) {
		List<Customer> customersList = new ArrayList<Customer>();

		customersList.add(new Customer(new FullName("Ivan", "Ivanovich", "Ivanov"),
				new Address("USA", "32", "Smallington", "Busha", "21", "A", "158", "1", "85"),
				new BankInformation(1325_1235_5468_1351L, "123551235FGH12332DFHBY231")));

		customersList.add(new Customer(new FullName("Agatha", "Marie", "Black"),
				new Address("USA", "32", "Smallington", "Busha", "21", "A", "158", "1", "85"),
				new BankInformation(8055_9535_5462_1121L, "165412235FFDH12332DFHBY231")));

		customersList.add(new Customer(new FullName("Barrett", "William", "Sinclair"),
				new Address("USA", "32", "Smallington", "Busha", "21", "A", "158", "1", "85"),
				new BankInformation(4523_1325_1235_5468L, "123551235FBGHJGH12332DFHBY231231")));

		customersList.add(new Customer(new FullName("Barrett", "Ailliam", "Sinclair"),
				new Address("USA", "32", "Smallington", "Busha", "21", "A", "158", "1", "85"),
				new BankInformation(4523_1325_1235_5468L, "123551235FBGHJGH12332DFHBY231231")));

		customersList.add(new Customer(new FullName("Carla", "Elizabeth", "Robertson"),
				new Address("USA", "32", "Smallington", "Busha", "21", "A", "158", "1", "85"),
				new BankInformation(1562_1235_5258_1548L, "123551235FGGHKH12332DFHBY231")));

		CustomerList customers = new CustomerList(customersList);

		new FullNamePrinter().printFullName(customers);

		customers.getCustomers().sort(CustomerComparator.FullNameComparator);
		new FullNamePrinter().printFullName(customers);

		CustomerList customersCardRange = new BankInformationLogic().cardRange(customers, 1562_1235_5258_1548L,
				8055_9535_5462_1120L);
		new FullNamePrinter().printFullName(customersCardRange);

		new CustomerPrinter().printCustomer(customersCardRange);
	}

}
