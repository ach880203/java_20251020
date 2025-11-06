package ex02;

public class BoxMain {
	
	public static void main(String[] args) {
		/*
		 *  Car가 의미하는 것은 Box클래스에 있는 T가 Car란 것을 의미한다.
		 *  즉.. T를 Car로 변경해서 컴파일시 Box.class파일이 생성된다.
		 */
		Box<Car> box = new Box<Car>();
		
		//Box.setItem(new car());
		
		/*
		 * box.setItem("new Car()");
		 * 이 코드는 에러가 발생 이유는 box.setItem(Car car)이므로
		 * Car 클래스 객체만 전달가능
		 * 하지만, 지금은 "new Car()"란 문자열을 전달하려고 시도했기 때문에
		 * 에러가 발생.. 즉 차입이 밀치하지 않기 떄문에.
		 */
		
		//box.setItem('new Car'); 사용할 수 없게 됨
		box.setItem(new Car());
		
		Car car = box.getItem();
		
		Box<Toy> tBox = new Box<Toy>();
		//tBox.setItem(new Car()); Car에서 Toy로 변화 되어서 사용할 수 없음
		tBox.setItem(new Toy());
		Toy toy = tBox.getItem();
	 
		Box<String> sBox = new Box<String>();
		sBox.setItem("문자열만 투입");
		String str = sBox.getItem();
		
}
}
class Car{
	
}

class Toy{
}

