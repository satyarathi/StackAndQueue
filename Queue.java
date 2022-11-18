package com.linkedlist;

public class Queue <T>{
	MyLinkedList<T>list = new MyLinkedList<>();

	void enqueue(T key){
		list.append(key);
	}

	public T dequeue() {
		return list.pop();
	}

	void print() {
		list.display();
	}
}


