package lists;

import utility.List;
import utility.Iterator;
public class ArrayList<E> implements List<E>  {
	private E[] data;
	private int size;
	
	public static final int DEFAULT_CAPACITY = 10;

	public ArrayList() {
		this(DEFAULT_CAPACITY);
	}
	@SuppressWarnings("unchecked")
	public ArrayList(int capacity) {
		data = (E[]) new Object[capacity];
		size = 0;
		
	}

	@SuppressWarnings("unchecked")
	public ArrayList(List<E> other) {
		data = (E[]) new Object[other.size()];
		for (int i = 0; i < other.size(); i++) {
			data[i] = other.get(i);
		}
		size = other.size();
	}
	
	public boolean add(E element) {
		int old_size = size;
		ensureCapacity(size + 1);
		data[size++] = element;
		
		
		return size == old_size + 1;
	}
	public void add(int index, E element) {
		ensureCapacity(size + 1);
		if (index != 0) {
		checkIndex(index-1);
		}
		
		 for (int i =size; i > index ; i--) {
			 data[i] = data[i-1];
		 }
		
		 size++;
		 data[index] = element;
	}
	private void checkIndex(int index) {
		if (index >= size || index < 0) {
			throw new IndexOutOfBoundsException();
		}
	}
	
	public boolean contains(E value) {
		
		for (int i = 0; i < size; i++ ) {
			if (data[i].equals(value)) {
				return true;
			}
			
		}return false;
		
	}
	
	public void clear() {
		for (int i = 0; i < size; i++) {
			data[i] = null;
		}
		size = 0;
	}
	
	@SuppressWarnings("unchecked")
	public void ensureCapacity(int minCapacity) {
	
		
		E[] newData = (E[]) new Object[Math.max(2 * data.length, minCapacity)];
		
		for (int i =0; i < size; i++) {
			newData[i] = data[i];
		}
		
		data = newData;
		
	}
	
	public E get(int index) {
		return data[index];
	}
	
	public int indexOf(E element) {
		for (int i = 0; i < size; i++) {
			if (data[i].equals(element)) {
				return i;
			}
		}return -1;
	}
	
	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}return false;

	}
	
	public Iterator<E> iterator(){
		return new ArrayIterator();
	}
	
	public E remove(int index) {
		checkIndex(index);
		E element = data[index];
		data[index] = null;
		for (int i = index; i < size - 1; i++) {
			data[i] = data[i+1];
			
		}
			data[size - 1] = null;
			size --;
			return element;
	}
	
	public boolean remove(E element) {
		
		for (int i = 0; i < size; i++) {
			if(data[i].equals(element)) {
				data[i] = null;
				for (int j = i; j < size - 1; j++) {
					data[j] = data[j+1];
				}
				size --;
				 return true;
			}
		}return false;
			
	}
	
	public E set(int index, E element) {
		checkIndex(index);
		E oldElement = data[index];
		data[index] = element;
		return oldElement;
		
	}
	
	public int size() {
		return size;
	}
	
	@Override
	public String toString() {
		if (size == 0) {
			return "[ ]";
		}else {
			String result = "[" + data[0];
			for (int i =1; i < size ; i++) {
				result +=", " + data[i];
			}
			result +="]";
			return result;
			
		}
	}
	
		
	private class ArrayIterator implements Iterator<E>{
		private int index;
		private boolean isRemovable;
		
		public ArrayIterator() {
			this.index = 0;
			this.isRemovable = false;
		}
		
		public boolean hasNext() {
			if (index + 1 <= size) {
				return true;
			}
			return false;
		}
		
		public E next() {
			
			if(! hasNext()) {
				throw new IndexOutOfBoundsException();
			}
			this.isRemovable = true;
			return data[index++];
			
		}
		
		public void remove() {
			if(! isRemovable) {
				throw new IllegalStateException();
			}
			else {
				ArrayList.this.remove(--index);
				this.isRemovable = false;
			}
		}
	}
}


