package com.lyx.action;

//Lab3-modification-4

//用户可新增一本图书，若该作者不在库中，还需增加新作者
public class BookActionCreateAuthor extends BookAction{

	public String execute(){
		String result = "failure";
		DBConnection dbHelper = new DBConnection();
		
		author = new Author();

		if(AuthorID!=null&&Name!=null&&Age!=null&&Country!=null){
			author.setAuthorID(AuthorID);
			author.setName(Name);
			author.setAge(Age);
			author.setCountry(Country);
			if(dbHelper.CreateAuthor(author)){
				result = "success";
			}
		}
		
		return result;
	}
	
}
