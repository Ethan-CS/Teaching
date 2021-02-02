package arrays; // Remember to change this when importing (or put inside an Eclipse package called 'arrays')

import java.util.Arrays;

/**
 * Class from a previous Objects exercise, used in the solution for Arrays question 3 - Arrays of objects.
 * We are asked to create an array of people and create legitimate Person objects for each element in
 * this array. We then modify the Person object so that it has a new attribute (e.g. children) and we
 * see how to make arrays longer in Java in doing this.
 * 
 * @author Ethan Kelly
 *
 */
public class Person {
		private String name;
		private int age;
		private String eyeColour;
		private Person[] children; // 3.4 - new attribute (children a person has)
		
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
		
		/**
		 * Task 3.4 - create a new attribute that stores the number of children a Person has. A person
		 * can have a maximum of 3 children. This method gets the current Person array of children the
		 * Person in question has.
		 * 
		 * @return the children (as a Person array) the current person has.
		 */
		public Person[] getChildren() {
			return children;
		}

		/**
		 * Task 3.4 - create a new attribute that stores the number of children a Person has. A person
		 * can have a maximum of 3 children. This method sets the Person array of children this person has.
		 * 
		 * @param children the Person array of children this person has.
		 */
		public void setChildren(Person[] children) {
			this.children = children;
		}
		
		@Override
		public String toString() {
			Person[] children = getChildren();
			String names = " ";
			for (int i = 0; i < children.length; i++) {
				names += children[i].getName() + " (" + children[i].getAge() + "), " + children[i].getEyeColour() + " eyes. ";
				
			}
			
			return this.getName() + " (" + this.getAge() + ") has " + this.getEyeColour() + " eyes.\n" 
					+ "Their children are:" + names;
		}
		
		public static void main(String[] args) {
			// 3.1 Create a Person array of size 4 and try to call a method on it.
			Person[] people = new Person[4];
			// System.out.println(people[0].getAge());
			// If we try and run this, we get:
			// "Cannot invoke "arrays.Person.getAge()" because "people[0]" is null"
			
			// 3.2 Set all elements of the Person array to refer to legitimate Person objects
			String[] names = new String[] {"Jenny", "David", "Rudi", "Glenda"};
			int[] ages = new int[] {25, 72, 46, 39};
			String[] eyeColours = new String[] {"Blue","Green","Brown","Brown"};
			for (int i = 0; i < people.length; i++) {
				people[i] = new Person(names[i], ages[i], eyeColours[i]);
			}
			
			// 3.3 Compute the sum of the ages in the Person array
			int totalAge = 0;
			for (int j = 0; j < people.length; j++) {
				totalAge += people[j].getAge();
			}
			System.out.println("Sum of ages: " + totalAge);
			
			// 3.4, 3.5
			// Yes, I know everyones' children have the same names, ages and eye colours - I don't have that much imagination...
			Person[] childrenToSet = new Person[3];
					childrenToSet[0] = new Person("Johnny", 1, "Blue");
					childrenToSet[1] = new Person("Bonnie", 3, "Brown"); 
					childrenToSet[2] = new Person("Charlie", 7, "Brown");
			
			for (int k = 0; k < people.length; k++) {
					people[k].setChildren(childrenToSet);
					System.out.println(people[k]);
			}	
		}
		
	}

