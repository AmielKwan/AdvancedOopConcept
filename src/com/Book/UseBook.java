package com.Book;

public class UseBook 
{
	public static void main (String [] args)
	{
		Book books;
		books = new Fiction ("Fictional: Maze Runner");
		System.out.println(books.getTitle() + " for $" + books.getPrice());
		books = new NonFiction ("NonFictional: Holy Bible");
		System.out.println(books.getTitle() + " for $" + books.getPrice());
	}
}