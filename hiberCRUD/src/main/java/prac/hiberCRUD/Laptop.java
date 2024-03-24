package prac.hiberCRUD;
import jakarta.persistence.*;

@Entity
public class Laptop {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int serialNo;
	private String Model;

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(String model) {
		super();
		Model = model;
	}
	public int getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	@Override
	public String toString() {
		return "Laptop [serialNo=" + serialNo + ", Model=" + Model + "]";
	}
	
}
