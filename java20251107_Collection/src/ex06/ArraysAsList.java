package ex06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {

	public static void main(String[] args) {

		int[] iArr = new int[5]; //이렇게 하면 초기화 할 수 있지만
		iArr[0] = 10;
		iArr[1] = 20;
		iArr[2] = 30;
		iArr[3] = 40;
		iArr[4] = 50;
		
		int[] iArr2 = {10, 20, 30, 40, 50};//이렇게 하면 더 쉽다
		
		
	
		
		//ArrayList는 객체 생성과 동시 초기화 불가
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		List<Integer> list1 =
				new ArrayList<Integer>(Arrays.asList(10,20,30,40,50));
		System.out.println("list1 : " + list);
		
		
		//리스트 객체 생성하면서 초기화 가능
		//단, 수정 불가
		List<Integer> list2 = Arrays.asList(10,20,30,40,new Integer(50));
		System.out.println(list2);
		
		list2 = new ArrayList<>(list2);
		list2.add(60);
		list2.remove(2);
		System.out.println(list2);

		
		
		List<Person> person = new ArrayList<Person>(
				Arrays.asList(new Person(), new Person(), new Person())
				);
				
		List<Person> p2 = new ArrayList<Person>();
		p2.add(new Person());
		p2.add(new Person());
		p2.add(new Person());
		
		//47 줄 부터 54줄까지의 코드는 결국은 같은 코드이다.
		// 위에 코드보다 미텡 코드로 쓰는 것이 시인성에서 우수 할 수 있다.
		//결국은 취향이다.
	}

}

class Person{}