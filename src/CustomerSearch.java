import java.util.Scanner;

public class CustomerSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the number");
        int n = scanner.nextInt();
        scanner.nextLine(); 

       
        String[] s=new String[n];
        System.out.println("enter customer name");
        for (int i = 0; i < n; i++) {
            s[i]=scanner.nextLine();
        }

    
        System.out.println("Enter the name you want to search");
        String searchName = scanner.nextLine();
  boolean b=false;
        for(int i=0;i<s.length;i++) {
        	if(s[i].equalsIgnoreCase(searchName)) {
        		b=true;
        		break;
        	}
        	}
        if(b) {
        	System.out.println("find");
        }else {
        	System.out.println("not found");
        }
        }
       
    }
