package com.lyx.action;

//Lab3-modification-3

import java.util.Date;

import org.apache.struts2.ServletActionContext;

/*
	��ʱ���ڵ����⣺
	2������ͼ���ر�ss
 */

public class BookAction {
	public Book book;
	public Author author;
	
	public Book getBook() { return book; }
	public void setBook(Book book) { this.book = book; }
	public Author getAuthor() { return author; }
	public void setAuthor(Author author) { this.author = author; }
	public String getAuthorInfo() throws Exception {
		Author author = new Author();
		ServletActionContext.getRequest().setAttribute("author", author);
		return "showInfo";
		}
	
	protected String username;
	protected String password;
	
	protected String ISBN;
	protected String Title;
	protected String AuthorID;
	protected String Publisher;
	protected String PublishDate;
	protected Float Price;
	protected String Name;
	protected Integer Age;
	protected String Country;
//	
//	public Date getPublishDate() {
//		return PublishDate;
//	}
//	public void setPublishDate(Date publishDate) {
//		PublishDate = publishDate;
//	}
	//�û���
	public String getUsername(){ return username; }
	public void setUsername(String username){ this.username = username; }
	//����
	public String getPassword(){ return password; }
	public void setPassword(String password){ this.password = password; }
	//ͼ����
	public String getISBN() { return ISBN; }
	public void setISBN(String iSBN) { ISBN = iSBN; }
	//����
	public String getTitle(){ return Title; }
	public void setTitle(String Title){ this.Title = Title; }
	//���߱��
	public String getAuthorID() { return AuthorID; }
	public void setAuthorID(String authorID) { AuthorID = authorID; }
	//������
	public String getPublisher(){ return Publisher; }
	public void setPublisher(String Publisher){ this.Publisher = Publisher; }
	//��������
	public String getPublishDate() { return PublishDate; }
	public void setPublishDate(String publishDate) { PublishDate = publishDate; }
	//�۸�
	public Float getPrice(){ return Price; }
	public void setPrice(Float Price){ this.Price = Price; }
	//������
	public String getName(){ return Name; }
	public void setName(String Name){ this.Name = Name; }	
	//��������
	public Integer getAge(){ return Age; }
	public void setAge(Integer Age){ this.Age = Age; }
	//���߹���
	public String getCountry(){ return Country; }
	public void setCountry(String Country){ this.Country = Country; }

	public void PrintBookInformation(Book book){
		System.out.println("ISBN:"+book.getISBN());
		System.out.println("Title:"+book.getTitle());
		System.out.println("AuthorID:"+book.getAuthorID());
		System.out.println("Publisher:"+book.getPublisher());
		System.out.println("PublishDate:"+book.getPublishDate());
		System.out.println("Price:"+book.getPrice());
		System.out.println("--------------------");
	}
	public void PrintAuthorInformation(Author author){
		System.out.println("AuthorID:"+author.getAuthorID());
		System.out.println("Name:"+author.getName());
		System.out.println("Age:"+author.getAge());
		System.out.println("Country:"+author.getCountry());
		System.out.println("====================");
	}
	
	public String execute(){
		return "other";
	};
}
