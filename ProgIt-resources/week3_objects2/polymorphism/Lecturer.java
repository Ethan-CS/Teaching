package objects;

public class Lecturer extends Person {
	private double salary; // The only extra attribute besides those in Person

	public Lecturer(String name, int age, String eyeColour, double salary) {
		super(name, age, eyeColour);
		this.setSalary(salary);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	// Override toString so it does something different for lecturers
	@Override
	public String toString() {
		String toPrint = "The lecturer " + super.getName() 
				+ " (" + super.getAge() + ")" 
				+ " has " + super.getEyeColour() + " eyes" 
				+ " and their salary is £" + String.format("%.2f", salary) + " per year.";

		return toPrint;
	}
}
