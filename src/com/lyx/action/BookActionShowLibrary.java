package com.lyx.action;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import java.util.Date;  
import java.util.Iterator;

//显示全部图书
public class BookActionShowLibrary extends BookAction {
	
	public String execute(){
		String result = "success";
		DBConnection dbHelper = new DBConnection();
		
		List<Book> Books = dbHelper.getBookList();
		
		if(Books==null){
			result = "failure";
		}
		
//		for(Iterator<Book> iterator = Books.iterator() ; iterator.hasNext() ;  )
//		{
//			Book book = (Book)(iterator.next());
//			PrintBookInformation(book);
//		}
		
		Map request = (Map)ActionContext.getContext().get("request");
		request.put("Books", Books);
		
		return result;
	}
	
}
