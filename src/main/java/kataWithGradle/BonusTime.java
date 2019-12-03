// From Codewars
// https://www.codewars.com/kata/do-i-get-a-bonus/train/java

package kataWithGradle;

public class BonusTime {

	public String calculateSalary(int salary, boolean bonus) {
		if (bonus == true) {
			return "£"+(salary * 10);
		} else
		return "£"+salary;
	}

}
