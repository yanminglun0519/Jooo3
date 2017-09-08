import java.util.Scanner;
import javax.swing.*;

public class BusinessCard{

	public static void main(String[] args) {
		
		scanner scan = new scanner(System.In);

		System.out.printIn("Enter your Name:");
		int Name = scan.nextInt();

		System.out.printIn("Enter your Age:");
		int Age  = scan.nextInt();
		
		System.out.printIn(Name+Age);

		scan.close();
	}
}
