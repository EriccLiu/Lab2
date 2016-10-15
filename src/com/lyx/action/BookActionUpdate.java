package com.lyx.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

//用户可更新一本图书的作者、出版社。出版日期。价格
public class BookActionUpdate extends BookAction {

	protected String newISBN;
	protected String newTitle;
	protected String newAuthorID;
	protected String newPublisher;
	protected String newPublishDate;
	protected Float newPrice;
	protected String newName;

	public String getNewISBN() {
		return newISBN;
	}
	public void setNewISBN(String newISBN) {
		this.newISBN = newISBN;
	}

	public String getNewTitle() {
		return newTitle;
	}
	public void setNewTitle(String newTitle) {
		this.newTitle = newTitle;
	}

	public String getNewAuthorID() {
		return newAuthorID;
	}
	public void setNewAuthorID(String newAuthorID) {
		this.newAuthorID = newAuthorID;
	}

	public String getNewPublisher() {
		return newPublisher;
	}
	public void setNewPublisher(String newPublisher) {
		this.newPublisher = newPublisher;
	}

	public String getNewPublishDate() {
		return newPublishDate;
	}
	public void setNewPublishDate(String newPublishDate) {
		this.newPublishDate = newPublishDate;
	}

	public Float getNewPrice() {
		return newPrice;
	}
	public void setNewPrice(Float newPrice) {
		this.newPrice = newPrice;
	}

	public String getNewName() {
		return newName;
	}
	public void setNewName(String newName) {
		this.newName = newName;
	}


	public String execute(){
		String result = "failure";
		DBConnection dbHelper = new DBConnection();
		Book newBook = new Book();
		Map request = (Map)ActionContext.getContext().get("request");

//		System.out.println(Title);
//		System.out.println(Name);
//		System.out.println(Publisher);
//		System.out.println(PublishDate);
//		System.out.println(Price);
//		System.out.println("^^^^^^^^^^^^^^^^^^^");
//		System.out.println(newName);
//		System.out.println(newPublisher);
//		System.out.println(newPublishDate);
//		System.out.println(newPrice);
		
		newBook.setPublisher(newPublisher);
		newBook.setPublishDate(newPublishDate);
		newBook.setPrice(newPrice);

		//只更新出版社、出版日期。价格
		//作者编号同一更新
		Author author = dbHelper.getAuthor(newName);
		if(dbHelper.Update(Title,newName,newBook)){
			if(author==null){
				result="no author";
			}else if(dbHelper.UpdateAuthorID(Title,author.getAuthorID())){
			result = "success";
			}			
		}
		
		request.put("Title",Title);
		
		return result;
	}
	
}
