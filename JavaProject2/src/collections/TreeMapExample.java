package collections;

import java.util.Map.Entry;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

class Person implements Comparable<Person> {	// Comparable 인터페이스로 비교 선언 후 compareTo로 비교 기준 정의
	String name;

	Person(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Person o) {
		return this.name.compareTo(o.name);
	}
}

public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<Person, Integer> tMap = new TreeMap<Person, Integer>();
		tMap.put(new Person("Hong"), 80);
		tMap.put(new Person("Hwang"), 85);
		tMap.put(new Person("Park"), 90);
		
		NavigableSet<Person> nSet = tMap.descendingKeySet();	// key값만 set 컬렉션으로 뽑아냄
		for(Person person : nSet) {
			System.out.println(person.name);
		}
		System.out.println("--------------------");
		Set<Entry<Person, Integer>> eSet = tMap.entrySet();
//		for(Person person : eSet) {
//			System.out.println(person.);
		}
	}


