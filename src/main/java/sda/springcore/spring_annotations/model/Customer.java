package sda.springcore.spring_annotations.model;


// That's what we call a POJO: Plain Old Java Object, in some implementations "a bean"
// A building lego brick in Spring none less

public class Customer {

	private String firstname;
	private String lastname;
	
	public Customer () { }

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

}
