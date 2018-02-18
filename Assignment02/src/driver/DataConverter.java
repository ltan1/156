package driver;

import java.util.List;

import entities.Member;
import entities.Person;
import entities.Product;
import fileReader.FlatFileReader;
import fileWriter.JsonWriter;
import fileWriter.XmlWriter;

public class DataConverter {

	public static void main(String[] args) {
		
		FlatFileReader fr = new FlatFileReader();
		
		//store the read info to a list
		List<Person> personList = fr.readPersons();
		List<Member> memberList = fr.readMember();
		List<Product> productList = fr.readProduct();
		
		//create json writer and write to appropriate files
		JsonWriter jWriter = new JsonWriter();
		jWriter.personsWriter(personList);
		jWriter.memberWriter(memberList);
		jWriter.productWriter(productList);
		
		//create xml writer and write to appropriate files
		XmlWriter xmlWriter = new XmlWriter();
	    xmlWriter.personsWriter(personList);
	    xmlWriter.memberWriter(memberList);
	    xmlWriter.productWriter(productList);
	}


}
