package Data;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegisteredUsers {
	
	public List<Map<String,String>> RegUsers = Arrays.asList(
			new HashMap<>() {{
				put("userId","id123");
				put("name","Mohan");
				put("email","mohanbabu@gmail.com");
				put("password","moh@124");
				put("address","No 16,Nehru street,Navalur");
				put("contact","8754378059");
			}},
			
			new HashMap<>() {{
				put("userId","id313");
				put("name","Gifty");
				put("email","gift@gmail.com");
				put("password","gif@122");
				put("address","No 2,vijaya nagar,pallavaram,chennai");
				put("contact","992212389");
			}},
			
			new HashMap<>() {{
				put("userId","id456");
				put("name","Gunaseelan");
				put("email","guna@gmail.com");
				put("password","guna@124");
				put("address","No 16,Anna nagar,chennai");
				put("contact","6385946584");
			}},
			
			new HashMap<>() {{
				put("userId","id789");
				put("name","Hariharan");
				put("email","hari@gmail.com");
				put("password","hari@111");
				put("address","No 7,Kovil street,Tambaram,chennai");
				put("contact","8608136818");
			}},
			new HashMap<>() {{
				put("userId","id222");
				put("name","Sahana");
				put("email","sahana@gmail.com");
				put("password","Sah@124");
				put("address","No 12/A,Sunrise Apartment,Chepak,chennai");
				put("contact","8723411090");
			}}
			);
	
	
	public void showUsers() {
		for(Map<String,String> k : RegUsers) {
			System.out.println(k.get("name"));
		}
	}
	
	public boolean AuthUsers(String id,String pass) {
		for(Map<String,String> k : RegUsers) {
			if(k.get("userId").equals(id)) {
				if(k.get("password").equals(pass)) {
					return true;
				}
			}
			
		}
		
		return false;
	}
	
	public List<Map<String, String>> getCustomers() {
		return RegUsers;
	}

	

}
