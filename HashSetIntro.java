package git;

import java.util.Set;
import java.util.HashSet;

public class HashSetIntro {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Set<Person> set = new HashSet<>();
		set.add(new Person("홍길동", 20)); //add메소드로 데이터를 추가하는데 person생성자로 추가
		set.add(new Person("이순신", 35)); //이름과 나이 둘다 같은 데이터는 지우고 둘 중 하나라도 다르면 다른 인스턴스로 인식한다
		set.add(new Person("홍길동", 26));
		set.add(new Person("권율", 35));
		set.add(new Person("강감찬", 29));
		set.add(new Person("이순신", 35));
		System.out.println("인스턴스 수: " + set.size());
		
		for(Person p : set) //for-each문
			System.out.print(p.toString() + '\t');
		System.out.println();
	}

}
