package Assignment2;

//2.1 Inheritance (Instructor is the superclass of Finance) 
//2.5 Interface (use getPayment by using "implements" ) in class
public class Finance extends Instructor implements Payment{ 
	// 1.2 Pre-define Class
	private double income;
	private double profit;

	public Finance(String t, String i,int cl, int n) { // constructor with many argument
		super(t,i,cl,n); //inherit data from super class with with parameter
		
		//define the fee of different type of software training
		if (t.equals("Excel")) {
			fee = 600;
		} else if (t.equals("Adobe Photoshop")) {
			fee = 1600;
		} else if (t.equals("Adobe Premiere Pro")) {
			fee = 2000;
		} else
			System.out.println("Please enter a valid type of software training.");
	
	    
		//For calculate income and profit of a particular type of software training
		Payment in = new TotalIncome(); // create a new object 
		income = in.getPayment(fee,n);

		profit = profit(income, super.totalSalary); //inheritance total salary from super class - instructor
			
	}
	
	public String toString() { //2.2 Polymorphism (overriding method)
		return super.toString() +("\n\n________________Profit for " + this.type +"________________" +
			   "\nTotal Income             : RM " + String.format("%.2f",income) +
			   "\nTotal Expenses           : RM " + String.format("%.2f",super.totalSalary) +
			   "\nTotal Profit             : RM " + String.format("%.2f",profit));
	}
	
	public double getPayment(double f, int n) { //Method implementation
		double totalI = f * n;  // calculate total income of a particular type of software training(fee multiply by number of participants)
		return totalI; 
	}	

	public double profit(double income, double totalS) { //calculate profit of a particular type of software training 
		profit = income - totalS;
		return profit;
	}
}
