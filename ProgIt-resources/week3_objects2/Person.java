package objects; // Remember to change this when importing (or put inside an Eclipse package called 'objects')

/**
 * Solution to Objects, Exercise 1: People
 * 
 * @author Ethan Kelly
 *
 */
public class Person {
		private String name;
		private int age;
		private String eyeColour;
		
		public Person(String name, int age, String eyeColour) {
			this.setName(name);
			this.setAge(age);
			this.setEyeColour(eyeColour);
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public int getAge() {
			return age;
		}
		
		public void setAge(int age) {
			this.age = age;
		}
		
		public String getEyeColour() {
			return eyeColour;
		}
		
		public void setEyeColour(String eyeColour) {
			this.eyeColour = eyeColour;
		}
		
		@Override
		public String toString() {
			return name + " (" + age + ") has " + eyeColour + " eyes.";
		}
		
	}

