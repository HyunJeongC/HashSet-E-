package git;

import java.util.Set;
import java.util.HashSet;

public class HashSetIntro {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		Set<Person> set = new HashSet<>();
		set.add(new Person("ȫ�浿", 20)); //add�޼ҵ�� �����͸� �߰��ϴµ� person�����ڷ� �߰�
		set.add(new Person("�̼���", 35)); //�̸��� ���� �Ѵ� ���� �����ʹ� ����� �� �� �ϳ��� �ٸ��� �ٸ� �ν��Ͻ��� �ν��Ѵ�
		set.add(new Person("ȫ�浿", 26));
		set.add(new Person("����", 35));
		set.add(new Person("������", 29));
		set.add(new Person("�̼���", 35));
		System.out.println("�ν��Ͻ� ��: " + set.size());
		
		for(Person p : set) //for-each��
			System.out.print(p.toString() + '\t');
		System.out.println();
	}

}
