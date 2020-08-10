package circular;

import java.util.NoSuchElementException;

import utility.Iterator;
import utility.List;

public class LinkedList<E> implements List<E> {
	private Node<E> first;
	private int 	size ;
	
	public LinkedList() {
		first = null;
		size  = 0;
	}
	
	public LinkedList(List<E> other) {
		for (int i = 0; i < other.size(); i++) {
			add(other.get(i));
		}
	}
	
	public boolean add(E element) {
		int		oldSize 	= size;
		Node<E> newNode 	= new Node<E>(first, element);
		if (first == null) {
			first = newNode;
		}else {
			node(size-1).next = newNode;
		}
		size++;
		return oldSize +1 == size;
	}
	
	public void add(int index,E element) {
		if (size == 0 || index == size) {
			add(element);
			return;
		}else if (index == 0) {
			Node<E> newOne = new Node<E>(first, element);
			node(size-1).next = newOne;
			first = newOne;
		}else {
			checkIndex(index);
			Node<E> previous= node(index-1);
			Node<E> newOne  = new Node<E>(previous.next, element);
			previous.next = newOne;
		}
		size++;
	}
	
	private void checkIndex(int index) {
		if (index > size-1 || index < 0) {
			throw new IndexOutOfBoundsException();
		}
	}
	
	public void clear() {
		first = null;
		size  = 0;
	}
	
	public boolean contains(E element) {
		Node<E> current = first;
		for (int i = 0; i < size; i++) {
			if (current.data.equals(element)) {
				return true;
			}
			current = current.next;
		}
		return false;
	}
	
	public E get(int index) {
		return (node(index)).data;
	}
	
	public int indexOf(E element) {
		Node<E> current = first;
		for (int i = 0; i < size; i++) {
			if (current.data.equals(element)) {
				return i;
			}
			current = current.next;
		}
		return -1;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public Iterator<E> iterator(){
		return new LinkedIterator();
	}
	
	public E next(int index) {
		return node(index).next.data;
	}
	
	private Node<E> node(int index) {
		checkIndex(index);
		if (index == 0) {
			return first;
		}
		Node<E> current = first;
		for (int i = 0; i < index; i++) {
			current = current.next;
		}
		return current;
	}
	
	public E remove() {
		if (first != null) {
			return unlink(0);
		}
		throw new NoSuchElementException();
	}

	public E remove(int index) {
		if (index == 0) {
			return remove();
		}
		return unlink(index);
	}
	
	public boolean remove(E element) {
		if(contains(element)) {
			unlink(indexOf(element));
			return true;
		}
		return false;	
	}
	
	public E set(int index, E element) {
		E data = node(index).data;
		node(index).data = element;
		return data;
	}
	
	public int size() {
		return size; 
	}
	
	public String toString() {
		if (first == null) {
			return "[]";
		}
		String result = "[ " + first.data;
		Node<E> current = first.next;
		while (current != first) {
			result += ", " + current.data;
			current = current.next;	
		}
		result += " ]";
		return result;
	}
	
	// use an helper method unlink to remove the element in the list
	private E unlink(int index) {
		Node<E> current = node(index);
		E element = current.data;
		if (size != 1) {
			if (index == 0) {
				node(size-1).next = current.next;
				first = current.next;
			}else{
				node(index-1).next = current.next;
			}
		}else {
			first = null;
		}
		current  = null;
		size--;
		return element;
	}
	
	private static class Node<E>{
		private E data;
		private Node<E> next;
		private Node(Node<E> next, E data) {
			this.next = next;
			this.data = data;
		}
	}

	private class LinkedIterator implements Iterator<E>{
		private Node<E> current;
		private int index;
		private boolean isRemovable;
		
		public LinkedIterator() {
			this.current     = first;
			this.index   	 = 0;
			this.isRemovable = false;	
		}
		
		public boolean hasNext() {
			return index < size;
		}
		
		public E next() {
			if (! hasNext()) {
				throw new NoSuchElementException();
			}
			E element 		 = current.data;
			this.isRemovable = true;
			current 		 = current.next;
			index ++;
			return element;
		}
		
		public void remove() {
			if (! isRemovable) {
				throw new IllegalStateException();
			}
			LinkedList.this.remove(--index);
			isRemovable = false;
		}
	}
}
 