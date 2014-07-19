/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author asus
 */
public class Person {

    private String name;
    private String age;

    Person() {
    }

    Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return Integer.parseInt(age);
    }

    public List<Person> buildPeople() {
        List<Person> people = new ArrayList<>();

        Person p1 = new Person("yasemin", "80");
        Person p2 = new Person("mehmet", "40");
        Person p3 = new Person("feriha", "15");

        people.add(p1);
        people.add(p2);
        people.add(p3);

        return people;
    }

    public List<Person> sortByAge() {
        List<Person> people = new ArrayList<>();
        people = buildPeople();

        Collections.sort(people, new AgeComparator());

        return people;
    }

    public class AgeComparator implements Comparator<Person> {

        public int compare(Person o1, Person o2) {
            return o1.getAge().compareTo(o2.getAge());
        }
    }

}
