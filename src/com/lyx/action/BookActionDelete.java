package com.lyx.action;

//Lab3-modification-5

//���û����ɾ��ʱ������ӳ��ͼ������ݱ���ɾ��
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
