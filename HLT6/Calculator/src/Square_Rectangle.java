import java.util.Scanner;

public class Square_Rectangle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double height, width;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a width.");
		width = input.nextDouble();
		
		System.out.println("Please enter a height.");
		height = input.nextDouble();
		
		double area = width * height;
		if(height != width) {
			System.out.println("The area of your rectangle " + area);
		} else {
			System.out.println("The area of your square " + area);
		}
		
		
		
	}

}
