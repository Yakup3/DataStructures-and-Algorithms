//-----------------------------------------------------
// Title: Person class
// Author: Yakugpguly/Malikov
// Section: 1
// Assignment: 2
// Description: This class creates person with the name, surname, id and compares with their id
//-----------------------------------------------------

public class Person implements Comparable<Person> {
	private String name, surname;
	private long id;

	public Person(String name, String surname, long id) {
		this.name = name;
		this.surname = surname;
		this.id = id;
	}

	// returns the name of person
	public String getName() {
		return name;
	}

	// compares two person according to their id
	@Override
	public int compareTo(Person o) {
		if (this.id > o.id)
			return 1;
		else if (this.id < o.id)
			return -1;

		return 0;
	}

	// prints the person
	public String toString() {
		return name + " " + surname + " " + id;
	}
}
