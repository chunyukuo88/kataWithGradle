package kataWithGradle;

public class DistanceToGasStation {

	public boolean zeroFuel(int distanceToPump, 
							int mpg, 
							int fuelLeft) {
		
		return (mpg * fuelLeft >= distanceToPump) ? true : false;
	}

	
}
