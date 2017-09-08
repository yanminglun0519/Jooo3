/**
* CS180-HW02
*
* To create a username generator that creates a username combined with the input's first initial,last name, and age.
*
* @author Yan,MIng-Lun yan261@purdue.edu
*
* @version 2017/09/08
*
*/

import java.util.Scanner;

public class UsernameGen{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("What is your full name?");
		String name = s.nextLine();
		int space = name.indexOf(" ");
		int p = space + 1;
		char initial = name.charAt(0);
		String last = name.substring(p,name.length());
		System.out.println("What is your birth year?");
		int year = s.nextInt();
		int age = 2017-year;
		System.out.println("Your username is"+" "+ Character.toLowerCase(initial)+last.toLowerCase()+age);
	}
}
