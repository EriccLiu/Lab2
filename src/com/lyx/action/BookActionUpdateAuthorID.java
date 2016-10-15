package com.lyx.action;

public class BookActionUpdateAuthorID extends BookAction {
	public String execute(){
		String result = "failure";
		DBConnection dbHelper = new DBConnection();
		
		System.out.println(Title);
		System.out.println(Name);
		
		Author author = dbHelper.getAuthor(Name);
		AuthorID = author.getAuthorID();
		if(dbHelper.UpdateAuthorID(Title,AuthorID))
			result = "success";
		
		return result;
	}
}
