package javalearning;

import java.util.Objects;

public class EqualsHashcode {

	public static void main(String[] args) {
		EqualsHashcode e1 = new EqualsHashcode();
		EqualsHashcode e2 = e1;
		EqualsHashcode e3 = new EqualsHashcode();
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		System.out.println(e3.equals(e2));
		
		Person p1 = new Person("Adi",1);
		Person p2 = new Person("Adi",1);
		System.out.println(p1.equals(p2));
		System.out.println(p1.hashCode() + " " + p2.hashCode());
		System.out.println(p1.hashCode() == p2.hashCode());
				

	}

}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    // Override hashCode method to generate hash codes consistent with equals
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
