package org.totalbeginner.tutorial;
	// class contains 3 things 1. fields 2. constructors 3. methods
public class Person {
	// fields
	private String name; // name of the person
	private int maximumBooks; // most books person can check out
	
	// constructors
	public Person() {
		name = "unknown name";
		maximumBooks = 3;		
	}	
	// methods
	public String getName(){
		return name;
	}
	public void	setName(String anyName) {
		name = anyName;
	}

	public int getMaximumBooks() {
		return maximumBooks;
	}

	public void setMaximumBooks(int maximumBooks) {
		this.maximumBooks = maximumBooks;
	}
	
	public String	toString(){
		
		return this.getName() + " (" +this.getMaximumBooks() +" books)";
	}
	
	
}


