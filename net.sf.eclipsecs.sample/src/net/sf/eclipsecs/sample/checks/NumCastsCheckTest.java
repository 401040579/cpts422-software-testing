package net.sf.eclipsecs.sample.checks;

import org.junit.*;
import static org.junit.Assert.*;
import com.puppycrawl.tools.checkstyle.api.DetailAST;

/**
 * The class <code>NumCastsCheckTest</code> contains tests for the class <code>{@link NumCastsCheck}</code>.
 *
 * @generatedBy CodePro at 12/8/17 3:58 PM
 * @author Ran Tao
 * @version $Revision: 1.0 $
 */
public class NumCastsCheckTest {
	/**
	 * Run the NumCastsCheck() constructor test.
	 *
	 * @generatedBy CodePro at 12/8/17 3:58 PM
	 */
	@Test
	public void testNumCastsCheck_1()
		throws Exception {
		NumCastsCheck result = new NumCastsCheck();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void finishTree(DetailAST) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/8/17 3:58 PM
	 */
	
	/*
	@Test
	public void testFinishTree_1()
		throws Exception {
		NumCastsCheck fixture = new NumCastsCheck();
		fixture.visitToken(new DetailAST());
		DetailAST ast = new DetailAST();

		fixture.finishTree(ast);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.puppycrawl.tools.checkstyle.api.AbstractViolationReporter.getCustomMessages(AbstractViolationReporter.java:91)
		//       at com.puppycrawl.tools.checkstyle.api.AbstractCheck.log(AbstractCheck.java:246)
		//       at net.sf.eclipsecs.sample.checks.NumCastsCheck.finishTree(NumCastsCheck.java:52)
	}

	*/
	
	/**
	 * Run the void finishTree(DetailAST) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/8/17 3:58 PM
	 */
	
	/*
	@Test
	public void testFinishTree_2()
		throws Exception {
		NumCastsCheck fixture = new NumCastsCheck();
		fixture.visitToken(new DetailAST());
		fixture.visitToken(new DetailAST());
		fixture.visitToken(new DetailAST());
		fixture.visitToken(new DetailAST());
		fixture.visitToken(new DetailAST());
		fixture.visitToken(new DetailAST());
		fixture.visitToken(new DetailAST());
		fixture.visitToken(new DetailAST());
		fixture.visitToken(new DetailAST());
		fixture.visitToken(new DetailAST());
		fixture.visitToken(new DetailAST());
		DetailAST ast = new DetailAST();

		fixture.finishTree(ast);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.puppycrawl.tools.checkstyle.api.AbstractViolationReporter.getCustomMessages(AbstractViolationReporter.java:91)
		//       at com.puppycrawl.tools.checkstyle.api.AbstractCheck.log(AbstractCheck.java:246)
		//       at net.sf.eclipsecs.sample.checks.NumCastsCheck.finishTree(NumCastsCheck.java:52)
	}

	*/
	
	/**
	 * Run the int[] getAcceptableTokens() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/8/17 3:58 PM
	 */
	@Test
	public void testGetAcceptableTokens_1()
		throws Exception {
		NumCastsCheck fixture = new NumCastsCheck();
		fixture.visitToken(new DetailAST());

		int[] result = fixture.getAcceptableTokens();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.length);
		assertEquals(23, result[0]);
	}

	/**
	 * Run the int[] getDefaultTokens() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/8/17 3:58 PM
	 */
	@Test
	public void testGetDefaultTokens_1()
		throws Exception {
		NumCastsCheck fixture = new NumCastsCheck();
		fixture.visitToken(new DetailAST());

		int[] result = fixture.getDefaultTokens();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.length);
		assertEquals(23, result[0]);
	}

	/**
	 * Run the int[] getRequiredTokens() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/8/17 3:58 PM
	 */
	@Test
	public void testGetRequiredTokens_1()
		throws Exception {
		NumCastsCheck fixture = new NumCastsCheck();
		fixture.visitToken(new DetailAST());

		int[] result = fixture.getRequiredTokens();

		// add additional test code here
		assertNotNull(result);
		assertEquals(1, result.length);
		assertEquals(23, result[0]);
	}

	/**
	 * Run the void visitToken(DetailAST) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/8/17 3:58 PM
	 */
	@Test
	public void testVisitToken_1()
		throws Exception {
		NumCastsCheck fixture = new NumCastsCheck();
		fixture.visitToken(new DetailAST());
		DetailAST ast = new DetailAST();

		fixture.visitToken(ast);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 12/8/17 3:58 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 12/8/17 3:58 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 12/8/17 3:58 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(NumCastsCheckTest.class);
	}
}