import java.util.Arrays;
import java.util.Scanner;

public class Poc1 {

	public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    System.out.println("enter the number");
    int arr=scn.nextInt();
    scn.nextLine();
      String[] s=new String[arr];
      System.out.println("enter customer name");
      for(int i=0;i<s.length;i++) {
    	  s[i]=scn.nextLine();   
      }
      System.out.println("eneter a customer search name");
      String searchname=scn.nextLine();
      boolean anyMatch = Arrays.stream(s).anyMatch(customer->customer.equalsIgnoreCase(searchname));
     
      if(anyMatch) {
    	  System.err.println("customer  found");
      }else {
    	  System.out.println("customer not  found");
      }
	
     
    
	}

}

