package kataWithGradle;

public class TheOfficeI {

	public String getName(Person person) {
		return person.name ;
	}

	public int getHappiness(Person person) {
		return person.happiness;
	}

	public int totalHappiness(Person[] people) {
		int result = 0;
		for (int i = 0; i < people.length; i++) {
			result += people[i].happiness;
		}
		return result;
	}

	public String outedX(Person[] people) {
		int happinessNumerator = 0;
		for (int i = 0; i < people.length; i++) {
			happinessNumerator += people[i].happiness;
		}
		int score = happinessNumerator / (people.length);
		if (score <= 5) {
			return "Get Out Now!";
		} else
		return "Nice Work Champ!";
	}

	
	
	public String outed(Person[] meet, String boss) {
		int happinessNumerator = 0;
		for (int i = 0; i < meet.length; i++) {
			happinessNumerator += meet[i].happiness;
			if (meet[i].name == boss) {
				happinessNumerator -= (meet[i].happiness);
				happinessNumerator += (meet[i].happiness*2);
			}
		}
		
		int score = happinessNumerator / (meet.length);
		if (score <= 5) {
			return "Get Out Now!";
		} else
		return "Nice Work Champ!";
	}
}
