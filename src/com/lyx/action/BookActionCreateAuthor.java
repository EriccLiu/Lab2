package com.lyx.action;

//Lab3-modification-4

//�û�������һ��ͼ�飬�������߲��ڿ��У���������������
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
