// From Codewars
// The kata was called "Dubstep"

package kataWithGradle;

import java.util.ArrayList;
import java.util.Arrays;

public class DubStep {

	public String[] splitInput(String song) {
		String[] splitInput = song.split("WUB");
		return splitInput;
	}

	public String decodeString(String song) {
		String[] splitInput = song.split("WUB");
		String almostOutput = "";
		for (int i = 0; i < splitInput.length; i++) {
			if (splitInput[i] != "WUB") {
				almostOutput += (splitInput[i] + " ");
			}
		}
		almostOutput = almostOutput.replace("    ", " ");
		almostOutput = almostOutput.replace("   ", " ");
		almostOutput = almostOutput.replace("  ", " ");
		almostOutput = almostOutput.replace("  ", " ");
		String output = almostOutput.trim();
		System.out.println(output);
		return output;
	}

}
