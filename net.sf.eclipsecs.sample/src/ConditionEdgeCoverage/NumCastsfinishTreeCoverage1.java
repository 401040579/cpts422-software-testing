package ConditionEdgeCoverage;

public class NumCastsfinishTreeCoverage1 {
	
	// Java code that contains less than 10 casts.
	// Expected output: "You have 5 total casts. Good job."

	public void foo() {
		Object o = new Object();
		
		o = (Object) o;
		o = (Object) o;
		o = (Object) o;
		o = (Object) o;
		o = (Object) o;
	}
}
