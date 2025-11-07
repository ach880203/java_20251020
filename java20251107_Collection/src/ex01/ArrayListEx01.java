package ex01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListEx01 {

	public static void main(String[] args) {

		
		ArrayList<Integer> list = new ArrayList<Integer>();
	
	    list.add(50); // new Integer(5)이렇게 적어야 하는데 자바에서  5 이렇게만 적어도 자동으로 new Integer(5)이렇게 입력하는 거다. 이걸 wapper 웹퍼라 부른다.
	    list.add(new Integer(40));
	    list.add(20);
	    list.add(new Integer(0));
	    list.add(1);
	    list.add(new Integer(30));
	
	    System.out.println(list);
	    System.out.println(list.subList(1, 4));
		
		
	   ArrayList<Integer> list2 = new ArrayList<Integer>(list.subList(1, 4));
	   System.out.println(list2);
		
	   Collections.sort(list);
	   System.out.println(list);
		
		
	   System.out.println(list.get(3));
	   
	   int num = list.get(2);
		
		
		ArrayList<String> list3 = new ArrayList<String>();
		        list3.add("kor");
				list3.add("eng");
				list3.add("math");
		System.out.println(list3);
		
		/*
		ArrayList<> ls = new ArrayList<>();
		ls add("마마");
		ls add (34);
		//이경우 제한을 두지 않아서 자동으로 Object로 설정이 되고, Object가 됨으로 정수, 문자열 어떤것도 들어올 수 있다.
		*/
		
	
	}

}
