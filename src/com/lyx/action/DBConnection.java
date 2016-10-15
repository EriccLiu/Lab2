package com.lyx.action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DBConnection {
	
	//����һ��Book���󣬽��ö���������
	public boolean[] CreateBook(Book book){
		Session session = HibernateUtil.currentSession();
		Transaction tran = null;
		
		//��һ����ʾ�Ƿ񴴽��ɹ����ڶ�����ʾ�Ƿ�������
		boolean[] success = {true,false};
		try{
			tran = session.beginTransaction();
			session.save(book);
			session.getTransaction().commit();
			
			//��������Ƿ����
			List<Author> Authors = session.createQuery("FROM Author").list();
			Author author = null;
			for(Iterator<Author> iterator = Authors.iterator() ; iterator.hasNext() ;  )
			{
				Author temp = (Author)(iterator.next());
				if(temp.getAuthorID().equals(book.getAuthorID())){
					success[1] = true;
					author = temp;
					break;
				}
			}
			
		}catch (HibernateException e) {  
			success[0] = false;
			if (tran!=null) tran.rollback();  
			e.printStackTrace();
		}finally {
			HibernateUtil.closeSession();
		}  
		return success;
	}
	//����һ��Author���󣬽��ö���������
	public boolean CreateAuthor(Author author){
		Session session = HibernateUtil.currentSession();
		Transaction tran = null;
		
		boolean success = true;
		
		try{
			tran = session.beginTransaction();
			session.save(author);
			session.getTransaction().commit();
			
		}catch (HibernateException e) {  
			success = false;
			if (tran!=null) tran.rollback();  
			e.printStackTrace();
		}finally {
			HibernateUtil.closeSession();
	    }  
		return success;
	}
	//����һ��Book����ɾ�����ڱ�������
	public boolean Delete(String Title){
		boolean success = false;
		Session session = HibernateUtil.currentSession();
		Transaction tran = null;
		Book book = null;
		try{  
			tran = session.beginTransaction();
 
			List<Book> Books = session.createQuery("FROM Book").list();
			
			for(Iterator<Book> iterator = Books.iterator() ; iterator.hasNext() ;  )
			{
				Book temp = (Book)(iterator.next());
				if(temp.getTitle().equals(Title)){
					success = true;
					book = temp;
					break;
				}
			}
			
	        session.delete(book);   
	         tran.commit();  
	    }catch (HibernateException e) {
	    	 success = false;
	         if(tran!=null){
	        	 tran.rollback();  
	         }
	         e.printStackTrace();   
	    }finally {
			HibernateUtil.closeSession();
	    } 
	     return success;
	  }  
	//����һ��Book����������ڱ�������
	public boolean Update(String Title,String Name,Book newBook){
		boolean success = true;
		Session session = HibernateUtil.currentSession();
		Transaction tran = null;
		Book book = null;
		Author author = null;
		try{
			tran = session.beginTransaction();
			List<Book> Books = session.createQuery("FROM Book").list();
						
			for(Iterator<Book> iterator = Books.iterator() ; iterator.hasNext() ; )
			{
				Book temp = (Book)(iterator.next());
				if(temp.getTitle().equals(Title)){
					book = temp;
					break;
				}
			}

			book.setPublisher(newBook.getPublisher());
			book.setPublishDate(newBook.getPublishDate());
			book.setPrice(newBook.getPrice());
			
			System.out.println(newBook.getPublisher());
			
			session.update(book);
			tran.commit();

		}catch (HibernateException e) {  
	         if (tran!=null) {
	        	 tran.rollback();  
	         }
	         e.printStackTrace();
		}finally{
//			System.out.println(session.hashCode());
			HibernateUtil.closeSession();
	   	}
		return success;
	}
	//��������id
	public boolean UpdateAuthorID(String Title,String AuthorID){
		boolean success = true;
		Session session = HibernateUtil.currentSession();
		Transaction tran = null;
				
		Book book = null;
		Author author = null;
		try{
			tran = session.beginTransaction();
			List<Book> Books = session.createQuery("FROM Book").list();
						
			for(Iterator<Book> iterator = Books.iterator() ; iterator.hasNext() ; )
			{
				Book temp = (Book)(iterator.next());
				if(temp.getTitle().equals(Title)){
					book = temp;
					break;
				}
			}
			
			book.setAuthorID(AuthorID);
			
			session.update(book);
			tran.commit();

		}catch (HibernateException e) {  
	         if (tran!=null) {
	        	 tran.rollback();  
	         }
	         e.printStackTrace();
		}finally{
			HibernateUtil.closeSession();
	   	}
		return success;
	}
	//����һ�������������Ȿ���Book����
	public Book getBook(String BookName){
		Session session = HibernateUtil.currentSession();
		Transaction tran = null;
		
		Book book = null;
		
		try{
			tran = session.beginTransaction();
			List<Book> Books = session.createQuery("FROM Book").list();
			
			for(Iterator<Book> iterator = Books.iterator() ; iterator.hasNext() ;  )
			{
				Book temp = (Book)(iterator.next());
				if(temp.getTitle().equals(BookName)){
					book = temp ;
					break;
				}
			}
			
		}catch (HibernateException e) {  
			if (tran!=null) tran.rollback();  
			e.printStackTrace();
		}finally {
			HibernateUtil.closeSession();
	    }  
		
		return book;
	}
	//����һ��������������������ߵ�Author����
	public Author getAuthor(String Name){
		
		Session session = HibernateUtil.currentSession();
		Transaction tran = null;
		
		Author author = null;
		
		try{
			tran = session.beginTransaction();
			List<Author> Authors = session.createQuery("FROM Author").list();
			
			for(Iterator<Author> iterator = Authors.iterator() ; iterator.hasNext() ;  )
			{
				Author temp = (Author)(iterator.next());
				if(temp.getName().equals(Name)){
					author = temp ;
					break;
				}
			}
			
		}catch (HibernateException e) {  
			if (tran!=null) tran.rollback();  
			e.printStackTrace();
		}finally {
			HibernateUtil.closeSession();
	    }
		
		return author;
	}
	//����һ��������������������ߵ�Author����
	public Author getAuthorByID(String AuthorID){
			
			Session session = HibernateUtil.currentSession();
			Transaction tran = null;
			
			Author author = null;
			
			try{
				tran = session.beginTransaction();
				List<Author> Authors = session.createQuery("FROM Author").list();
				
				for(Iterator<Author> iterator = Authors.iterator() ; iterator.hasNext() ;  )
				{
					Author temp = (Author)(iterator.next());
					if(temp.getAuthorID().equals(AuthorID)){
						author = temp ;
						break;
					}
				}
				
			}catch (HibernateException e) {  
				if (tran!=null) tran.rollback();  
				e.printStackTrace();
			}finally {
				HibernateUtil.closeSession();
		    }
			
			return author;
		}
	//�������е�Book����
	public List<Book> getBookList(){
		Session session = HibernateUtil.currentSession();
		Transaction tran = null;
		
		List<Book> Books = null;
		
		try{  
			tran = session.beginTransaction();
			Books = session.createQuery("FROM Book").list();
	      }catch (HibernateException e) {  
	         if (tran!=null) tran.rollback();  
	         e.printStackTrace();   
	      }finally {  
	    	  HibernateUtil.closeSession();
	      }  
		
		return Books;
	}
	//�������е�Author����
	public List<Author> getAuthorList(){
		Session session = HibernateUtil.currentSession();
		Transaction tran = null;
		
		List<Author> Authors = null;
		
		try{  
			tran = session.beginTransaction();
			Authors = session.createQuery("FROM Author").list();
	      }catch (HibernateException e) {  
	         if (tran!=null) tran.rollback();  
	         e.printStackTrace();   
	      }finally {  
				HibernateUtil.closeSession();
	      }  

		return Authors;
	}
	//����һ��Author���󣬷���������ߵ�����Book����
	public List<Book> getAuthorWorks(String AuthorName,Author author){
		Session session = HibernateUtil.currentSession();
		Transaction tran = null;
		List<Book> Works = new ArrayList<Book>();
		try{  
			tran = session.beginTransaction();
			List<Author> Authors = session.createQuery("FROM Author").list();
			List<Book> Library = session.createQuery("FROM Book").list();
			for(Iterator<Author> iterator = Authors.iterator() ; iterator.hasNext() ;  )
			{
				Author temp = (Author)(iterator.next());
				if(temp.getName().equals(AuthorName)){
					{
						author.setAuthorID(temp.getAuthorID());
						author.setName(AuthorName);
						author.setAge(temp.getAge());
						author.setCountry(temp.getCountry());
					}
					break;
				}
			}
			if(author!=null){
				for(Iterator<Book> iterator = Library.iterator() ; iterator.hasNext() ;  )
				{
					Book temp = (Book)(iterator.next());
					if(temp.getAuthorID().equals(author.getAuthorID())){
						Works.add(temp);
					}
				}
			}
	      }catch (HibernateException e) {  
	         if (tran!=null) tran.rollback();  
	         e.printStackTrace();   
	      }finally {  
				HibernateUtil.closeSession();
	      }  
		return Works;
	}
}
