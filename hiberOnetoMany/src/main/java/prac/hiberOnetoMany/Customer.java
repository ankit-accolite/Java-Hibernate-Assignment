package prac.hiberOnetoMany;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Customer {
	@Id
	private String Customer_ID;
	private String Customer_Name;
	private String Customer_DOB;
	
	@OneToMany
	private List<Account> accounts;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String customer_ID, String customer_Name, String customer_DOB, List<Account> accounts) {
		super();
		Customer_ID = customer_ID;
		Customer_Name = customer_Name;
		Customer_DOB = customer_DOB;
		this.accounts = accounts;
	}

	public String getCustomer_ID() {
		return Customer_ID;
	}

	public void setCustomer_ID(String customer_ID) {
		Customer_ID = customer_ID;
	}

	public String getCustomer_Name() {
		return Customer_Name;
	}

	public void setCustomer_Name(String customer_Name) {
		Customer_Name = customer_Name;
	}

	public String getCustomer_DOB() {
		return Customer_DOB;
	}

	public void setCustomer_DOB(String customer_DOB) {
		Customer_DOB = customer_DOB;
	}

	public List<Account> getAccounts() {
		return accounts;
	}


	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}


	@Override
	public String toString() {
		return "Customer [Customer_ID=" + Customer_ID + ", Customer_Name=" + Customer_Name + ", Customer_DOB="
				+ Customer_DOB + ", account=" + accounts + "]";
	}
	
} 
