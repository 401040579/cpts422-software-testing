// Copyright ACW 2017 - CptS 422

package net.sf.eclipsecs.sample.checks;

import com.puppycrawl.tools.checkstyle.api.AbstractCheck;
import com.puppycrawl.tools.checkstyle.api.DetailAST;
import com.puppycrawl.tools.checkstyle.api.TokenTypes;

/* 

Counts the number of casts in the file.
Logs the number of casts at the end of execution.
If number is over max (10), displays alternate message.

*/
public class NumCastsCheck extends AbstractCheck {

    // Member variable to store the number of casts
    private int numCasts = 0;

    // Retrieve the default tokens used by the AST
    @Override
    public int[] getDefaultTokens() {
        return new int[] { TokenTypes.TYPECAST };
    }

    // Visits the given token specified in the getDefaultTokens method.
    // This method is entered for every token found.
    @Override
    public void visitToken(DetailAST ast)
    {
        numCasts ++;
    }

    // Overridden method that is called when the tree is finished being processed.
    /*
     * (non-Javadoc)
     * @see com.puppycrawl.tools.checkstyle.api.AbstractCheck#finishTree(com.puppycrawl.tools.checkstyle.api.DetailAST)
     */
    @Override
    public void finishTree(DetailAST ast)
    {
        // Log the number of comments.
        String message = "You have " + numCasts + " total type casts.";
		
		if (numCasts > 10) {
			message += " Consider removing some.";
		} else {
			message += " Good job.";
		}
		
        log(ast.getLineNo(), message);

        // Reset our counter for the next time this check is processed.
        numCasts = 0;
    }

    /*
     * (non-Javadoc)
     * @see com.puppycrawl.tools.checkstyle.api.AbstractCheck#getAcceptableTokens()
     */
    @Override
    public int[] getAcceptableTokens() {
        return new int[] { TokenTypes.TYPECAST };
    }

    /*
     * (non-Javadoc)
     * @see com.puppycrawl.tools.checkstyle.api.AbstractCheck#getRequiredTokens()
     */
    @Override
    public int[] getRequiredTokens() {
        return new int[] { TokenTypes.TYPECAST };
    }
}