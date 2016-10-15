package com.lyx.action;

//Lab3-modification

import java.util.Date;

public class Book {
	
	private String ISBN;
	private String Title;
	private String AuthorID;
	private String Publisher;
	private String PublishDate;
	private Float Price;
	
	
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getAuthorID() {
		return AuthorID;
	}
	public void setAuthorID(String authorID) {
		AuthorID = authorID;
	}
	public String getPublisher() {
		return Publisher;
	}
	public void setPublisher(String publisher) {
		Publisher = publisher;
	}
	public String getPublishDate() {
		return PublishDate;
	}
	public void setPublishDate(String publishDate) {
		PublishDate = publishDate;
	}
	//	public void setPublishDate(Date newPublishDate){
//		this.PublishDate = newPublishDate;
//	}
//	public Date getPublishDate(){
//		return PublishDate;
//	}
	public Float getPrice(){
		return Price;
	}
	public void setPrice(Float Price){
		this.Price = Price;
	}
	
}
