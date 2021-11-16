package com.bridgeLabz;

public class AddressBook {
	private class Contact{
		String firstName, lastNmae, address, city, state, emailId;
		int zipCode;
		long mobileNumber;
	}
	
	public void printContact() {
		Contact person = new Contact();
		person.firstName="Nadeem";
		person.lastNmae="Shaikh";
		person.address="Dighi pune";
		person.city="Pune";
		person.state="Maharashtra";
		person.zipCode=411015;
		person.mobileNumber=8208022703L;
		person.emailId="nadeemshaikh1171998@gmail.com";
		System.out.println("Contact Details");
		System.out.println("Name          : " + person.firstName + " " + person.lastNmae + "\n" 
				         + "Address       : " + person.address + "\n"
				         + "City          : " + person.city + "\n"
				         + "State         : " + person.state + "\n"
				         + "ZipCode       : " + person.zipCode + "\n"
				         + "MobileNumber  : " + person.mobileNumber + "\n"
				         + "EmailId       : " + person.emailId + "\n" );
	}

	public static void main(String[] args) {
		AddressBook addressBook = new AddressBook();
		addressBook.printContact();

	}

}
