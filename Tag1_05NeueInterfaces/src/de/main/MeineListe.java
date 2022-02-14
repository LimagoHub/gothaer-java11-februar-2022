package de.main;

public interface MeineListe<T> {

	T get();
	default boolean moveFirst() {
		if(isEmpty()) return false;
		while(movePrevious());
		return true;
	}
	default boolean moveLast() {
		if(isEmpty()) return false;
		while(moveNext());
		return true;
	}
	boolean moveNext() ;
	boolean movePrevious() ;
	boolean remove() ;
	default boolean clear() {
		if(isEmpty()) return false;
		while(remove());
		return true;
	}
	boolean isBol() ;
	boolean isEol() ;
	boolean isEmpty() ;
	
	static <T> MeineListe<T> getArrayList() {
		return null;
	}
	static <T> MeineListe<T> getLinkedList() {
		return null;
	}
}
