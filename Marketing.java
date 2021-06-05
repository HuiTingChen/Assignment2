package Assignment2;

public class Marketing extends SoftwareTrainingCentre{ //2.1 Inheritance (SoftwareTrainingCentre is the superclass of Marketing) 
	// 1.2 Pre-define Class
	private String instagram;
	private String facebook;
	protected double discount;
	
	// 1.4 Constructor
	public Marketing() {// constructor with no argument
		this.instagram = ""; //initialize instagram to null
		this.facebook = ""; //initialize facebook to null
	}
	
	public Marketing(String insta) {// constructor with 1 argument
		this.instagram = insta;
		this.facebook = "";//initialize facebook to null
		
		System.out.println("*For more information and reference please visit \n -" + insta );
	}
	
	public Marketing(String insta,String fb,double dis) {// constructor with 2 argument
		this.instagram = insta;
		this.facebook = fb;
		this.discount = dis;
	}
	
	public String toString() { //2.2 Polymorphism (overriding method)
		return super.toString() +
			   "\nYou will get " + this.discount + "% discount if you join all 3 of the software training." +
		       "\n*For more information and reference please visit \n -" + this.instagram + "\n -" + this.facebook;
	}
	
	//2.3 Encapsulation (getter method)
	public String getInstagram() {
		return this.instagram;
	}

	public String getFacebook() {
		return this.facebook;
	}

	public double getDiscount() {
		return this.discount;
	}
}


