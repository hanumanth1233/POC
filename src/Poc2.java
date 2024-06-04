import java.util.Scanner;

public class Poc2 {

	public static void main(String[] args) {
		Scanner scn=new  Scanner(System.in);
		System.out.println("enter the number of cargos");
		int numcargos=scn.nextInt();
		scn.nextLine();
		
		System.out.println("enter the cargo id");
		int[] n=new int[numcargos];
		for(int i=0;i<numcargos;i++) {
			n[i] =scn.nextInt();
			scn.nextLine();
			
			
		}
		System.out.println("enter the number of shifment");
		int numShifments=scn.nextInt();
		scn.nextLine();
		

		System.out.println("enter the shiftments name");
		String[] s=new String[numShifments];
		for(int i=0;i<numShifments;i++) {
			s[i]=scn.nextLine();
		}
			
		System.out.println("enter the  cargo id");
		int searchid=scn.nextInt();
		String result="yet to be shifted";
		for(int i=0;i<numcargos;i++) {
			if(n[i]==searchid) {
				if(i<numShifments) {
					result=s[i];
				}
				break;
			}
		}
		System.out.println(result);
		scn.close();
		}
	}


