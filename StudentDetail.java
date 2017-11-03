package collectioninjava;//created package as collectioninjava
/**
 * In here importing class, which are belong from java.util.package;
 */
//import keyword is used to import built-in and user defined package into our java source file. So that our class can refer a class that is in another package by directly 
//java.util contains the collection of framework,legacy collection classes event model,data and time facilities,internationalization and miscellaneous utilit
import java.util.HashSet;//it implements set interface
import java.util.Iterator;//iterator is an interface,used to iterator collection of objects
/**
 *
 * In here created a class StudentDetail to store detail of 
 * students by using HashSet;
 * HashSet class is used to create a collection that uses
 * a hash table for storage;
 *
 */
public class StudentDetail {//Here public is a access modifier which defines who can access this method

	public static void main(String[] args) {//Here public is a access modifier which defines who can access this method
		//Here static a keyword which identifies class related thing
		//void is used to define return type of the method,void means method wont return any value
		//main is name of method,and to display
		//declares method String[]
		//String[]args means arguments will be passed into main method and says that main() as a parameter
		HashSet<Student> objStd= new HashSet<Student>();// here we are creating the object of hashset
		System.out.println("Display of students detail\n");//system is used to return code
        //out is a static member
        //println is used to print text and gives output
		 /**
		  * Creating Students details 
		  * and adding Students to HashSet 
		  * 
		  */
		Student one= new Student("vamshi",47,"maths");//adding three student details
		Student second= new Student("ramesh",20,"Zoology");
		Student third= new Student("Ankur",5,"Botany");
		objStd.add(one); //adding serially
		objStd.add(second);  
		objStd.add(third);
		/**
		 * In here using iterator
		 * and than using while loop for checking the value
		 * and call hasNext() which will returns true if there are 
		 * more elements. Otherwise, returns false.
		 */
		Iterator iterator=objStd.iterator();
		
		while(iterator.hasNext()){
			System.out.println(iterator.next());//system is used to return code
	        //out is a static member
	        //println is used to print text and gives output
		}

	}

}