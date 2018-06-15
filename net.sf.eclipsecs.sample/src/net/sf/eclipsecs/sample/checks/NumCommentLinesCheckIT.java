// Copyright ACW-422 2017

package net.sf.eclipsecs.sample.checks;
import net.sf.eclipsecs.sample.checks.NumCommentLinesCheck;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import com.puppycrawl.tools.checkstyle.api.DetailAST;
import com.puppycrawl.tools.checkstyle.api.TokenTypes;

/*
 * Tests the NumCommentLinesCheck checkstyle class
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(DetailAST.class)
public class NumCommentLinesCheckIT {
	
	private NumCommentLinesCheck ut;
	
	public NumCommentLinesCheckIT()
	{
	}

	// Before every test, create a NumCommentLinesCheck class
	@Before
    public void setup()
    {
		// Create a new instance of the NumCommentLinesCheck class.
		ut = new NumCommentLinesCheck();
    }

    @After
    public void cleanup()
    {
        ut = null;
    }
    
    /*
     * Tests the visitToken functionality 
     * 
     * Ensures methods are invoked according to logical flow
     * of NumCommentLinesCheck.visitToken method
     */
    @Test
    public void visitToken_Test() {
    	
    		ut = new NumCommentLinesCheck();
    		
    		assertEquals(0, ut.getNumCommentLines());
    		
    		// TEST 1 - test first code path of visitToken, 
    		//   i.e. findFirstToken non-null
    		
    		// Create a stub of a comment_end and comment_begin ast.
    		DetailAST ast = PowerMockito.mock(DetailAST.class);
    		DetailAST blockEnd = PowerMockito.mock(DetailAST.class);
    		
    		// stub the original AST
    		when(ast.findFirstToken(TokenTypes.BLOCK_COMMENT_END)).thenReturn(blockEnd);
    		when(ast.getLineNo()).thenReturn(0);
    		when(blockEnd.getLineNo()).thenReturn(0);
    		
    		ut.visitToken(ast);
    		
    		// Ensure the first token method was called
    		verify(ast).findFirstToken(TokenTypes.BLOCK_COMMENT_END);
    		
    		// Test that the GetLineNo was called
    		verify(blockEnd).getLineNo();
    		
    		// TEST 2 - when findFirstToken returns null
    		ut = new NumCommentLinesCheck();
    		assertEquals(0, ut.getNumCommentLines());
    		
    		// Setup ast
    		blockEnd = PowerMockito.mock(DetailAST.class);
    		
    		when(ast.findFirstToken(TokenTypes.BLOCK_COMMENT_END)).thenReturn(blockEnd);
    		when(ast.findFirstToken(TokenTypes.BLOCK_COMMENT_END)).thenReturn(null);
    		
    		// Test that the GetLineNo was called
    		verify(blockEnd, never()).getLineNo();
    		
    		ut.visitToken(ast);
    		
    		// Ensure numlines was incremented
    		assertEquals(1, ut.getNumCommentLines());
    }
    
    /*
     * Tests the finish tree functionality of num comment lines
     * 
     * Ensures methods are invoked correctly and logged
     * 
     * Method is ignored because AbstractCheck.log(...) cannot
     * be invoked, and will throw an exception.
     */
    @Test
    @Ignore
    public void finishTree_Test() {
    	
    		// arrange
    		ut = new NumCommentLinesCheck();
    		
    		// Sanity check -- not part of test
    		assertEquals(0, ut.getNumCommentLines());
    		
    		// Create a stub of a comment_end and comment_begin ast.
    		DetailAST ast = PowerMockito.mock(DetailAST.class);
    		when(ast.getLineNo()).thenReturn(0);
    		
    		// act
    		ut.finishTree(ast);
    		
    		// assert
    		verify(ut).log(0, "You have 0 total comment lines. Looking good!");
    		verify(ast).getLineNo();
    }
}