package prac.hiberManytoMany;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Student {
	@Id
	private int Student_roll_no;
	private String Student_name;
	private String batch;
	
	@ManyToMany
	private List<Assignment> assignments;
	
	public List<Assignment> getAssignments() {
		return assignments;
	}
	public void setAssignments(List<Assignment> assignments) {
		this.assignments = assignments;
	}
	public int getStudent_roll_no() {
		return Student_roll_no;
	}
	public void setStudent_roll_no(int student_roll_no) {
		Student_roll_no = student_roll_no;
	}
	public String getStudent_name() {
		return Student_name;
	}
	public void setStudent_name(String student_name) {
		Student_name = student_name;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	
	public Student(int student_roll_no, String student_name, String batch) {
		super();
		Student_roll_no = student_roll_no;
		Student_name = student_name;
		this.batch = batch;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [Student_roll_no=" + Student_roll_no + ", Student_name=" + Student_name + ", batch=" + batch
				+ "]";
	}
	
	
}
