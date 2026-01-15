package ex5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


/*
 * 생성자 메서드 참조
 */

class Person{
	String name;
	public Person(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
		
	}
}
public class MethodRef5 {
	public static void main(String[] args) {
	
		//List<String> s = new ArrayList<String>();
		Supplier<List<String>> list = () -> new ArrayList();
		
		Supplier<List<String>> list2 = ArrayList :: new;
		
		System.out.println("------------------------------------------");
		
		Function<String, Person> f = name -> new Person(name);
		Person p = f.apply("홍길동");
		System.out.println(p);
	
		Function<String, Person> f2 =Person :: new;
		Person p2 = f.apply("장산범");
		System.out.println(p);
	}
}
