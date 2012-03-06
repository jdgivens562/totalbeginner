package org.totalbeginner.tutorial;

public class Book {

	 String title;
	 String author;
	 Person person;

	public Book(String string) {
		this.title =string;
		this.author = "unknown author";
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setPerson(Person p2) {
		this.person =p2;
		
	}

	public Person getPerson() {		
		return this.person;
	}

	public String toString(){
		
		String available;
		if(this.getPerson()==null) {
			
			available = "Available";
		}
		else{
			
			available = "Checked out to " + this.getPerson().getName();
					}
		return this.getTitle() + " by " + this.getAuthor() + "; " + available;
	}
	
	
}

