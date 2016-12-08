package core.dz11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		Controller controller  = new Controller();
		while(true){
			System.out.println("Щоб додати товар в ліст, натисніть 1");
			System.out.println("Щоб Видалити товар з ліста, натисніть 2");
			System.out.println("Щоб Замінити товар в лісті, натисніть 3");
			System.out.println("Щоб Посортувати ліст, натисніть 4");
			System.out.println("Щоб вийти з прогрми, натисніть 0");
			
			Iterator<Commodity> iter = controller.com.listIterator();
			
			switch(sc.next()){
			
			
			
			case"1":
				
				System.out.println("Enter the name of new Commodity");
				String namec = sc.next();
				System.out.println("Enter the producer of new Commodity");
				String prodc = sc.next();
				System.out.println("Enter the price of Commodity");
				double pricec = (double) sc.nextInt();
				System.out.println("Choose the Type of Commodity");
				
				
				
				switch(sc.next()){
				
				case "1":
					CommodityType co = CommodityType.DRY;
					controller.com.add(new Commodity(namec, prodc, pricec , co));
					System.out.println(controller.com);
					break;
				case "2":
					CommodityType co2 = CommodityType.FISH;
					controller.com.add(new Commodity(namec, prodc, pricec , co2));
					System.out.println(controller.com);
					break;
				case "3":
					CommodityType co3 = CommodityType.FRUIT;
					controller.com.add(new Commodity(namec, prodc, pricec , co3));
					System.out.println(controller.com);
					break;
				case "4":
					CommodityType co4 = CommodityType.MEAT;
					controller.com.add(new Commodity(namec, prodc, pricec , co4));
					System.out.println(controller.com);
					break;	
				case "5":
					CommodityType co5 = CommodityType.SPICE;
					controller.com.add(new Commodity(namec, prodc, pricec , co5));
					System.out.println(controller.com);
					break;
				case "6":
					CommodityType co6 = CommodityType.VEGETABLE;
					controller.com.add(new Commodity(namec, prodc, pricec , co6));
					System.out.println(controller.com);
					break;	
					
				default:
					System.exit(0);
					
				}
				
				break;
			case "2":
				System.out.println("Введіть ім`я товару, який ви хотіли б видолити");
				String namedel = sc.next();
				
				while(iter.hasNext()){
					Commodity tmp = iter.next();
					if(tmp.getName().equalsIgnoreCase(namedel)){
						controller.com.remove(iter.next());
					}
				
				}
				System.out.println(controller.com);
				break;
			case"3":	
				System.out.println("Введіть ім`я товару, який ви хотіли б замінити");
				String namerepl = sc.next();
				
				while(iter.hasNext()){
					Commodity tmp = iter.next();
					if(tmp.getName().equalsIgnoreCase(namerepl)){
						controller.com.remove(iter);
						controller.com.add(new Commodity("Tomato", "FunnyFarmer", 9.65, CommodityType.VEGETABLE));
					}
				}
				System.out.println(controller.com);
				break;
			case "4":
				System.out.println("Посортувати ліст за ім'ям 1");
				System.out.println("Посортувати ліст за виробником 2");
				System.out.println("Посортувати ліст за ціною 3");
				System.out.println("Посортувати ліст за принципом товарного сусідства 4");
				
				switch(sc.next()){
				
				case"1":
					controller.sortByName().forEach(System.out :: println);
					break;
				case"2":
					controller.sortByProducer().forEach(System.out :: println);
					break;
				case"3":
					controller.sortByPrice().forEach(System.out :: println);
					break;
				case"4":
					controller.sortByCommodityType().forEach(System.out :: println);
					break;	
					
				default:
					System.exit(0);
				}
			default:
				System.exit(0);
			}
			
				
		}
	}

}
