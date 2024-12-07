package Pages;
import java.util.*;
import java.util.regex.Pattern;
public class UserRegister {
	Scanner scanner = new Scanner(System.in);
	String userId;
	String name;
	String email;
	String password;
	String address;
	String contact;
	
	HashMap<HashMap<String,String>> UserDetails = {"id":"id123",""}
	public void createUser() {
		
        int k=1;
        while(k==1) {
			System.out.print("Enter User ID: ");
			userId = scanner.nextLine(); 
			        	
			if(Pattern.matches("[a-zA-Z0-9]+",userId)) {
				System.out.print("Enter Name: ");
			    name = scanner.nextLine();            }
			else {
				System.out.println("Invalid input.Enter Userid again.");
			    continue;
			    }
			
			if(Pattern.matches("[a-zA-Z]+",name)) {
				System.out.print("Enter Email: ");
			    email = scanner.nextLine();
			}
			else {
				System.out.println("Invalid input.Enter Name again.");
				continue;
			}
			
			if(Pattern.matches("^(.+)@(\\S+)$",email)) {
				System.out.print("Enter Password: ");
			    password = scanner.nextLine();
			}
			else {
				System.out.println("Invalid input.Enter email again.");
		    	continue;
			    }
			   
		    if(Pattern.matches("[a-zA-Z0-9#@$%!]+",password)) {
		    	System.out.print("Enter Address: ");
		        address = scanner.nextLine();
		   	  }
		   else {
		       	System.out.println("Invalid input.Enter password again.");
		       	continue;
		   }
			
			    
		    
		    if(Pattern.matches("[a-zA-Z0-9,]+",address)) {
		    	System.out.print("Enter Contact: ");
		        contact = scanner.nextLine();
		   }
		   else {
		   		System.out.println("Invalid input.Enter address again.");
		   		continue;
		   }
		    if(Pattern.matches("^\\d{10}$",contact)) {
		    	System.out.println("Registered Successfully");
		    	 k = 0;
		   	 }
		   else {
		       	System.out.println("Invalid input.Enter contact again.");
		       	continue;
		   }
    
	}

}
}