package ex02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayListEx01 {

	public static void main(String[] args) {

		
		List<Integer> list = new LinkedList<Integer>(); //List가 가장 상위 이기에 앞에 List를 사용하면 뒤에 ArrayList, LinkedList 모두 사용 할 수 있다.
	
	    list.add(50); // new Integer(5)이렇게 적어야 하는데 자바에서  5 이렇게만 적어도 자동으로 new Integer(5)이렇게 입력하는 거다. 이걸 wapper 웹퍼라 부른다.
	    list.add(new Integer(40));
	    list.add(20);
	    list.add(new Integer(0));
	    list.add(1);
	    list.add(new Integer(30));
	
	    System.out.println(list);
	    System.out.println(list.subList(1, 4));
		
		
	    List<Integer> list2 = new ArrayList<Integer>(list.subList(1, 4));
	   System.out.println(list2);
		
	   Collections.sort(list);
	   System.out.println(list);
		
		
	   System.out.println(list.get(3));//단 건 조회
	   
	   System.out.println(list);//전체 조회
	   list.remove(2); //리스트에서 단건 삭제
	   System.out.println(list);
	   
	   int num = list.get(2);
		
		
	   LinkedList<String> list3 = new LinkedList<String>();
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
