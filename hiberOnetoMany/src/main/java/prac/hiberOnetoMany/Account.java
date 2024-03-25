package prac.hiberOnetoMany;

import jakarta.persistence.*;

@Entity
public class Account {
	@Id
	private String AccontNumber;

	private String Account_Type;
	private String Account_Category;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Account(String accontNumber, String account_Type, String account_Category) {
		super();
		AccontNumber = accontNumber;
		Account_Type = account_Type;
		Account_Category = account_Category;
	}
	public String getAccontNumber() {
		return AccontNumber;
	}
	public void setAccontNumber(String accontNumber) {
		AccontNumber = accontNumber;
	}
	public String getAccount_Type() {
		return Account_Type;
	}
	public void setAccount_Type(String account_Type) {
		Account_Type = account_Type;
	}
	public String getAccount_Category() {
		return Account_Category;
	}
	public void setAccount_Category(String account_Category) {
		Account_Category = account_Category;
	}

	@Override
	public String toString() {
		return "Account [AccontNumber=" + AccontNumber + ", Account_Type=" + Account_Type + ", Account_Category="
				+ Account_Category + "]";
	}
	
}
