package core.zooclub;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import core.zoopriklad.Animal;
import core.zoopriklad.Person;
import core.zoopriklad.Pet;

public class Zooclub {

	Scanner sc = new Scanner(System.in);
	
	List<Pet> list;
	Map<Person, List<Pet>> map;
	Set<Entry<Person, List<Pet>>> set;
	Iterator<Entry<Person, List<Pet>>> iter;
	
	public Zooclub(List<Pet> list, Map<Person, List<Pet>> map,
			Set<Entry<Person, List<Pet>>> set,
			Iterator<Entry<Person, List<Pet>>> iter) {
		
		this.list = new ArrayList<>(); 
		this.map = new HashMap<>(); 
		this.set = map.entrySet();
		this.iter = set.iterator();
	}
		
	{
// list.add(new Pet("Васька", "Cat", 2));
//	list.add(new Pet("kesha", "Папуга", 1));
//	list.add(new Pet("Лола", "Cat", 1));
//	list.add(new Pet("Ксюша", "Папуга"));
//	list.add(new Pet("Жужа", "Собака", 1));
//	list.add(new Pet("Мухтар", "Собака", 2));
//	list.add(new Pet("Джек", "Собака", 1));
	}
	
	
	public Zooclub() {
	}

	public void makeFile() {
		File file = new File("Zooclub");
		if (!(file.exists())) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
	
	public void writeStateOfZooclub() {
		try {
			File file = new File("TestZooclub");
			file.createNewFile();
			FileWriter writer = new FileWriter(file);
			BufferedWriter buf = new BufferedWriter(writer);
			set = map.entrySet();
			Iterator<Entry<Person, List<Pet>>> iterator = set.iterator();
			while (iterator.hasNext()) {
				String temp = "";
				temp = iterator.next().toString();
				buf.write(temp + "\n");
			}
			buf.close();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Object deserializationData(String nameOfFile) {
		Object returnObject = null;
		try {
			FileInputStream fis = new FileInputStream(nameOfFile);
			ObjectInputStream ois = new ObjectInputStream(fis);
			returnObject = ois.readObject();
			ois.close();
			fis.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!!!");
			System.exit(0);
		} catch (IOException e) {
			System.out.println("I/O Error");
			System.exit(1);
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found!");
			System.exit(3);
		}
		return returnObject;
	}


	public void serializationData(String fileName, Object object) {
		try {
			FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream ous = new ObjectOutputStream(fos);
			ous.writeObject(object);
			fos.close();
			ous.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			System.exit(1);
		} catch (IOException e) {
			System.out.println("Warning! Input/Output ERROR!");
			System.exit(2);
		}
	}

	public Entry<Person, List<Pet>> getEntry() {
		Iterator<Entry<Person, List<Pet>>> iterator = set.iterator();
		Entry<Person, List<Pet>> entry = iterator.next();
		return entry;
	}
	public void addMember() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a name of Person : ");
		String name = scanner.nextLine();
		System.out.println("Enter age of Person : ");
		int age = scanner.nextInt();
		
		map.put(new Person(name, age), new ArrayList<Pet>());
	}
	
	public void addPetToMember() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name of Person :");
		String name = scanner.nextLine();

		Iterator<Entry<Person, List<Pet>>> iterator = set.iterator();
		
		while (iterator.hasNext()) {
			Entry<Person, List<Pet>> entry = iterator.next();
			if (entry.getKey().getName().equalsIgnoreCase(name)) {
				System.out.println("Enter a name of Animal : ");
				String nameOfPet = scanner.nextLine();
				System.out.println("Enter a type of Animal ");
				
				String type = scanner.nextLine();
				System.out.println("Enter age of Animal");
				int age = scanner.nextInt();
				
			entry.getValue().add(nameOfPet, type, age);
			printPets();
			}
		}

	}
	public void delPetFromMember(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of Member");
		String name = sc.next();
		
		Iterator<Entry<Person, List<Pet>>> iter = set.iterator();
		while(iter.hasNext()){
			Entry<Person, List<Pet>> entry = iter.next();
			
			if (entry.getKey().getName().equalsIgnoreCase(name)) {
				System.out.println("Enter a name of Pet : ");
				String nameofPet = sc.nextLine();
				
				Collection<Pet> pets = entry.getValue();
				Iterator<Pet> iter2 = pets.iterator();
				while(iter2.hasNext()){
					Pet pet = iter2.next();
					if(pet.getName().equalsIgnoreCase(nameofPet)){
						iter2.remove();
					}
				}
			}
		}
	}
	
	public void delMember() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of Person :");
		String name = sc.nextLine();

		Iterator<Entry<Person, List<Pet>>> iter = set.iterator();
		while (iter.hasNext()) {
			Entry<Person, List<Pet>> entry = iter.next();
			if (entry.getKey().getName().equalsIgnoreCase(name)) {
				iter.remove();
			}
		}
	}
	
	public void deletePetFromAllMembers() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a name of Pet : ");
		String nameOfPet = scanner.nextLine();
		System.out.println("Enter type of Animal : ");
		String typeOfPet = scanner.nextLine();

		Iterator<Entry<Person, List<Pet>>> iter = set.iterator();
		while (iter.hasNext()) {
			Entry<Person, List<Pet>> entry = iter.next();

			Collection<Pet> pets = entry.getValue();
			Iterator<Pet> iter2 = pets.iterator();
			while (iter2.hasNext()) {
				Pet pet = iter2.next();
				if (pet.getName().equalsIgnoreCase(nameOfPet) && pet.getType().equalsIgnoreCase(typeOfPet)) {
																		
					iter2.remove();
				}
			}
		}

	}
	public void printPets() {
		for (Pet pet : list) {
			System.out.println(pet + " ");
		}
		System.out.println();
		
	}

	public void printZooClub() {
		set = map.entrySet();
		Iterator<Entry<Person, List<Pet>>> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}	
	public List<Pet> getList() {
		return list;
	}


	public void setList(List<Pet> list) {
		this.list = list;
	}


	public Map<Person, List<Pet>> getMap() {
		return map;
	}


	public void setMap(Map<Person, List<Pet>> map) {
		this.map = map;
	}


	public Set<Entry<Person, List<Pet>>> getSet() {
		return set;
	}


	public void setSet(Set<Entry<Person, List<Pet>>> set) {
		this.set = set;
	}


	public Iterator<Entry<Person, List<Pet>>> getIter() {
		return iter;
	}


	public void setIter(Iterator<Entry<Person, List<Pet>>> iter) {
		this.iter = iter;
	}
	
	
}
