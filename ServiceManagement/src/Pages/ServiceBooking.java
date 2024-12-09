package Pages;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ServiceBooking {

    Map<String, String[]> services = new HashMap<>() {{
        put("House Cleaning", new String[]{"1BHK", "2BHK", "3BHK", "Bathroom Cleaning"});
        put("Vehicle Repair", new String[]{"Two Wheeler", "Three Wheeler", "Four Wheeler"});
        put("AC & Appliances", new String[]{"AC Repair", "TV Repair", "Fridge Repair", "Washing Machine Repair"});
        put("Product pickup and drop", new String[]{"Furnitures", "Groceries", "Vehicles"});
    }};
    
    Map<String, Integer> Vdr = new HashMap<>() {{
        put("Sathya Agencies", 1000);
        put("Mr Service", 1500);
        put("Here For U", 800);
        put("AtLas Service", 2000);
    }};
    
    int counter = 0;
    int subc = 1;

    public void StartBooking(String id) {
        System.out.println("\t\tAvailable Services");
        for (String k : services.keySet()) {
            counter++;
            System.out.println(counter + ". " + k);
            for (String a : services.get(k)) {
                System.out.print(subc + ". " + a + "\t");
                subc++;
            }
            subc = 1;
            System.out.println();
            System.out.println();
        }
        
        Scanner sc = new Scanner(System.in);
        
        String user = id;
        System.out.println("User Id: "+user);
        int j = getValidatedIntegerInput(sc, "Choose a service (1-4): ", "Invalid service. Enter a number between 1 and 4.", 1, 4);
        
        String[] subservice = null;
        String ServiceType = null;
        
        if (j == 1) {
            subservice = services.get("House Cleaning");
            ServiceType = "House Cleaning";
        } else if (j == 2) {
            subservice = services.get("Vehicle Repair");
            ServiceType = "Vehicle Repair";
        } else if (j == 3) {
            subservice = services.get("AC & Appliances");
            ServiceType = "AC & Appliances";
        } else if (j == 4) {
            subservice = services.get("Product pickup and drop");
            ServiceType = "Product pickup & drop";
        }
        
        System.out.println("Service Type: " + ServiceType);
        ShowSubservice(subservice);
        
        int a = getValidatedIntegerInput(sc, "Choose SubService Number: ", "Invalid SubService. Enter a valid number.", 1, subservice.length);
        String SubService = SelectSubservice(subservice, a);
        System.out.println("SubService Type: " + SubService);
        
        sc.nextLine();
        // Validate Date
        String date = getValidatedStringInput(sc, "Enter Service Date (dd/mm/yyyy): ", "Invalid date. Use format dd/mm/yyyy.", "^\\d{2}/\\d{2}/\\d{4}$");
        
        // Validate Address
        String address = getValidatedStringInput(sc, "Enter Address: ", "Invalid address. Use alphanumeric characters and commas.", "[a-zA-Z0-9, ]+");
        
        // Validate Contact
        String contact = getValidatedStringInput(sc, "Enter Contact (10 digits): ", "Invalid contact. Enter a 10-digit number.", "^\\d{10}$");
        
        System.out.println("Choose Vendor");
        for (String m : Vdr.keySet()) {
            System.out.print(subc + ". " + m + "\t");
            subc++;
        }
        System.out.println();
        
        int p = getValidatedIntegerInput(sc, "Enter Vendor Index: ", "Invalid vendor index. Enter a valid number.", 1, Vdr.size());
        String vendor = SelectVendor(Vdr, p);
        System.out.println("Vendor: " + vendor);
        int amount = Vdr.get(vendor);
        System.out.println("Amount: " + amount);
        System.out.println("\n\t\tBooking Confirmed");
    }
    
    public static void ShowSubservice(String[] subservice) {
        int subc = 1;
        for (String s : subservice) {
            System.out.print(subc + ". " + s + "\t");
            subc++;
        }
        System.out.println();
    }
    
    public static String SelectSubservice(String[] subservice, int a) {
        return subservice[a - 1];
    }
    
    public static String SelectVendor(Map<String, Integer> vdr2, int i) {
        int cntr = 1;
        for (String k : vdr2.keySet()) {
            if (cntr == i) {
                return k;
            }
            cntr++;
        }
        return null;
    }
    
    public static int getValidatedIntegerInput(Scanner sc, String prompt, String errorMessage, int min, int max) {
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                int input = sc.nextInt();
                if (input >= min && input <= max) {
                    return input;
                }
            }
            sc.nextLine(); 
            System.out.println(errorMessage);
        }
    }
    
    public static String getValidatedStringInput(Scanner sc, String prompt, String errorMessage, String regex) {
        while (true) {
            System.out.print(prompt);
            
            String input = sc.nextLine();
            if (Pattern.matches(regex, input)) {
                return input;
            }
            System.out.println(errorMessage);
        }
    }

	
}
