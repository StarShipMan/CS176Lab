/**
 * A student is represented by the name, birth year, and major. You must enter
 * the class name, instance variable(s), and constructor below
 */
public class Student extends Person {
	String major;
	public Student(String inName, int birthYear, String inMajor) {
		super(inName, birthYear);
		major = inMajor;
	}
	/**
	 * Sets String Major of the Student
	 */
	public void setMajor(String inMajor) {
		major = inMajor;
	}
	/**
	 * Returns the string representation of the object.
	 * 
	 * @return a string representation of the object
	 */
	public String toString() {
		return "Student[super=" + super.toString() + ",major=" + major + "]";
	}

}
