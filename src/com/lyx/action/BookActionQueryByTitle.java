package com.lyx.action;

//���û����ĳ��ͼ�����Ŀʱ��չʾͼ����ϸ��Ϣ��������ϸ��Ϣ
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
