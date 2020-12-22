package io.github.ethankelly;

public class Square implements Shape {

    @Override
    public void draw() {

        // Prints a square to the console
        System.out.println("Drawing a square...");

        System.out.println(" *  *  *  *  *  *  *  *  *  * ");
        System.out.println(" *                          * ");
        System.out.println(" *                          * ");
        System.out.println(" *                          * ");
        System.out.println(" *                          * ");
        System.out.println(" *                          * ");
        System.out.println(" *                          * ");
        System.out.println(" *                          * ");
        System.out.println(" *                          * ");
        System.out.println(" *  *  *  *  *  *  *  *  *  * ");
    }
}
