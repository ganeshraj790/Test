package iterator;

public class Employee {
	String name;
	int salary;
	int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setid(int id) {
		this.id=id;
	}
	public int getid() {
		return id;
	}
	public Employee(String name,int salary,int id) {
		this.name=name;
		this.salary=salary;
		this.id=id;
	}
	public String toString() {
		return name+", "+salary+", "+id;
	}
	

}
