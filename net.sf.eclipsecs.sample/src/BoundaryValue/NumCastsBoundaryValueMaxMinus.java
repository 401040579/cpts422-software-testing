package BoundaryValue;

public class NumCastsBoundaryValueMaxMinus {
	// Max- value of 9 total casts
	
		private void testMethod1() {
			double newDouble = 12;
			newDouble = (int)newDouble;
			newDouble = (double)newDouble;
			
			testMethod2((int)newDouble);
		}
		
		private void testMethod2(int newInt) {
			
			char newChar = (char)newInt;
			char anotherChar = (char)newInt;
			char thirdChar = (char)newInt;
			double anotherDouble = (double)newInt;
			double anotherDouble2 = (double)newInt;
			double anotherDouble3 = (double)newInt;
		}
}
