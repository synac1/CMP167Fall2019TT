/*
 * Author: Yanilda 
 * Desc: Welcome message
 */
import java.util.Scanner;

public class Welcome {
	
	public static void main (String[] args) {
		
		//Create a welcome message and store in variable
		String welcome = "Welcome to Java World";
		//Output the welcome message
		System.out.println(welcome);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("I'm a program, what is your name?");
		
		String name=input.nextLine();
		
		System.out.println("Nice to meet you, "+name+"!");
		
	}

}
