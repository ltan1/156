package fileWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

import com.thoughtworks.xstream.XStream;

import entities.DayMembership;
import entities.EquipmentRental;
import entities.Member;
import entities.ParkingPass;
import entities.Person;
import entities.Product;
import entities.YearMembership;


public class XmlWriter {
	
	public void personsWriter(List<Person> persons) {
		XStream  xstream = new XStream();
		
		//create a new xml file to write to
        File xmlOutput = new File("data/Persons.xml");
		
        //create new print writer
		PrintWriter xmlPrintWriter = null;
		try {
			xmlPrintWriter = new PrintWriter(xmlOutput);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		xmlPrintWriter.write("<?xml version=\"1.0\" ?>\n");
		
		//alias to change tag name
		xstream.alias("person", Person.class);
		xstream.alias("email", String.class);
		for(Person aPerson : persons) {
			// Use toXML method to convert Person object into a String
			String personOutput = xstream.toXML(aPerson);
			xmlPrintWriter.write(personOutput + "\n");
		}
		xmlPrintWriter.close();	
	}
	
	public void memberWriter(List<Member> member) {
		XStream  xstream = new XStream();
		
		//create new xml file to write to
        File xmlOutput = new File("data/Members.xml");
		
        //new print writer
		PrintWriter xmlPrintWriter = null;
		try {
			xmlPrintWriter = new PrintWriter(xmlOutput);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		xmlPrintWriter.write("<?xml version=\"1.0\" ?>\n");
		
		//changing the tag names
		xstream.alias("member", Member.class); 
		xstream.alias("email", String.class);
		for(Member aMember : member) {
			// Use toXML method to convert Person object into a String
			String memberOutput = xstream.toXML(aMember);
			xmlPrintWriter.write(memberOutput + "\n");
		}
		xmlPrintWriter.close();	
	}
	
	public void productWriter(List<Product> product) {
		XStream  xstream = new XStream();
		
        File xmlOutput = new File("data/Products.xml");
		
        //create and open a print writer
		PrintWriter xmlPrintWriter = null;
		try {
			xmlPrintWriter = new PrintWriter(xmlOutput);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		xmlPrintWriter.write("<?xml version=\"1.0\" ?>\n");
		
		//changing the tag names
		xstream.alias("year-long-membership", YearMembership.class);
		xstream.alias("day-long-membership", DayMembership.class);
		xstream.alias("parkingpass", ParkingPass.class);
		xstream.alias("rentals", EquipmentRental.class);
		
		for(Product aProduct : product) {
			// Use toXML method to convert Person object into a String
			String productOutput = xstream.toXML(aProduct);
			xmlPrintWriter.write(productOutput + "\n");
		}
		xmlPrintWriter.close();	
	}
}
