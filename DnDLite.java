/**
* cs180- Lab03
*
* Create a DnDLite game using decision making tools
*
* @author Yan,Ming-Lun yan261@purdue.edu
*
* @version 2017/09/07
*
*/

import java.util.Scanner;
import java.util.Random;

public class DnDLite{

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.printf("Welcome, Please enter your name: ");
		String name = s.nextLine();
		int choice1;
		int choice2;
		int choice3;
		int choice4;
		int STR = 0;
		int CON = 0;
		int INT = 0;
		int DEX = 0;
		System.out.printf("For your STRENGTH stat, enter 1 to gain a random value and 2 to set it to 10: ");	
		choice1 = s.nextInt();
		switch(choice1){
		
		case 1:{
		Random r = new Random();
		STR = r.nextInt((20)+1);
		break;
		}
		case 2:
		STR = 10;
		break;

		default :
		System.out.println("Please enter 1 or 2");
		}
               

		 System.out.printf("For your CONSTITUTION stat, enter 1 to gain a random value and 2 to set it to 10: ");
                choice2 = s.nextInt();
                switch(choice2){

                case 1:{
		Random r1 = new Random();
                CON = r1.nextInt((20)+1);
                break;
          	}
                case 2:
                CON = 10;
                break;

                default :
                System.out.println("Please enter 1 or 2");
                }
                System.out.printf("For your INTELLIGENCE stat, enter 1 to gain a random value and 2 to set it to 10: ");
                choice3 = s.nextInt();
                switch(choice3){

                case 1:{
                Random r2 = new Random();
		INT = r2.nextInt((20)+1);
                break;
                }
                case 2:
                INT = 10;
                break;

                default :
                System.out.println("Please enter 1 or 2");
                }
		System.out.printf("For your DEXTERITY stat, enter 1 to gain a random value and 2 to set it to 10: ");
                choice4 = s.nextInt();
                switch(choice4){

                case 1:{
		Random r3 = new Random();
                DEX = r3.nextInt((20)+1);
                break;
		}
                case 2:
                DEX = 10;
                break;

                default :
                System.out.println("Please enter 1 or 2");
                }
		int sum = STR+CON+INT+DEX;
		
		System.out.printf("Name:%s\nSTR:%d\nCON:%d\nINT:%d\nDEX:%d\nStat Tota:%d\n",name,STR,CON,INT,DEX,sum);
		
		if (sum<20) {
		System.out.printf("Gonna try to help you out~");
		Random r4 = new Random();
		int help = r4.nextInt((20)+1);
		
			if (help>2) {
			System.out.println("Good for you,your lowest stat is just changed to 20");
				if(STR<CON && STR<INT && STR <DEX) {
				STR=20;
				}				                                		if(CON<STR && CON<INT && CON <DEX) {                                		CON=20;
				}
				if(INT<STR && INT<CON && INT <DEX) {
				INT=20;
				}
				if(DEX<STR && DEX<INT && DEX <CON) {
				DEX=20;
				}
			else {
			System.out.println("Oops,your stats remain unchanged");
			}
			}
			}
		else if (sum>=20 && sum<39){
		System.out.println("Unlucky");
		}
		else if (sum>=40 && sum<59){
		System.out.println("So so");
		}
		else if (sum>=60 && sum<69){
		System.out.println("Not bad");
		}
		else if (sum>=70 && sum<=80){
		System.out.println("RNG god");
		}
		else {
		System.out.println("Holy hacks");
		}
		
	}
}
