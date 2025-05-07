package datatypes;

import java.util.Scanner;


public class example {
	public static void main(String[] args) {
		var sc = new Scanner (System.in);
		System.out.println("enter the principal");
		int p = sc.nextInt();
		System.out.println("enter the month");
		int n = sc.nextInt();
		System.out.println("enter the interest ");
		int r = sc.nextInt();
		float result =p*n*r/100;
		System.out.println(result);
		
	}

}
