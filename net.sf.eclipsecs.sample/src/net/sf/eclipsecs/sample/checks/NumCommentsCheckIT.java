// Copyright ACW-422 2017

package net.sf.eclipsecs.sample.checks;

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

/*
 * Tests the NumCommentsCheck checkstyle class
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(DetailAST.class)
public class NumCommentsCheckIT {
	
	private NumCommentsCheck ut;
	
	public NumCommentsCheckIT()
	{
	}

	// Before every test, create an instance of the NumCommentsCheck
	@Before
    public void setup()
    {
		// Create a new instance of the NumCommentsCheck class.
		ut = new NumCommentsCheck();
    }

    @After
    public void cleanup()
    {
        ut = null;
    }
    
    /*
     * Tests the finish tree functionality of num comments
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
    		ut = new NumCommentsCheck();
    		
    		// Sanity check -- not part of test
    		assertEquals(0, ut.getNumComments());
    		
    		// Create a stub of a comment_end and comment_begin ast.
    		DetailAST ast = PowerMockito.mock(DetailAST.class);
    		when(ast.getLineNo()).thenReturn(0);
    		
    		// act
    		ut.finishTree(ast);
    		
    		// assert
    		verify(ut).log(0, "You have 0 total comments.");
    		verify(ast).getLineNo();
    }
}