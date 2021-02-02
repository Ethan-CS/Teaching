package arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * Solution to part 1 of the arrays exercises. We are asked to create several types of array, populated
 * with specified values and use particular methods to find out information about them. We are asked
 * to calculate the average (mean) of all the elements of an array, find the first instance of a particular
 * value in an array, find the last such instance and to find all such instances (tricky!).
 * 
 * @author Ethan Kelly
 *
 */
public class ArrayMethods {

	/**
	 * 1.2: When passed an array of double values, we calculate the average (mean) value.
	 * 
	 * @param arr the array of which we want to calculate the mean.
	 * @return the mean of the values in the array we were given.
	 */
	public static double calcMean(double[] arr) {
		double sum = 0.0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		return sum / arr.length;
	}
	
	/**
	 * 1.3: When given an array of integers, we find the first instance of a given element and
	 * return the index of this instance.
	 * 
	 * @param arr the array to find the element in.
	 * @param instance the element we wish to find the first instance of.
	 * @return the first instance of the given element in the given array (if an instance exists).
	 */
	public static int findFirstInstance(int[] arr, int instance) {
		// If there is no instance, the method will return -1 and this will tell us that there is
		// no instance of the specified element in the array.
		int index = -1;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == instance) {
				index = i;
				break;
			}
		}
		
		return index;
	}
	
	/**
	 * 1.4: When given an array of integers, we find the last instance of a given element and
	 * return the index of this instance.
	 * 
	 * @param arr the array to find the element in.
	 * @param instance the element we wish to find the last instance of.
	 * @return the last instance of the given element in the given array (if an instance exists).
	 */
	public static int findLastInstance(int[] arr, int instance) {
		// If there is no instance, the method will return -1 and this will tell us that there is
		// no instance of the specified element in the array.
		int index = -1;
		
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] == instance) {
				index = i;
				break;
			}
		}
		
		return index;
	}
	
	/**
	 * 1.5: When given an array of integers, we find all instance of a given element and
	 * return an array containing the indices (or singular index, or empty array) of any instance(s).
	 * 
	 * @param arr the array to find the element in.
	 * @param instance the element we wish to find any instances of.
	 * @return an array containing the location(s) of any instances of the given element (if any instance exists).
	 */
	public static int[] findAllInstances(int[] arr, int instance) {
		// If there is no instance, the method will return an array filled with -1 and this will tell
		// us that there is no instance of the specified element in the array.
		int[] instances = new int[arr.length];
			Arrays.fill(instances, -1);
			
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == instance) {
				instances[counter] = i;
				counter++;
			}
		}
		// Return an array of the correct size - the counter has kept track of how many instances we found.
		return Arrays.copyOf(instances, counter);
	}
	
	public static void main(String[] args) {
		// 1.1
		double[] doubleArr = new Random().doubles(100).toArray();
		System.out.println(Arrays.toString(doubleArr));
		
		// 1.2
		calcMean(doubleArr); 
		
		// 1.3
		int[] intArr = new Random().ints(10, 0, 11).toArray();
		System.out.println(Arrays.toString(intArr));
		int firstInstance = findFirstInstance(intArr, 1);
		if (firstInstance == -1) {
			System.out.println("No instance of 1 in the array.");
		} else {
			System.out.println("First instance of 1 is at position " + firstInstance);
		}
		
		// 1.4
		int lastInstance = findLastInstance(intArr, 1);
		if (lastInstance > -1) {
			System.out.println("Last instance of 1 is at position " + lastInstance);
		}
		
		//1.5
		int[] allInstances = findAllInstances(intArr, 1);
		if (allInstances.length > 0) {
			System.out.println("Indices of all instances of 1: " + Arrays.toString(allInstances));
		}
	}
}
