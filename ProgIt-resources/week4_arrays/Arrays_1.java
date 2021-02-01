import java.util.Arrays;

/**
 * This example is from the lectures for Programming(IT), where we are asked to find:
 * <ul>
 *     <li> The first instance of a specified element in a given array.
 *     <li> The final instance of a specified element in a given array.
 * </ul>
 * We then include another method that returns the locations of all instances of the specified
 * element of the array, as an array itself. All of these methods print their results to the console
 * for verification. If there is no first or last instance, the methods that would find them
 * return -1 - this is an impossible array index, so we know that if a method returns this, it cannot
 * be the case that the array we gave the method has a single instance of the element we specified.
 * For the method that returns all locations, if there are no instances then it will return an 
 * empty array.
 *
 * @author Ethan Kelly
 */
public class Arrays_1 {
    /**
     * This method finds the first location of a given element in the given array, if it exists.
     * If not, return -1 (so that we know there's no instance of the element in the whole array).
     *
     * @param lookFor the element we're trying to look for.
     * @param array the array we want to search for the element in.
     * @return the first location of the element in the array, if it exists.
     */
    public static int findFirstLocation(int lookFor, int[] array) {
        // Initialise the first location variable to -1
        // if the method returns -1, this variable has remained unchanged
        // meaning there is no instance of lookFor in array.
        int firstLocation = -1;
        
        // Loop through the array
        for (int i = 0; i < array.length; i++) {
            // If the element at index i is the element we're looking for,
            // store the index in firstLocation and break the loop.
            if (array[i] == lookFor) {
                firstLocation = i;
                break;
            }
        }
        // If we have a first instance of the element, print it
        // Otherwise, firstLocation must still be -1 and we don't have an instance.
        if (firstLocation >= 0) {
            System.out.println("First occurrence of " + lookFor + " is at position " + firstLocation);
        } else {
            System.out.println("No instance in the array.");
        }

        return firstLocation;
    }

    /**
     * This method finds the last location of a given element in the given array, if it exists.
     * If not, return -1 (so that we know there's no instance of the element in the whole array).
     *
     * @param lookFor the element we're trying to look for.
     * @param array the array we want to search for the element in.
     * @return the final location of the specified element in the array, if it exists.
     */
    public static int findLastLocation(int lookFor, int[] array) {
        // Initialise the first location variable to -1
        // if the method returns -1, this variable has remained unchanged
        // meaning there is no instance of lookFor in array.
        int lastLocation = -1;

        // Loop (backwards) through the array
        for (int i = array.length - 1; i >= 0; i--) {
            // If the element at index i is the element we're looking for,
            // store the index in lastLocation and break the loop.
            if (array[i]==lookFor) {
                lastLocation = i;
                break;
            }
        }

        // If we have a last instance of the element, print it
        // Otherwise, lastLocation must still be -1 and we don't have an instance.
        if (lastLocation >= 0) {
            System.out.println("Last occurrence of " + lookFor + " is at position " + lastLocation);
        } else {
            System.out.println("No instance in the array.");
        }
        return lastLocation;
    }

    /**
     * This method finds all instances of a given element in the given array, if any exist.
     * If not, returns an empty array.
     *
     * @param lookFor the element we're trying to look for.
     * @param array the array we want to search for the element in.
     * @return integer array of locations of the specified element in the array, if it exists.
     */
    public static int[] findAllLocations(int lookFor, int[] array) {
        // We could have an array that is filled with lookFor, so the max size of
        // the array containing locations of all instances is array.length.
        int[] locations = new int[array.length];

        // The counter will let us know how many instances we have found
        // So we know how big the array we return will have to be.
        int counter = 0;
        
        // Loop through the array
        for (int i = 0; i < array.length; i++) {
            // Store the locations of any instances of lookFor in array
            // in the locations array that we will return.
            if (array[i] == lookFor) {
                locations[counter++] = i;
            }
        }
        // Set locations equal to a copy of locations of length "counter" -
        // This ensures only the correct length array is printed and returned
        locations = Arrays.copyOf(locations, counter);
        System.out.println("The element " + lookFor + " can be found at " + Arrays.toString(locations));
        return locations;
    }

    public static void main(String[] args) {
        // The array example from lecture slides.
        // Feel free to change to test different arrays.
        int[] array = {4, 3, 17, 8, 3, -6}; 

        // The element we want to look for.
        // Feel free to change to find different elements.
        int lookFor = 3; 

        // Let's test the methods to make sure they return the correct location
        int firstLocation = findFirstLocation(lookFor, array);
        int lastLocation = findLastLocation(lookFor, array);
        int[] allLocations = findAllLocations(lookFor, array);
    }

}
