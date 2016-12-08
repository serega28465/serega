package core.lesson13;

import java.util.Scanner;

import core.lesson10.Controller;

public class Main {

	private static final Scanner sc = new Scanner(System.in);
	private static final Controller controller = new Controller();
	
	public static void main(String[] args) {
		
		while(true){
			System.out.println("Enter 1 to add person");
			System.out.println("Enter 2 to show all persons");
			System.out.println("Enter 3 to save");
			System.out.println("Enter 4 to save to text file");
			
			switch(sc.next()){
			case "1":
				System.out.println("Enter name");
				String name = sc.next();
				System.out.println("Enter age");
				int age = sc.nextInt();
				System.out.println("Enter gender");
				Gender gender = Gender.valueOf(sc.next().toUpperCase());
				controller.add;
				break;
				
			case "2":
				controller.getPersons().forEach(System.out::print);
				break;
				
			case "3":
				controller.save();
				break;
				
			default:
				sc.close();
				return;
			}
		}
		
	}

}
