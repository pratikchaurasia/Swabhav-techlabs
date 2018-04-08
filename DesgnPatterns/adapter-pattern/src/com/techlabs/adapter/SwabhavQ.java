package com.techlabs.adapter;

import java.util.Iterator;
import java.util.LinkedList;

public class SwabhavQ<T> implements Iterable<T>{
	private LinkedList<T> list=new LinkedList<T>();
	
	public void anque(T object){
		list.addLast(object);
	}
	
	public Object deque(){
		return list.removeFirst();
	}
	
	public int size(){
		return list.size();
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return list.iterator();
	}
}
