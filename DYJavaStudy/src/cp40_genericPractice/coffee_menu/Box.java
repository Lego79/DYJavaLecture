package cp40_genericPractice.coffee_menu;

public class Box<T> {
	
	T data;

	public Box(T data) {
		this.data = data;
	}
	
	public Box() {
		
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	
	

}
