package objects; // Remember to change this when importing (or put inside an Eclipse package called 'objects')

public class Student extends Person {
	private double gpa; // The only extra attribute besides those in Person

	public Student(String name, int age, String eyeColour, double gpa) {
		super(name,age,eyeColour); // Makes the person
		this.setGpa(gpa); // Sets the GPA using setter below
	}
	
	public double getGpa() {
		return gpa; 
	}
	
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	// Override toString so it does something different for students
	@Override
	public String toString() {
		String toPrint = "The student " + super.getName()
				+ " (" + super.getAge() + ")" 
				+ " has " + super.getEyeColour() + " eyes" 
				+ " and a GPA of " + String.format("%.1f", gpa) + "."; 
		
		return toPrint;
	}
}