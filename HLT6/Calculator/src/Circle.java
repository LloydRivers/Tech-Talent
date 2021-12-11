import java.util.Scanner;
public class Circle {

	public static void main(String[] args) {
		double radius;
		Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub
        final double Pi = 3.14;
		
		System.out.println("Please enter a value of radius.");
		radius = input.nextDouble();
		System.out.println("The area of the circle is " + Pi*radius*radius);
	}

}
