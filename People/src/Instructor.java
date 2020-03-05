/**
   An instructor is represented by a name, a birth year, and a salary.
   You must enter the class name, instance variable(s), and constructor below
*/
public class Instructor extends Person {
	int salary;
	public Instructor(String inName, int inBirthYear, int inSalary ) {
		super(inName, inBirthYear);
		salary = inSalary;
	}
	/**
    sets the int salary of the Instructor
	*/
	public void setSalary(int inSalary) {
		
	}
   /**
      Returns the string representation of the object.
      @return a string representation of the object
   */
   public String toString()
   {
      return "Instructor[super=" + super.toString() + ",salary=" + salary + "]";
   }



}
