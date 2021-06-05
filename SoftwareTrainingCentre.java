package Assignment2;

public abstract class SoftwareTrainingCentre { // //2.4 Abstraction
	// 1.2 Pre-define Class
	private String companyName;
	private int numtype; //number of type of software training that are available
	private String companyContactNo;
	
	// 1.4 Constructor
	public SoftwareTrainingCentre() {// constructor with no argument
		this.companyName = ""; //initialize companyName to null
		this.numtype = 0; //initialize numtype to 0
	}
	
	public SoftwareTrainingCentre(String cn) {// constructor with 1 argument
		this.companyName = cn;
		this.numtype = 0;//initialize numtype to 0
		
		System.out.println("__________Welcome to " + cn + "__________");
		System.out.println("Please enter the number of type of software training that are available.");
	}
	
	public SoftwareTrainingCentre(String cn,int num,String Cmpcont) {// constructor with many argument
		this.companyName = cn;
		this.numtype = num;
		this.companyContactNo = Cmpcont;
	}

	public String toString() {//2.2 Polymorphism (overriding method)
		return "__________Welcome to Chen Software Training Centre__________" +
						   "\nCompany Contact Number: 04-5986302" +
						   "\nThere are 3 types of Software Training available at this moment." +
						   "\nSelect one of the packages:" + 
						   "\n1 - Excel" +
						   "\n2 - Adobe Photoshop" +
						   "\n3 - Adobe Premiere Pro" +
						   "\n4 - Adobe Photoshop & Premiere Pro" +
						   "\n5 - All 3 types "; 
		
	}
}
