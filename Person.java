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
		return name + "(" + age + "��)"; //��� ���ļ���
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, age); //�ڹٿ��� ������ hash�� �̿��� �������̵�
	}
	
	@Override
	public boolean equals(Object obj) {
		//String name = ((Person)obj).name; //���ذ��� �ٸ����� ���Ѵ�
		//int age = ((Person)obj).age;
		
		if(name == ((Person)obj).name && age == ((Person)obj).age) //name.equals(name)
			return true;
		else
			return false;
		
	}
}
