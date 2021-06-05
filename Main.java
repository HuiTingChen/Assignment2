package Assignment2;
public class Main {

	public static void main(String[] args) {
		
		Marketing mar = new Marketing("https://www.facebook.com","https://www.instagram.com",5);
		System.out.println(mar.toString());//display company details, fb,insta link, discount
		
		SoftwareDescription descrip = new SoftwareDescription(); //display registration and description
		
		System.out.println();
		Finance fin = new Finance("Adobe Premiere Pro","Vincen", 4, 45);
		System.out.println(fin.toString());//display income,expenses,profit
	}
}
