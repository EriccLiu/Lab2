package com.lyx.action;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

//输入作者名字，查询该作者所著的全部图书的题目
public class BookActionQueryByAuthor extends BookAction {

	public String execute(){
		String result = "success";
		DBConnection dbHelper = new DBConnection();
	
		Author get_author = new Author();
		List<Book> Books = dbHelper.getAuthorWorks(Name,get_author);
		
		if(get_author.getAuthorID()==null){
			result = "failure";
		}else{
			setAuthorID(get_author.getAuthorID());
			setName(get_author.getName());
			setAge(get_author.getAge());
			setCountry(get_author.getCountry());
		}
		
//		PrintAuthorInformation(get_author);
//		
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
