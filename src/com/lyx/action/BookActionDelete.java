package com.lyx.action;

//Lab3-modification-5

//当用户点击删除时，将对映的图书从数据表中删除
public class BookActionDelete extends BookAction {
	
	public String execute(){
		String result="failure";
		DBConnection dbHelper = new DBConnection();
		
		System.out.println("Delete:Title"+Title);
		
		if(dbHelper.Delete(Title)){
			System.out.println("success");

			result = "success";
		}
		
		return result;
		
	}

}
