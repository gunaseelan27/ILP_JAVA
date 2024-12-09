package Pages;

import java.util.Scanner;
import java.util.regex.Pattern;

import Operations.ByCostumerId;
import Operations.ByPhno;
import Operations.ByService;

public class Admin {

	public void View() {
		
		
		int k = 0;
		ByCostumerId Cid = new ByCostumerId();
        ByPhno Ph = new ByPhno();
        ByService Bs = new ByService();
		Scanner sc = new Scanner(System.in);
		while(k != 4) {
			System.out.println("Enter query number (1: SearchById, 2: SearchByPhoneNo, 3: SearchByService 4: Exit):");
			
			
			 if (!sc.hasNextInt()) {
	                System.out.println("Invalid input. Please enter a valid number.");
	                sc.next();
	                continue;
	            }

	            int inp = sc.nextInt();
	            sc.nextLine();
	            
	            if(inp == 1) {
	            	System.out.print("Enter Customer Id:");
	            	String id = sc.nextLine();
	            	
	            	Cid.getUsers(id);
	            }else if(inp == 2) {
	            	System.out.print("Enter Phone Number:");
	            	String phno = sc.nextLine();
	            	
	            	if(Pattern.matches("^\\d{10}$",phno)) {
	            		Ph.getUsers(phno);
	            	}
	            	else {
	            		System.out.println("Incorrect format of phone number");
	            	}
	            	
	            	
	            	
	            }else if(inp == 3) {
	            	System.out.print("Enter Service Type:");
	            	String type = sc.nextLine();
	            	
	            
	            	Bs.getUsers(type);
	            }
	            
	            else if (inp == 4) {
	                k = 4;
	                System.out.println("Admin Logged out!");
	            } else {
	                System.out.println("Invalid choice. Please select From 1 to 4.");
	            }
		}
		
	}
	
	

}
