package Pages;
import java.util.*;
import Pages.ServiceBooking;
public class Login {
	Scanner sc = new Scanner(System.in);
	ServiceBooking Sb = new ServiceBooking();
	public void UserLogin(){
		
		System.out.print("Enter Userid: ");
		
		String id = sc.nextLine();
		System.out.print("Enter Password: ");
		String pass = sc.nextLine();
		if(id != null && pass != null) {
			System.out.println("Login Successful");
			Sb.StartBooking();
			
		}
		else {
			System.out.println("Login Failure");
		}
		
	}

}
