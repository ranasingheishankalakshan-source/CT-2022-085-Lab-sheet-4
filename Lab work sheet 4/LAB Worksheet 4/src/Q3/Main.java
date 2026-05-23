package Q3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter inner radius(ri): ");
        double innerRadius = input.nextDouble();

        System.out.print("Enter outer radius(ro): ");
        double outerRadius = input.nextDouble();

        Circle inner = new Circle(innerRadius);
        Circle outer = new Circle(outerRadius);

        double shadedArea;
        shadedArea = outer.computeArea() - inner.computeArea();

        System.out.println("Shaded Area: " + shadedArea);
    }
}