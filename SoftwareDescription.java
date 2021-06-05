package Assignment2;

//2.1 Inheritance (Registration is the superclass of SoftwareDescription) 
//2.5 Interface (use getPayment by using "implements" ) in class
public class SoftwareDescription extends Registration implements PaymentF{ 
	protected double fee;
	protected double totalFee;
	protected double discount;

	public SoftwareDescription() { // constructor with no argument	
		super(); // inherit data from super class with no parameter
		super.type = type; // inherit input value(type) from super class - registration
		super.time = time; // inherit input value(time) from super class - registration
	
		PaymentF f = new TotalFee(); // create a new object for fee
	
		System.out.println("\n___________________________Details__________________________");

		// Description for type of software training
		if (type == 1) {
			System.out.println("Excel");
			System.out.println("This is a 2 day training (3 hours per day).");
			System.out.println("The participant will be able to learn:" + "\n- the tutorial on how to use Excel"
					+ "\n- calculate finance report ");
			
			fee = 600;
			totalFee = fee;
			System.out.println("Conduct by               : Ahmad" );
			System.out.printf("Total Fee                : RM %.2f", totalFee);
			
		} else if (type == 2) {
			System.out.println("Adobe Photoshop");
			System.out.println("This is a 6 days training (3 hours per day).");
			System.out.println("The participant will be able to learn:" + "\n- the tutorial of editing photo"
					+ "\n- designing poster");
			
			fee = 1600;
			totalFee = fee;
			System.out.println("Conduct by               : Jakson Lee");
			System.out.printf("Total Fee                : RM %.2f", totalFee);
			
		} else if (type == 3) {
			System.out.println("Adobe Premiere Pro");
			System.out.println("This is a 6 days training (3 hours per day).");
			System.out.println("The participant will be able to learn:" + "\n- the tutorial of editing video"
					+ "\n- adding effects on the video");
			
			fee = 2000;
			totalFee = fee;
			System.out.println("Conduct by               : Vincen");
			System.out.printf("Total Fee                : RM %.2f", totalFee);
			
		} else if (type == 4) {
			//details for photoshop
			System.out.println("Adobe Photoshop");
			System.out.println("This is a 6 days training (3 hours per day).");
			System.out.println("The participant will be able to learn:" + "\n- the tutorial of editing photo"
					+ "\n- designing poster");
			
			System.out.println("Conduct by               : Jakson Lee");
			System.out.println();
			
			//details for premiere pro
			System.out.println("Adobe Premiere Pro");
			System.out.println("This is a 6 days training (3 hours per day).");
			System.out.println("The participant will be able to learn:" + "\n- the tutorial of editing video"
					+ "\n- adding effects on the video");
			
			System.out.println("Conduct by               : Vincen");
			
			//total fee
			System.out.println();
			fee = 1600 +2000;//1600 for photoshop , 2000 for premiere pro
			System.out.printf("Total Fee                : RM %.2f", f.getPayment(fee));
			
		} else if (type == 5) {
			//details for excel
			System.out.println("Excel");
			System.out.println("This is a 2 day training (3 hours per day).");
			System.out.println("The participant will be able to learn:" + "\n- the tutorial on how to use Excel"
					+ "\n- calculate finance report ");
			
			System.out.println("Conduct by               : Ahmad");
			System.out.println();
			
			//details for photoshop
			System.out.println("Adobe Photoshop");
			System.out.println("This is a 6 days training (3 hours per day).");
			System.out.println("The participant will be able to learn:" + "\n- the tutorial of editing photo"
					+ "\n- designing poster");
			
			System.out.println("Conduct by               : Jakson Lee");
			System.out.println();
			
			//details for premiere pro
			System.out.println("Adobe Premiere Pro");
			System.out.println("This is a 6 days training (3 hours per day).");
			System.out.println("The participant will be able to learn:" + "\n- the tutorial of editing video"
					+ "\n- adding effects on the video");
			
			System.out.println("Conduct by               : Vincen");
			
			//total fee
			System.out.println();
			fee = 600 + 1600 + 2000; //600 for excel, 1600 for photoshop , 2000 for premiere pro
			discount = 0.05;
			System.out.printf("Total Fee                : RM %.2f", f.getPayment(fee,discount));
			
			
		} else
			System.out.println("Please enter a valid type of software training.");
		System.out.println();

		// Description for time of software training
		if (time.equals("day time")) {
			System.out.println("This software training will be started from 10.00a.m.-13.00p.m.");
	
		} else if (time.equals("night time"))
			System.out.println("This software training will be started from 19.00p.m.-22.00p.m.");

		else
			System.out.println("Please enter a valid schedule time.");
	}
	
	public double getPayment(double f) { //Method implementation
		double totalF = f-20; //join 2 classes of software training will get RM20 cash back
		return totalF; 
	}
	
	public double getPayment(double f, double d) { //Method implementation
		double totalF = (f -30) * (1-d);//join 3 classes of software training will get RM30 cash back and 5% discount
		return totalF; 
	}
}
