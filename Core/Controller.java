package core.dz11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Controller {
	
	public List<Commodity> com = new ArrayList<>();
	
	{
		com.add(new Commodity("Огірок", "ООО Ферма ", 7.96, CommodityType.VEGETABLE ));
		com.add(new Commodity("Курка", "ФОП Курятник ", 12.99, CommodityType.MEAT ));
		com.add(new Commodity("Лосось", "ООО Риба ", 66.96, CommodityType.FISH ));
		com.add(new Commodity("Орегано", "ООО Приправа ", 9.99, CommodityType.SPICE ));
		com.add(new Commodity("Цукор", "ООО Сухі продукти ", 17.96, CommodityType.DRY ));
		com.add(new Commodity("Апельсин", "ООО FruitFarm ", 14.96, CommodityType.FRUIT ));
		com.add(new Commodity("Помідори Черрі", "ООО Ферма ", 15.93, CommodityType.VEGETABLE ));
		com.add(new Commodity("Хіяші", "ООО Сушия ", 77.96, CommodityType.VEGETABLE ));
	}
	public List<Commodity> sortByName(){
		return com.stream().sorted(Comparator.comparing(Commodity::getName)).collect(toList());
	}
	public List<Commodity> sortByProducer(){
		return com.stream().sorted(Comparator.comparing(Commodity::getProducer)).collect(toList());
	}
	public List<Commodity> sortByPrice(){
		return com.stream().sorted(Comparator.comparing(Commodity::getPrice)).collect(toList());
	}
	public List<Commodity> sortByCommodityType(){
		return com.stream().sorted(Comparator.comparing(Commodity::getComT)).collect(toList());
	}
	public List<Commodity> getCom(){
		return com;
	}
}
