package BoundaryValue;

public class NumCastsBoundaryValueNom {
	// Nominal value of 5 total casts
	
	private void testMethod1() {
		double newDouble = 12;
		newDouble = (int)newDouble;
		newDouble = (double)newDouble;
		
		testMethod2((int)newDouble);
	}
	
	private void testMethod2(int newInt) {
		
		char newChar = (char)newInt;
		
		double anotherDouble = (double)newInt;
		
		
	}
}
