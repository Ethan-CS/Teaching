package io.github.ethankelly;

public class Circle implements Shape {

    @Override
    public void draw() {

        // Prints a circle to the console
        System.out.println("Drawing a circle...");

        System.out.println("                *  *  *  *  *                ");
        System.out.println("          *  *                 *  *          ");
        System.out.println("       *                             *       ");
        System.out.println("    *                                   *    ");
        System.out.println("    *                                   *    ");
        System.out.println(" *                                         * ");
        System.out.println(" *                                         * ");
        System.out.println(" *                                         * ");
        System.out.println(" *                                         * ");
        System.out.println(" *                                         * ");
        System.out.println("    *                                   *    ");
        System.out.println("    *                                   *    ");
        System.out.println("       *                             *       ");
        System.out.println("          *  *                 *  *          ");
        System.out.println("                *  *  *  *  *                ");
    }
}
