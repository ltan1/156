package fileWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import entities.Member;
import entities.Person;
import entities.Product;

public class JsonWriter {
	
	public void personsWriter(List<Person> persons) {
		
		//make pretty printing and new json file
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		File jsonOutput = new File("data/Persons.json");
		
		PrintWriter jsonPrintWriter = null;
		
		//new print writer
		try {
			jsonPrintWriter = new PrintWriter(jsonOutput);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		
		for(Person aPerson : persons) {
			// Use toJson method to convert Person object into a String
			String personOutput = gson.toJson(aPerson); 
			jsonPrintWriter.write(personOutput + ",\n");
		}
		
		jsonPrintWriter.close();
	}
	
	public void memberWriter(List<Member> member) {
		
		//make pretty printing and new json file
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		File jsonOutput = new File("data/Members.json");
		
		PrintWriter jsonPrintWriter = null;
		
		//new print writer
		try {
			jsonPrintWriter = new PrintWriter(jsonOutput);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		
		for(Member aMember : member) {
			// Use toJson method to convert Person object into a String
			String memberOutput = gson.toJson(aMember); 
			jsonPrintWriter.write(memberOutput + ",\n");
		}
		
		jsonPrintWriter.close();
	}
	
	public void productWriter(List<Product> product) {
		
		//make pretty printing and new json file
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		File jsonOutput = new File("data/Products.json");
		
		PrintWriter jsonPrintWriter = null;
		
		//new print writer
		try {
			jsonPrintWriter = new PrintWriter(jsonOutput);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		
		for(Product aProduct : product) {
			// Use toJson method to convert Person object into a String
			String productOutput = gson.toJson(aProduct); 
			jsonPrintWriter.write(productOutput + ",\n");
		}
		
		jsonPrintWriter.close();
	}
}
