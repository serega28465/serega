package core.zooclub;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<Pet> list = new ArrayList<>();
		Map<Person, List<Pet>> map = new HashMap<>();
		
		Zooclub zooclub = new Zooclub();
		
		System.out.println("Натисніть 1, щоб Додати учасника клубу");
		System.out.println("Натисніть 2, щоб Додати тваринку до учасника клубу");
		System.out.println("Натисніть 3, щоб Видалити тваринку з учасника клубу");
		System.out.println("Натисніть 4, щоб Видалити учасника клубу ");
		System.out.println("Натисніть 5, щоб Видалити конкретну тваринку зі всіх власників");
		System.out.println("Натисніть 6, щоб Вивести на екран зооклуб");
		System.out.println("Натисніть 0, щоб Вийти");
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		while(true){
			
			switch (sc.next()){

			case "1":
				zooclub.addMember();
				break;
			case "2":
				zooclub.addPetToMember();
				break;
			case "3":
				zooclub.delPetFromMember();
				break;
			case "4":
				zooclub.delMember();
				break;
			case "5":
				zooclub.deletePetFromAllMembers();
				break;
			case "6":
				zooclub.printZooClub();
				break;
				
			case "0":
				sc.close();
				System.exit(0);
				break;	
				
			default:
				sc.close();
				System.exit(0);
			}
			
		}
	}

}
