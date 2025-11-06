package ex03;

public class Box<T extends Person> {

	/*
	 * 타입 제한 : <T extends Person>
	 * T 전달될 수 있는 객체는
	 * Person 이거나 Person 자손들만 가능
	 */
	
	T item;

	void setItem(T item) {
		this.item = item;
	}

	T getItem() {
		return item;
	}
}

/*
 * Car item;
 * 
 * void setItem(Car item) { this.item = item; }
 * 
 * Car getItem() { return item; } }
 * 
 * 이런식으로 자동으로 변경이 된다고 보면 된다.
 */

//-이 Box상자에는 새ㅛ만 집어 넣을 수 있다
/*
 * public class Box<T> {
 * 
 * Toy item;
 * 
 * void setItem(Toy item) { this.item = item; }
 * 
 * Toy getItem() { return item; }
 */
