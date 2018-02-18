package fileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import entities.Address;
import entities.DayMembership;
import entities.EquipmentRental;
import entities.Member;
import entities.ParkingPass;
import entities.Person;
import entities.Product;
import entities.YearMembership;


public class FlatFileReader {
	
	private ArrayList<Person> personList = new ArrayList<Person>();
	private ArrayList<Member> memberList = new ArrayList<Member>();
	private ArrayList<Product> productList = new ArrayList<Product>();
	
	public ArrayList<Person> readPersons() {
		
		//new scanner object
		Scanner sc = null;
		
		//scan the dat file starting from line 2
		try {
			sc = new Scanner(new File("data/Persons.dat"));
			sc.nextLine(); 
			
			//collect elements separated by ";"	in a loop
			while(sc.hasNext()) {
				String line = sc.nextLine();
				String data[] = line.split(";");
					
				String personCode = data[0];
				
				//split name to first and last name
				String name[] = data[1].split(",");
				
				//remove unnecessary white space
				String firstName = name[1].trim();
				String lastName = name[0].trim();
				
				//split address to street, city, state, zip, country
				String fullAddr[] = data[2].split(",");
				
				//new address object
				Address address = new Address(fullAddr[0], fullAddr[1], fullAddr[2], fullAddr[3], fullAddr[4]); 
				String emails[] = {};
				
				//check if there are emails in each line and add to array only if there's email
				if(data.length > 3) {
					emails = data[3].split(","); 
				}
				
				//create a new person object
				Person person = new Person(personCode, firstName, lastName, address, emails);
				
				//add each object person into the array list
				personList.add(person);
			}
			sc.close();
			return personList;
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public ArrayList<Member> readMember() {
		String type = "";
		
		Scanner sc = null;
		
		try {
			sc = new Scanner(new File("data/Members.dat"));
			sc.nextLine();
			
			while(sc.hasNext()) {
				String line = sc.nextLine();
				String data[] = line.split(";");
				
				String memberCode = data[0];
				
				//check the member type based on "G" or "S"
				if(data[1].equals("G")) {
					type = "General";
				} else {
					type = "Student";
				}
				
				String memberName = data[3];
				
				//split address to street, city, state, zip, and country
				String fullAddr[] = data[4].split(",");
				Address memAddress = new Address(fullAddr[0], fullAddr[1], fullAddr[2], fullAddr[3], fullAddr[4]);
				
				//compare the personCode from the persons file and members file to match their information
				Person contact = null;
				for(Person p : personList) {
					if(data[2].equals(p.getPersonCode())) {
						contact = p;
					}
				}
				
				//new member object and add each member to the array list
				Member member = new Member(memberCode, type, contact, memberName, memAddress);
				memberList.add(member);
			}
			sc.close();
			return memberList;
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public ArrayList<Product> readProduct() {
		Scanner sc = null;
			
		try {
			sc = new Scanner(new File("data/Products.dat"));
			sc.nextLine(); 
			
			while(sc.hasNext()) {
				String line = sc.nextLine();
				String data[] = line.split(";");
					
				String productCode = data[0];
				String productType = data[1];
				double cost = Double.parseDouble(data[data.length-1]);
				Product product = null;
				
				//check if the line of information is a parking pass product
				if(data.length == 3) {
					product = new ParkingPass(productCode, productType, cost);
				}
				//check if the line of information is a equipment rental service
				else if(data.length == 4) {
					String name = data[2];
					product = new EquipmentRental(productCode, productType, name, cost);
				}
				//check if the line of information is a day long membership product
				else if(data.length == 5) {
					String[] dateTime = data[2].split(" ");
					String[] addr = data[3].split(",");
					String startDate = dateTime[0];
					Address address = new Address(addr[0], addr[1], addr[2], addr[3], addr[4]);
					product = new DayMembership(productCode, productType, startDate, address, cost);
				}
				//check if the line of information is a year long membership product
				else if(data.length == 7) {
					String startDate = data[2];
					String endDate = data[3];
					String[] addr = data[4].split(",");
					Address address = new Address(addr[0], addr[1], addr[2], addr[3], addr[4]);
					String name = data[5];
					product = new YearMembership(productCode, productType, startDate, endDate, address, name, cost);
				}
				
				productList.add(product);
			}
			sc.close();
			return productList;
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
