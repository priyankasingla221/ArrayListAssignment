package youtubesubscrption;


//importing arraylist util class
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		/**Length of array is fixed.
		List is an interface which provides different ways in which you can add as many methods you want
		Most important element of list is Element list.
		Wrapper class Starts with Capital name. 
		Wrapper classes are used to declare datatype.
		toString is used to array values.	
		Index is always needed to modify anything in arrayList
		We can get element in arraylist using get() **/
		
		

		// Creating objects of subscription class for each individual
		Subscription priyankaAccount = new Subscription("Priyanka221@gmail.com", "Priyanka", "Monthly");
		Subscription kamalAccount = new Subscription("Kamal32@gmail.com", "Kamal", "Yearly");
		Subscription sudhaAccount = new Subscription("sudha41@yahoo.com", "Sudha", "Weekly");
		Subscription komalAccount = new Subscription("Komal65@hotmail.com", "Komal", "Monthly");

		// declaring array list
		ArrayList<Subscription> accountlist = new ArrayList<Subscription>();
		
		// adding values to array list

		// placed on index[0]
		accountlist.add(priyankaAccount);

		// placed on index[1]
		accountlist.add(kamalAccount);

		// placed on index[2]
		accountlist.add(sudhaAccount);

		// Inserts the specified element at the specified position in thislist. Shifts
		// the element currently at
		// that position and any subsequent elements to the right (adds one to their
		// indices).
		accountlist.add(0, komalAccount);
		
		System.out.println("Size of ArrayList: " +accountlist.size());
		
		//Storing index of sudhas account into variable
		int userindex = accountlist.indexOf(sudhaAccount);
		//Creating object of index for sudha so that value of sudha can be called using object
		Subscription userobj = accountlist.get(userindex);
		
		//getting values using get. 
		String sudhaemail = userobj.getEmailAddress();
		String sudhaname = userobj.getName();
		String sudhasubscription = userobj.getSubscription();
		
		System.out.println("Email: " +sudhaemail+ "\n"+ "Name: " +sudhaname+"\n"+ "Subscription Type: " +sudhasubscription);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		//getting value of priyanka account directly using get method with reference to object of arraylist.
		String priyankaemail = accountlist.get(accountlist.indexOf(priyankaAccount)).getEmailAddress();
		String priyankaname = accountlist.get(accountlist.indexOf(priyankaAccount)).getName();
		String priyankasubscription = accountlist.get(accountlist.indexOf(priyankaAccount)).getSubscription();
		
		System.out.println("Email: " +priyankaemail+ "\n"+ "Name: " +priyankaname+"\n"+ "Subscription Type: " +priyankasubscription);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Adding Contacts in new Array List");
		
		//creating new array list
		ArrayList<String> contacts= new ArrayList<String>();
		//adding names in array list
		//stored at index[0]
		contacts.add("Ankit");
		//stored at next index[1]
		contacts.add("Navjot");
		//stored at next index[2]
		contacts.add("Rishav");
		System.out.println("Initial Array list"+contacts);
		System.out.println("Element at Index 0: "+contacts.get(0));
		System.out.println("Element at Index 1: "+contacts.get(1));
		System.out.println("Element at Index 2: "+contacts.get(2));
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		//Inserts the specified element at the specified position in thislist
		contacts.add(1, "Ankush");
		System.out.println("New Array List: "+contacts);
		System.out.println("New size of array: " +contacts.size());
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		//Contains return boolean value 
		System.out.println("Checking if Arraylist Contains Kartik: "+contacts.contains("Kartik"));
		System.out.println("Checking if Arraylist Contains Rishav: "+contacts.contains("Rishav"));
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		//remove element
		System.out.println("Removing Ankit from list: " +contacts.remove("Ankit"));
		System.out.println(contacts);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		//clearing out whole array list
		contacts.clear();
		System.out.println("Array list" +contacts);
		
		
	
	
	
	}

}
