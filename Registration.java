package Assignment2;
import java.util.Scanner;

public abstract class Registration{ //2.4 Abstraction
	// 1.2 Pre-define Class
	Scanner s = new Scanner(System.in);
	private String name;
	private String contactNo;
	private String email;
	protected int type;
	protected String time;
	private String date;

	public Registration() { // constructor with no argument
		System.out.println("\n________________________Registration________________________");
		// input the name, contact number, email, type of software, time and date by using scanner
		System.out.print("Enter your name                 : ");
		this.name = s.nextLine();
		System.out.print("Enter your contact number       : ");
		this.contactNo = s.nextLine();
		System.out.print("Enter your email address        : ");
		this.email = s.nextLine();
		System.out.print("Enter your desire package       : ");
		this.type = s.nextInt();
		System.out.print("Enter time (day/night time)     : ");
		s.nextLine();
		this.time = s.nextLine();
		System.out.print("Enter Date to start the training: ");
		this.date = s.nextLine();

		
		// display the customer information and software training information
		System.out.println("\n____________________Customer Information____________________");
		System.out.println("Name                      : " + this.name);
		System.out.println("Contact Number            : " + this.contactNo);
		System.out.println("Email Address             : " + this.email);
		
		if (this.type == 1)
			System.out.println("Type of Software Training : Excel" );
		else if (this.type == 2)
			System.out.println("Type of Software Training : Adobe Photoshop" );
		else if (this.type == 3)
			System.out.println("Type of Software Training : Adobe Premiere Pro" );
		else if (this.type == 4)
			System.out.println("Type of Software Training : Adobe Photoshop & Adobe Premiere Pro" );
		else if (this.type == 5)
			System.out.println("Type of Software Training : Excel & Adobe Photoshop & Adobe Premiere Pro" );
		else
			System.out.println("Please enter a valid number.");
		
		System.out.println("Time (day/night time)     : " + this.time);
		System.out.println("Date to start the training: " + this.date);
		
	}
	
	//2.3 Encapsulation (getter method)
	public String getName() {
		return this.name;
	}

	public String getContact() {
		return this.contactNo;
	}

	public String getEmail() {
		return this.email;
	}
	
	public int getType() {
		return this.type;
	}
	
	public String getTime() {
		return this.time;
	}
	
	public String getDate() {
		return this.date;
	}
}
