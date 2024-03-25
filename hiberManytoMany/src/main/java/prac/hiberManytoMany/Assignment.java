package prac.hiberManytoMany;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Assignment {
	@Id
	private String Assignment_code;
	private String Subject;
	
	@ManyToMany(mappedBy = "assignments")
	private List<Student> students;

	public Assignment(String assignment_code, String subject) {
		super();
		Assignment_code = assignment_code;
		Subject = subject;
	}

	public String getAssignment_code() {
		return Assignment_code;
	}

	public void setAssignment_code(String assignment_code) {
		Assignment_code = assignment_code;
	}

	public String getSubject() {
		return Subject;
	}

	public void setSubject(String subject) {
		Subject = subject;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public Assignment() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Assignment [Assignment_code=" + Assignment_code + ", Subject=" + Subject + ", students=" + students
				+ "]";
	}
	
	
	
}
