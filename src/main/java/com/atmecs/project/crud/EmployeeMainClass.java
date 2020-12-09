package com.atmecs.project.crud;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

import org.json.simple.parser.ParseException;

public class EmployeeMainClass {
	static int choice;
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException, ParseException {
		do {
			System.out.println("Enter your Choice");
			System.out.println("1.Create Record in File\n2. Read data from file\n3.Modify record\n4.Exit");
			System.out.println("=========================================================");
			choice = scan.nextInt();

			switch (choice) {
			case 1:
				WriteClass write = new WriteClass();
				write.writeData();
				break;
			case 2:
				ReadJsonFile read = new ReadJsonFile();
				read.readFile();
				break;
			case 3:

				UpdateJson update = new UpdateJson();
				update.modify();

				break;

			case 4:
				System.out.println("You have pressed 3..The Program has been Ended..!!");
				System.out.println("============================================");
				break;

			default:
				System.out.println("Wrong Choice..!");
				System.out.println("============================================");

				break;
			}
		} while (choice != 4);
	}

}
