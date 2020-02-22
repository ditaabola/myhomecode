package lv.dita;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NameGenerator extends ChildName{

	public static void main(String[] args) {
		
		Scanner skeneris = new Scanner(System.in);
		String skenObj = "";
		ParentsNames fatherInput = new ParentsNames();
		ParentsNames motherInput = new ParentsNames();
		System.out.println("Please write father's first name: ");
		skenObj = skeneris.nextLine();
		fatherInput.setFatherName(skenObj);
		System.out.println("Please write mother's first name: ");
		motherInput.setMotherName(skenObj);
		System.out.println("You entered: " + fatherInput.getFatherName() + " and " + motherInput.getMotherName());
		ChildName generatedChildName = new ChildName();
		
		GenderChoice gender = new GenderChoice();
		String childName ="";
				
		boolean x = false;
	
		do {
			System.out.println("If you know your child's gender, enter M for male and F for female, if not, enter O");
			skenObj = skeneris.next();
			switch (gender.getGender(skenObj).toUpperCase()) {
			case "M":
				childName = generatedChildName.getChildNameM1();
				System.out.println("Your child's name is: " + childName);
				x = true;
				break;
			case "F":
				System.out.println("Your child's name is: " + generatedChildName.getChildNameF1());
				x = true;
				break;
			case "O":
				System.out.println("Your child's name variants are: " + generatedChildName.getChildNameM1() + " and " + generatedChildName.getChildNameF1());
				x = true;
				break;
			default:
				System.out.println("Invalid input - must enter M, F or X (upper or lower case)");
				break;
			}
		} while (x == false);
		System.out.println("Congratulations!");

		boolean y = false;

		do {
			System.out.println(
					"Do you like the name(-s)? If you would like to try one more time, enter M, F or O for gender. If no, enter N!");
			skenObj = skeneris.next();
			switch (gender.getGender(skenObj).toUpperCase()) {
			case "M":
				System.out.println("Here you have one more variant of your child's name: " + generatedChildName.getChildNameM2());
				y = true;
				break;
			case "F":
				System.out.println("Here you have one more variant of your child's name: " + generatedChildName.getChildNameF2());
				y = true;
				break;
			case "O":
				System.out.println("Here you have one more variant of your child's name: " + generatedChildName.getChildNameM2() + " and " + generatedChildName.getChildNameF2());
				y = true;
				break;
			case "N":
				System.out.println("Congratulations!");
				y = true;
				break;
			default:
				System.out.println("Invalid input - must enter M, F or X (upper or lower case)");
				break;
			}
		} while (y == false);

		System.out.println("Would you like to print it in a document? Enter Y for yes and N for no!");
		String answer = skeneris.next();
		if (answer.equals("Y") || answer.equals("y")) {
			System.out.println("Your certificate is created.");
		} else if (answer.equals("N") || answer.equals("n")) {
			System.out.println("Thank you for using Name Generator!");
		}

		
	}
		
}
