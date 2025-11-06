package ex03;

public class Box<T extends Person> {

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
