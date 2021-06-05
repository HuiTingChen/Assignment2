package Assignment2;

//2.1 Inheritance (SoftwareTrainingCentre is the superclass of Instructor) 
//2.5 Interface (use getPayment by using "implements" ) in class
public class Instructor extends SoftwareTrainingCentre implements Payment{
	// 1.2 Pre-define Class
	protected String type; // type of software training
	protected String instructor;
	protected double fee;
	protected double totalSalary;
	protected int classes;
	protected int num; //number of participants

	// 1.4 Constructor
	public Instructor() { // constructor with no argument
		this.type = ""; // initialize type to null
		this.instructor = ""; // initialize instructor to null

		System.out.println("Please select the type of software training.");
	}

	public Instructor(String t) { // constructor with 1 argument
		this.type = t;
		this.instructor = ""; // initialize instructor to null

		System.out.println("Please select the instructor name.");
	}

	public Instructor(String t, String i,int cl, int n) { // constructor with many argument
		super(); //inherit data from super class with no parameter
		this.type = t;
		this.instructor = i;
		this.classes = cl;
		this.num = n; //number of participants
		
		//to determine the salary of the instructor with different type of software training that they conduct
		if (this.type.equals("Excel")) {
			fee = 600;
		} else if (this.type.equals("Adobe Photoshop")) {
			fee = 1600;
		} else if (this.type.equals("Adobe Premiere Pro")) {
			fee = 2000;
		} else
			System.out.println("Please enter a valid type of software training.");
		
		Payment s = new TotalSalary(); // create a new object 
		totalSalary = s.getPayment(fee,n); //calling for totalSalary
	}
	
	public double getPayment(double f, int n) { //Method implementation
		double totalS = f * 3 / 5 * n; //the employee can get 3/5 of the income of that particular type of software training
		return totalS; 
	}
	
	public String toString() { //2.2 Polymorphism (overriding method)
		return ("____________________Employee Information____________________" +
			   "\nEmployee Name               : " + this.instructor +
			   "\nType of Software Training   : " + this.type +
			   "\nTotal number of participants: " + this.num +
			   "\nTotal conducted classes     : " + this.classes +
			   "\nTotal Salary                : RM " + String.format("%.2f",totalSalary));
				
	}
	
	//2.3 Encapsulation (getter method)
	public String getType() {
		return this.type;
	}
	
	public String getInstructor() {
		return this.instructor;
	}

	public int getClasses() {
		return this.classes;
	}

	public int getNum() { //number of participants
		return this.num;
	}
	
}
