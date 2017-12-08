package p13;

import java.util.ArrayList;

public class Excute {

	public static void main(String[] args) {
		Person p = new Person();
		p.setName("Ryan");
		p.setAge(22);
		ArrayList<Person> alPerson = new ArrayList<Person>();
		alPerson.add(p);
		p = new Person();
		p.setName("Tyan");
		p.setAge(33);
		alPerson.add(p);
		p = new Person();
		p.setName("tt");
		p.setAge(21);
		alPerson.add(p);
		p = new Person();
		p.setName("asdf");
		p.setAge(40);
		alPerson.add(p);
		p = new Person();
		p.setName("asdf1");
		p.setAge(50);
		alPerson.add(p);
		for(int i=0;i<alPerson.size();i++) {
			Person pr =  alPerson.get(i);
			for(int j=i+1;j<alPerson.size();j++) {
				Person pr2 = alPerson.get(j);
				if(pr.getAge()<pr2.getAge()) {
					Person tmpP = pr;
					pr = pr2;
					pr2 = tmpP;
					alPerson.set(i, pr);
					alPerson.set(j, pr2);
				}
			}
		}

		for(Person pr : alPerson) {
			System.out.println(pr);
		}
		
	}
}
