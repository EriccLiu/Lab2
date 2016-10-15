package com.lyx.action;

//Lab3-modification

public class Author {
	
	private String AuthorID;
	private String Name;
	private Integer Age;
	private String Country;
	
	public String getAuthorID() {
		return AuthorID;
	}
	public void setAuthorID(String authorID) {
		AuthorID = authorID;
	}
	public String getName(){
		return Name;
	}
	public void setName(String Name){
		this.Name = Name;
	}
	public Integer getAge(){
		return Age;
	}
	public void setAge(Integer Age){
		this.Age = Age;
	}
	
	public String getCountry(){
		return Country;
	}
	public void setCountry(String Country){
		this.Country = Country;
	}
	
}
