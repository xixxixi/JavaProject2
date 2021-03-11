package generics;

class Apple{
	
}
class Orange{
	
}

public class Box<T> {
	T box;
	public void setBox(T box) {
		this.box = box;
	}
	public T getBox() {
		return box;
	}
}
