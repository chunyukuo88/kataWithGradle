package kataWithGradle;

import static org.junit.Assert.*;

import org.junit.Test;

public class TheOfficeITest {

	@Test
	public void canAccessPersonFields() throws Exception {
		TheOfficeI underTest = new TheOfficeI();
		Person person1 = new Person("John", 2);
		Person person2 = new Person("Mary", 5);
		Person[] people= {person1, person2};
		
		String result1	= underTest.getName(people[0]);
		int result2 	= underTest.getHappiness(people[1]);
		
		assertEquals(result1, "John");
		assertEquals(result2, 5);
	}
	
	@Test
	public void canAddUpTotalHappiness() throws Exception {
		TheOfficeI underTest = new TheOfficeI();
		Person person1 = new Person("John", 2);
		Person person2 = new Person("Mary", 5);
		Person person3 = new Person("Boris", 10);
		Person[] people= {person1, person2, person3};
		
		int totalHappiness = underTest.totalHappiness(people);
		assertEquals(totalHappiness, 17);
	}
	
	@Test
	public void canProduceEvaluationWithoutBoss() throws Exception {
		TheOfficeI underTest = new TheOfficeI();
		Person person1 = new Person("John", 3);
		Person person2 = new Person("Mary", 5);
		Person person3 = new Person("Boris", 10);
		Person[] people1 = {person1, person2, person3};
		Person[] people2 = {person1};
		
		String result1 = underTest.outedX(people1);
		String result2 = underTest.outedX(people2);
		
		assertEquals(result1, "Nice Work Champ!");
		assertEquals(result2, "Get Out Now!");
	}
	
	@Test
	public void canProduceEvaluationWithBoss() throws Exception {
		TheOfficeI underTest = new TheOfficeI();
		Person[] people1 = {
			new Person("Boris", 1),
			new Person("Yeltsin", 2),
			new Person("Beavis", 0),
			new Person("Butthead", 4)
		};
		
		Person[] people2 = {
			new Person("Batman", 1),
			new Person("Robin", 2),
			new Person("Chuck Norris", 100)
		};
		
		String result1 = underTest.outed(people1, "Boris");
		String result2 = underTest.outed(people2, "Robin");
		
		assertEquals(result1, "Get Out Now!");
		assertEquals(result2, "Nice Work Champ!");
	}
}
