import java.util.Scanner;
public class Math_Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double number1;
		double number2;
		String answer;
		Scanner input = new Scanner(System.in);
		    
		    do {
		    	System.out.println("Please enter two numbers.");
		    	number1 = input.nextDouble();
		    	number2 = input.nextDouble();
		    	
		    	System.out.println("Please select from the following");
		    	System.out.println(" +, -, /, *, %");
		    	String op = input.next();
		    	
		    	switch(op) {
		    	case "+":
		    		System.out.println(number1 + number2);
		    		break;
		    	case "-":
		    		System.out.println(number1 - number2);
		    		break;
		    	case "/":
		    		System.out.println(number1 / number2);
		    		break;
		    	case "*":
		    		System.out.println(number1 * number2);
		    		break;
		    	case "%":
		    		System.out.println(number1 % number2);
		    		break;
		    		default:
		    		
			    		System.out.println("plesse enter a valied operator");
			    		break;
		    	}
		    	System.out.println("Do you want to continue ? (yes/no) : ");
		    	answer = input.next();
		    	
		    } while(answer.equalsIgnoreCase("yes"));
		
		
	}

}
