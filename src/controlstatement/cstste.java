package controlstatement;

import java.util.Scanner;

public class cstste {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter your marital status (Married/Unmarried):");
        String maritalStatus = in.nextLine().toLowerCase();
        
        if(maritalStatus.equals("married")) {
            System.out.println("Enter below details");
            System.out.println("Gender (Male/Female):");
            String gender = in.nextLine().toLowerCase();
            
            if(gender.equals("male")) {
                System.out.println("Enter age:");
                int age = in.nextInt();
                if(age >= 30) {
                    System.out.println("Eligible");
                } else {
                    System.out.println("Not eligible - Male must be 30 or older");
                }
            } 
            else if(gender.equals("female")) {
                System.out.println("Enter age:");
                int age = in.nextInt();
                if(age >= 25) {
                    System.out.println("Eligible");
                } else {
                    System.out.println("Not eligible - Female must be 25 or older");
                }
            }
            else {
                System.out.println("Invalid gender input");
            }
        }
        else if(maritalStatus.equals("unmarried")) {
            System.out.println("Processing unmarried case...");
            
        }
        else {
            System.out.println("Invalid marital status input");
        }
        
        in.close();
    }
}
