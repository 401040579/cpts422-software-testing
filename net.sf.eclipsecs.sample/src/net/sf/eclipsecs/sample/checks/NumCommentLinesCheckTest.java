package net.sf.eclipsecs.sample.checks;

import org.junit.*;
import static org.junit.Assert.*;
import com.puppycrawl.tools.checkstyle.api.DetailAST;

/**
 * The class <code>NumCommentLinesCheckTest</code> contains tests for the class <code>{@link NumCommentLinesCheck}</code>.
 *
 * @generatedBy CodePro at 12/8/17 3:58 PM
 * @author Ran Tao
 * @version $Revision: 1.0 $
 */
public class NumCommentLinesCheckTest {
	/**
	 * Run the NumCommentLinesCheck() constructor test.
	 *
	 * @generatedBy CodePro at 12/8/17 3:58 PM
	 */
	@Test
	public void testNumCommentLinesCheck_1()
		throws Exception {
		NumCommentLinesCheck result = new NumCommentLinesCheck();
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
	

	/**
	 * Run the void finishTree(DetailAST) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/8/17 3:58 PM
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
		NumCommentLinesCheck fixture = new NumCommentLinesCheck();

		int[] result = fixture.getAcceptableTokens();

		// add additional test code here
		assertEquals(null, result);
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
		NumCommentLinesCheck fixture = new NumCommentLinesCheck();

		int[] result = fixture.getDefaultTokens();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.length);
		assertEquals(144, result[0]);
		assertEquals(145, result[1]);
	}

	/**
	 * Run the int getNumCommentLines() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/8/17 3:58 PM
	 */
	@Test
	public void testGetNumCommentLines_1()
		throws Exception {
		NumCommentLinesCheck fixture = new NumCommentLinesCheck();

		int result = fixture.getNumCommentLines();

		// add additional test code here
		assertEquals(0, result);
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
		NumCommentLinesCheck fixture = new NumCommentLinesCheck();

		int[] result = fixture.getRequiredTokens();

		// add additional test code here
		assertNotNull(result);
		assertEquals(2, result.length);
		assertEquals(144, result[0]);
		assertEquals(145, result[1]);
	}

	/**
	 * Run the boolean isCommentNodesRequired() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/8/17 3:58 PM
	 */
	@Test
	public void testIsCommentNodesRequired_1()
		throws Exception {
		NumCommentLinesCheck fixture = new NumCommentLinesCheck();

		boolean result = fixture.isCommentNodesRequired();

		// add additional test code here
		assertEquals(true, result);
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
		NumCommentLinesCheck fixture = new NumCommentLinesCheck();
		DetailAST ast = new DetailAST();

		fixture.visitToken(ast);

		// add additional test code here
	}

	/**
	 * Run the void visitToken(DetailAST) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 12/8/17 3:58 PM
	 */
	@Test
	public void testVisitToken_2()
		throws Exception {
		NumCommentLinesCheck fixture = new NumCommentLinesCheck();
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
		new org.junit.runner.JUnitCore().run(NumCommentLinesCheckTest.class);
	}
}