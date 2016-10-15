package com.lyx.action;

//当用户点击某本图书的题目时，展示图书详细信息和作者详细信息
public class BookActionQueryByTitle extends BookAction {
	
	public String execute(){
		String result = "success";
		DBConnection dbHelper = new DBConnection();
		
		Book book = null;
		book = dbHelper.getBook(Title);
		
		if(book==null){
			result = "failure";
		}else{
			setISBN(book.getISBN());
			setAuthorID(book.getAuthorID());
			setPublisher(book.getPublisher());
			setPublishDate(book.getPublishDate());
			setPrice(book.getPrice());
			
//			PrintBookInformation(book);
		}
		
		return result;

	}
	
}
