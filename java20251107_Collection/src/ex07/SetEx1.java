package ex07;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Set;

public class SetEx1 {

	public static void main(String[] args) {

		
		Set set = new HashSet<>();
		
		set.add("kor");
		set.add("eng");
		set.add("eng");
		set.add("math");
		set.add("1");
		set.add("1");
		set.add("1");
		set.add(new Person("홍길동"));
		set.add(new Person("박길동"));
		set.add(new Person("홍길동"));
		
		
		System.out.println(set);

		for(Object obj : set)
			System.out.println(obj);
		System.out.println("--------------------------");
		
		Iterator<Person> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}



class Person{
	String name;
	public Person(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
}



/*
 * class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    // ✅ 중복 제거 핵심 메서드
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Person)) return false;
        Person p = (Person) obj;
        return this.name.equals(p.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
*/ //이렇게 쓰면 중복이 안됨.