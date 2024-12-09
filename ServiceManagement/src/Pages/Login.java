package Pages;
import java.util.*;
import Data.RegisteredUsers;
import Pages.ServiceBooking;
public class Login {
	
	
	Scanner sc = new Scanner(System.in);
	ServiceBooking Sb = new ServiceBooking();
	Admin Ad = new Admin();
	List<Map<String,String>> AdminCredentials = Arrays.asList( 
		new HashMap<>() {{
		put("id","admin");
		put("password","admin#007");
		
	}},
		
		new HashMap<>() {{
			put("id","admin2");
			put("password","admin@123");
		}}
	);
	public void UserLogin(){
		RegisteredUsers Rg = new RegisteredUsers();
		
		System.out.print("Enter Userid: ");
		
		String id = sc.nextLine();
		System.out.print("Enter Password: ");
		String pass = sc.nextLine();
		if(Rg.AuthUsers(id, pass)) {
			System.out.println("Login Successful");
			Sb.StartBooking(id);
			
		}
		else {
			System.out.println("Login Failure");
		}
		
	}
	
	public void AdminLogin() {
		System.out.print("Enter AdminId: ");
		
		String id = sc.nextLine();
		System.out.print("Enter Password: ");
		String pass = sc.nextLine();
		if(authAdmin(id, pass)) {
			System.out.println("Login Successful");
			Ad.View();
			
		}
		else {
			System.out.println("Login Failure");
		}
		
	}
	
	public boolean authAdmin(String id,String pass) {
		for(Map<String,String> k : AdminCredentials) {
			if(k.get("id").equals(id)) {
				if(k.get("password").equals(pass)) {
					return true;
				}
			}
			
		}
		return false;
	}

}
