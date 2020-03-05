
	/**
	   A person is represented by the name and a birth year.
	   You must enter the class name, instance variable(s), and constructor below
	*/
public class Person {
	private String name;
	private int birthYear;
	/**
    Constructs the Person.
	 */
	public Person(String inName, int inBirthYear) {
		name= inName;
		birthYear=inBirthYear;
	}
	
	/**
    Sets the string name of the Person.
	 */
	public void setName(String inName) {
		name = inName;
	}
	/**
    Sets the int birthYear of the Person.
	 */
	public void setBirthYear(int inBirthYear) {
		birthYear = inBirthYear;
	}
	/**
	      Returns the string representation of the object.
	      @return a string representation of the object
	*/
	   public String toString()
	   {
	      return "Person[name=" + name + ",birthYear=" + birthYear + "]";
	   }
}
