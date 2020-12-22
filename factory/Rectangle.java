package io.github.ethankelly;

public class Rectangle implements Shape {

    @Override
    public void draw() {

        // Prints a rectangle to the console
        System.out.println("Drawing a rectangle...");

        System.out.println(" *  *  *  *  *  *  *  *  *  * ");
        System.out.println(" *                          * ");
        System.out.println(" *                          * ");
        System.out.println(" *                          * ");
        System.out.println(" *  *  *  *  *  *  *  *  *  * ");
    }
}
