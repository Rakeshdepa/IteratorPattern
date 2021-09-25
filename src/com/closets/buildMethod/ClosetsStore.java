package com.closets.buildMethod;

public class ClosetsStore implements ClosetStorage {
	
	public String closets[] = {"BedRoom","GarageRoom","BasementRoom","RestRoom","BasementRoom"}; 

	@Override
	public Iterator getIterator() {
		return new ClosetIterator();
	}
	
	private class ClosetIterator implements Iterator{

		int index;
		
		@Override
		public boolean hasNext() {
			
			if(index < closets.length){
	            return true;
	         }
			
			return false;
		}

		@Override
		public Object next() {
			
			if(this.hasNext()){
	            return closets[index++];
	         }
	         return null;
		}

		
	}

}
