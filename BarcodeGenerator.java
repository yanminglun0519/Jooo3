/** CS180-Lab02
*
* To create a barcode using primitives and strings
*
* @author Yan,Ming-Lun yan261@purdue.edu
*
* @version 08/31/2017
*
*/

import java.util.Scanner;
public class BarcodeGenerator{
	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);
		String Name;
		int Room;
		int Barcode= 0;
		Name= scan.nextLine();
		Room= scan.nextInt();
		
		System.out.println(Name);
		System.out.println(Room);
		Barcode+= (byte)Name.charAt(0);
		Barcode+= (byte)Name.charAt(1)<<8;
		Barcode+= (byte)Name.charAt(2)<<16;
		Barcode+= (byte)Name.charAt(3)<<24;
		System.out.println(Barcode+" "+Room);
		scan.close();
	}

}
