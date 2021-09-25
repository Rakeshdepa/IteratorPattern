package com.closets.buildMethod;

public class ClosetIteratorPattern {

	public static void main(String[] args) {
		
		ClosetsStore store = new ClosetsStore();
		
		for(Iterator iterator = store.getIterator(); iterator.hasNext();) {
			
			String name = (String)iterator.next();
	         System.out.println("This is  : " + name + " closet");
			
		}
		

	}

}
