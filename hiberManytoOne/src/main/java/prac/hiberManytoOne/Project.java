package prac.hiberManytoOne;

import jakarta.persistence.*;

@Entity
public class Project {
	@Id
	private String project_ID;
	private String project_name;
	public String getProject_ID() {
		return project_ID;
	}
	public void setProject_ID(String project_ID) {
		this.project_ID = project_ID;
	}
	public String getProject_name() {
		return project_name;
	}
	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}
	@Override
	public String toString() {
		return "Project [project_ID=" + project_ID + ", project_name=" + project_name + "]";
	}
	public Project(String project_ID, String project_name) {
		super();
		this.project_ID = project_ID;
		this.project_name = project_name;
	}
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
