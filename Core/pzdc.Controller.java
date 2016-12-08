package core.lesson13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import core.lesson10.Person;

public class Controller {
	
	private final List<Person> persons = restore();
	
	
	public boolean add(Person e) {
		return persons.add(e);
	}

	@SuppressWarnings("unchacked")
	private List<Person> restore() {
		File file = new File("asdf.tryfh");
		if(file.exists()){
			try(InputStream is = new FileInputStream(file);
				ObjectInputStream ois = new ObjectInputStream(is)){
				Object obj = ois.readObject();
				if (obj instanceof List){
					return (List<Person>)obj;
				}
			}catch(IOException | ClassNotFoundException e){}
		}
		return new ArrayList<>();
	}
	
	public void save(){
		
		try(OutputStream os = new FileOutputStream(new File("asdf.tryfh"));
				ObjectOutputStream oos = new ObjectOutputStream(os)){
					oos.writeObject(persons);
					oos.flush();
				}catch(IOException e){}
		
		public void saveToTextFile(String fileName){
			try(FileWriter writer = new FileWriter(fileName + .txt)){
				for (Person person : persons) {
					String str = person.getName()+ " " + person.getAge()+ " " + person.getGender();
					writer.write(str);
				}
			}catch(IOException e){
				
			}
		}
	}
	//	OutputStream os = null;
	//			ObjectOutputStream oos = null;
//		try{
//			os = new FileOutputStream("asdf.tryfh");
//			oos = new ObjectOutputStream(os);
//			oos.writeObject(persons);
//			oos.flush();
//		} catch(Exception e){
//			
	//	} finally {
	//		if(oos!=null){
//				try{
//					oos.close();
//				}catch(IOException e){
//					
//				}
//			}
//			if(os!=null){
//				try{
///					os.close();
	//			}catch(IOException e){
	//				
	//			}
	//		}
	//	}
	
}
