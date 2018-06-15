package ConditionEdgeCoverage;

public class NumCastsfinishTreeCoverage3 {
	
	// Java code that contains more than 10 casts.
	// Expected output: "You have 15 total casts. Consider removing some."

	public void foo() {
		Object o = new Object();
		
		o = (Object) o;
		o = (Object) o;
		o = (Object) o;
		o = (Object) o;
		o = (Object) o;
		
		o = (Object) o;
		o = (Object) o;
		o = (Object) o;
		o = (Object) o;
		o = (Object) o;
		
		o = (Object) o;
		o = (Object) o;
		o = (Object) o;
		o = (Object) o;
		o = (Object) o;
	}
}
