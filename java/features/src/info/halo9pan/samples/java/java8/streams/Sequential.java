package info.halo9pan.samples.java.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import info.halo9pan.samples.java.java8.Person;

public class Sequential {

	public static void main(String[] args) {
		List<Person> persons = Person.asList(new Person("Joe"), new Person("Jim"), new Person("John"));
		List<Person> list = persons.stream().collect(Collectors.toList());
		System.out.println(Arrays.toString(list.toArray()));
		List<Person> filterList = persons.stream().filter(p -> p.name == "Jim").collect(Collectors.toList());
		System.out.println(Arrays.toString(filterList.toArray()));
	}

}