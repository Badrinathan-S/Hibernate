package hibernate_CRUDL;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "employee_id")
	private Integer ID;
	@Column(name = "employee_name")
	private String Name;
	@Column(name = "employee_salary")
	private Integer Salary;
	@Column(name = "employee_designation")
	private String Designation;
	
	
	@Override
	public String toString() {
		return "employee [ID=" + ID + ", Name=" + Name + ", Salary=" + Salary + ", Designation=" + Designation + "]";
	}
	/**
	 * 
	 */
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param name
	 * @param salary
	 * @param designation
	 */
	public Employee(String name, Integer salary, String designation) {
		super();
		Name = name;
		Salary = salary;
		Designation = designation;
	}
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Integer getSalary() {
		return Salary;
	}
	public void setSalary(Integer salary) {
		Salary = salary;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	
	
	
}
