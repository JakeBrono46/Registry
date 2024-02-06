import java.util.*;
import java.io.*;

public class Registry {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(System.in);
		Formatter table = new Formatter();
		PrintWriter outfile = new PrintWriter("registry.txt");
		
		int numName;
		
		System.out.print("How many names would you like to enter? ");
		numName = scan.nextInt();
		System.out.println();
		
		//Name
		String lname[] = new String[numName];
		
		//Date of Birth
		int month[] = new int[numName];
		int day[] = new int[numName];
		int year[] = new int[numName];
		String dob[] = new String[numName];
		
		//Address
		String address[] = new String[numName];
		String zip[] = new String[numName];
		
		//Phone
		String phone[] = new String[numName];
		
		//Input info based on how many names are specified
		for(int i = 0; i < numName; i++) {
			
			System.out.print((i + 1) + " Name: ");
			lname[i] = scan.next();
			
			System.out.print("Birth: ");
			month[i] = scan.nextInt();
			day[i] = scan.nextInt();
			year[i] = scan.nextInt();
			
			System.out.print("Address: ");
			address[i] = scan.nextLine();
			address[i] = scan.nextLine();
			
			System.out.print("Zip: ");
			zip[i] = scan.next();
			
			System.out.print("Phone: ");
			phone[i] = scan.next();
			System.out.println();
						
			dob[i] = month[i] + "/" + day[i] + "/" + year[i];
		}
		
		//Create table to display data
		table.format("%-2s %-10s %-10s %-20s %-10s %-12s\n", " ", "NAME", "BIRTH", "ADDRESS", "ZIP", "PHONE");
		table.format("----------------------------------------------------------------------\n");
		
		for(int i = 0; i < numName; i++) {
			
			table.format("%-2s %-10s %-10s %-20s %-10s %-12s\n",(i + 1), lname[i], dob[i], address[i], zip[i], phone[i]);
		}
		
		//Print table to external file
		outfile.println(table);
		outfile.close();
		
		System.out.println("Info has been printed to file!");
		
		//System.out.println(table);
	}

}
