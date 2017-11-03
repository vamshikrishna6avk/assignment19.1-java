package collectioninjava;//created package as collectioninjava
//import keyword is used to import built-in and user defined package into our java source file. So that our class can refer a class that is in another package by directly 
//java.util contains the collection of framework,legacy collection classes event model,data and time facilities,internationalization and miscellaneous utilit
import java.util.HashSet;//it implements set interface

//javax.swing.text provides classes nd intefaces that deal with editable and noneeditable text components
import javax.swing.text.html.HTMLDocument.Iterator;//iterator is an interface,used to iterator collection of objects

/**
 * 
 * creating a class Student as mention in the question;
 * than created three fields- name, rollNo and department 
 * and than  created a constructor and used getter-setter;
 *
 */
public class Student {//created class as student
	String name;//here taking three different types of variables
	 int rollNo;//variables as name,rollNo,department
	 String department;
	 //here we are creating a constructor
	public Student(String name, int rollNo, String department) {//Here public is a access modifier which defines who can access this method
		super();//super keyword used to refer variable
		this.name = name;//name
		this.rollNo = rollNo;//rollNo
		this.department = department;//department
	}
	// here we are using the getter n setter
		// for three different properties
	public String getName() {//Here public is a access modifier which defines who can access this method
		return name;//returns name
	}
	public void setName(String name) {//Here public is a access modifier which defines who can access this method
		//void is used to define return type of the method,void means method wont return any value
		this.name = name;//gets name
	}
	public int getRollNo() {//Here public is a access modifier which defines who can access this method
		return rollNo;//returns rollNo
	}
	public void setRollNo(int rollNo) {//Here public is a access modifier which defines who can access this method
		//void is used to define return type of the method,void means method wont return any value
		this.rollNo = rollNo;//gets rollNo
	}
	public String getDepartment() {//getsDepartment
		return department;//returns department
	}
	public void setDepartment(String department) {//Here public is a access modifier which defines who can access this method
		//void is used to define return type of the method,void means method wont return any value
		this.department = department;
	}
	/**
	 * In here creating toString method
	 * The toString() method returns the string
	 * representation of the object.
	 * 
	 */
	public  String toString(){//Here public is a access modifier which defines who can access this method
		return "Student name is "+ name+".\nRoll number is :"+rollNo+"\nDepartment is "+department+".\n";
		//returns student name is
		}
}