package PiecewiseAPP;
import java.util.Scanner;

public class PiecewiseAPP {

	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
		
		// get the user input
		System.out.print("Enter an integer x.");
		int x=userinput.nextInt();
		
		// perform the calculations
		if(x<0) {System.out.println("Output: " + (x*3+7));}
		if(x>=0 && x<=10) {System.out.println("Output: " + (Math.pow(x, 2)+8));}
		if(x>10) {System.out.println("Output: " + (Math.pow(x, 3)-6*Math.pow(x, 2)));}
		
	
	}

}
