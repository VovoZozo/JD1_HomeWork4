package by.htp.homework4.entity;

import java.util.List;
import java.util.Objects;

public class CustomerList {

	private List<Customer> customers;

	public CustomerList() {

	}

	public CustomerList(List<Customer> customers) {
		this.customers = customers;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public Customer getCustomers(int i) {
		return customers.get(i);
	}

	public void setCustomers(Customer customer) {
		this.customers.add(customer);
	}

	@Override
	public int hashCode() {
		return Objects.hash(customers);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerList other = (CustomerList) obj;
		return Objects.equals(customers, other.customers);
	}

	@Override
	public String toString() {
		return "CustomerList [\ncustomers=" + customers + "]";
	}

}
