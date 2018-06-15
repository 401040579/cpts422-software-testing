package EquivalenceClasses;

// 5 Casts, of reference type
// Expected result: You have 5 casts. Good job.
public class NumCastsWECT1 {
	public void foo() {
	    Object o = new Object();
		
		o = (Object) o;
		o = (Object) o;
		o = (Object) o;
		o = (Object) o;
		o = (Object) o;
	}
}
