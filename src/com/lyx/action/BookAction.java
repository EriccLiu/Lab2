package com.lyx.action;

//Lab3-modification-3

import java.util.Date;

import org.apache.struts2.ServletActionContext;

/*
	暂时存在的问题：
	2、新增图书会关闭ss
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
	//用户名
	public String getUsername(){ return username; }
	public void setUsername(String username){ this.username = username; }
	//密码
	public String getPassword(){ return password; }
	public void setPassword(String password){ this.password = password; }
	//图书编号
	public String getISBN() { return ISBN; }
	public void setISBN(String iSBN) { ISBN = iSBN; }
	//书名
	public String getTitle(){ return Title; }
	public void setTitle(String Title){ this.Title = Title; }
	//作者编号
	public String getAuthorID() { return AuthorID; }
	public void setAuthorID(String authorID) { AuthorID = authorID; }
	//出版社
	public String getPublisher(){ return Publisher; }
	public void setPublisher(String Publisher){ this.Publisher = Publisher; }
	//出版日期
	public String getPublishDate() { return PublishDate; }
	public void setPublishDate(String publishDate) { PublishDate = publishDate; }
	//价格
	public Float getPrice(){ return Price; }
	public void setPrice(Float Price){ this.Price = Price; }
	//作者名
	public String getName(){ return Name; }
	public void setName(String Name){ this.Name = Name; }	
	//作者年龄
	public Integer getAge(){ return Age; }
	public void setAge(Integer Age){ this.Age = Age; }
	//作者国家
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
