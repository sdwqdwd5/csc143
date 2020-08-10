package exercise;

public class Generic<T> {

	private T data;
	
	public Generic() {
		data = null;
	}
	
	public Generic(T data) {
		this.data = data ;
	}
	
	public void set(T data) {
		this.data = data;
	}
	
	public boolean equals(Object object) {
		return data.equals(object);
	}
	public int hashCode() {
		return data.hashCode() + 2048000000;
	}
	public T get() {
		return data;
	}
	
	public String toString() {
		return data.toString();
	}
}
