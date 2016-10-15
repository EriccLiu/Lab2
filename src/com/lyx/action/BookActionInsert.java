package com.lyx.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

//用户可新增一本图书，若该作者不在库中，还需增加新作者
public class BookActionInsert extends BookAction{

	public String execute(){
		String result = "failure";
		DBConnection dbHelper = new DBConnection();
		boolean[] success = new boolean[2];
		
		if(ISBN!=null&&Title!=null&&AuthorID!=null&&Publisher!=null&&PublishDate!=null&&Price!=null){
			book = new Book();
			book.setISBN(ISBN);
			book.setTitle(Title);
			book.setAuthorID(AuthorID);
			book.setPublisher(Publisher);
			book.setPublishDate(PublishDate);
			book.setPrice(Price);
		
			success = dbHelper.CreateBook(book);
		}
		
		if(success[0]&&success[1]){
			result = "success";
		}else if(success[0]&&(!success[1])){
			result = "no author";
		}
		
		Map request = (Map)ActionContext.getContext().get("request");
		request.put("Title", Title);
		
		return result;
	}
	
}
