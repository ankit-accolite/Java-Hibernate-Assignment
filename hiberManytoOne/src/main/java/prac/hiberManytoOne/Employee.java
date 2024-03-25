package prac.hiberManytoOne;

import jakarta.persistence.*;

@Entity
public class Employee {
	@Id
	private String Emp_ID;
	private String Emp_Name;
	private String Emp_Job_Ttitle;
	
	@ManyToOne
	private Project project;

	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String emp_ID, String emp_Name, String emp_Job_Ttitle, Project project) {
		super();
		Emp_ID = emp_ID;
		Emp_Name = emp_Name;
		Emp_Job_Ttitle = emp_Job_Ttitle;
		this.project = project;
	}

	public String getEmp_ID() {
		return Emp_ID;
	}

	public void setEmp_ID(String emp_ID) {
		Emp_ID = emp_ID;
	}

	public String getEmp_Name() {
		return Emp_Name;
	}

	public void setEmp_Name(String emp_Name) {
		Emp_Name = emp_Name;
	}

	public String getEmp_Job_Ttitle() {
		return Emp_Job_Ttitle;
	}

	public void setEmp_Job_Ttitle(String emp_Job_Ttitle) {
		Emp_Job_Ttitle = emp_Job_Ttitle;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	@Override
	public String toString() {
		return "Employee [Emp_ID=" + Emp_ID + ", Emp_Name=" + Emp_Name + ", Emp_Job_Ttitle=" + Emp_Job_Ttitle
				+ ", project=" + project + "]";
	}
}
