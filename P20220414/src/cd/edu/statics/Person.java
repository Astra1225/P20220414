package cd.edu.statics;
// co.deu.statics.Person ->
public class Person {
	final String nation = "Korea";
	final String ssn;
	static final double PI = 3.14; //클래스소속, 변경불가.
	String name;
	
	public Person (String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
		
	}

}
