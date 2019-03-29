import java.util.*;
public class lab02;
	public static void main(String[] args) {
		// Set the counter
		int funny = 0;
		int unique = 0;
		int rare = 0;
		// printing the welcome statement 
		System.out.println("Welcome, Please enter your item : ");
		// while loop keeps going until the user type finished"
		while(True) { 
			Scanner input = new scanner(System.in);// making input
			String cart = input.nextLine();
			if (cart.equals("finished")) {//checking the finished word" that stop the loop
				break;
			}else {
				int ascii = 0;// setting the ascii counter
			for (int i=0;i<item.length();i++) {
				// converting i to ascii, multiply with pi, and round it
				ascii += Math.round(cart.charAt(i)*Math.PI);	
			}
			//grouping the funny, unique, and rare items
			int cart_rem = ascii % 15;
			if (cart_rem >= 0 && cart_rem <=4) {
				funny +=1;
			}if (cart_rem >= 5 && cart_rem <=10) {
				unique += 1;
			}if (cart_rem >= 11 && item_rem <= 14) {
				rare +=1;
			}
			}
		}
	
	
		// printing the final statements
		System.out.print("Here are the items in your crate : ");
		System.out.print("Funny items : " + funny);
		System.out.print("Unique items : ") + unique;
		System.out.print("Rare items : " + rare);
			
		
	}
}
