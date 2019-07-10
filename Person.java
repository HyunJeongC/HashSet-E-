package git;

import java.util.Objects;

public class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return name + "(" + age + "세)"; //출력 형식설정
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, age); //자바에서 제공한 hash를 이용한 오버라이딩
	}
	
	@Override
	public boolean equals(Object obj) {
		//String name = ((Person)obj).name; //기준값과 다른값을 비교한다
		//int age = ((Person)obj).age;
		
		if(name == ((Person)obj).name && age == ((Person)obj).age) //name.equals(name)
			return true;
		else
			return false;
		
	}
}
