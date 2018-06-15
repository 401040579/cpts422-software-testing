package net.sf.eclipsecs.sample.checks;

import com.puppycrawl.tools.checkstyle.api.AbstractCheck;
import com.puppycrawl.tools.checkstyle.api.DetailAST;
import com.puppycrawl.tools.checkstyle.api.TokenTypes;

public class NumCommentLinesCheck extends AbstractCheck {

	// Member variable to store the number of comments
    private int numCommentLines = 0;
    
    // Member vaiable to store max number of comment lines.
    private final int maxCommentLines = 50;
    
    // Gets the current number of comment lines.
    public int getNumCommentLines()
    {
    		return numCommentLines;
    }

    // Retrieve the default tokens used by the AST
    @Override
    public int[] getDefaultTokens() {
        return new int[] { TokenTypes.SINGLE_LINE_COMMENT, TokenTypes.BLOCK_COMMENT_BEGIN };
    }
    
    /*
     * 
     * (non-Javadoc)
     * @see com.puppycrawl.tools.checkstyle.api.AbstractCheck#isCommentNodesRequired()
     */
    
    // Overridden method to tell checkstyle to track the comment tokens.
    @Override
    public boolean isCommentNodesRequired()
    {
    		return true;
    }

    // Visits the given token specified in the getDefaultTokens method.
    // This method is entered for every token found.
    @Override
    public void visitToken(DetailAST ast) 
    {
    		DetailAST blockEnd = ast.findFirstToken(TokenTypes.BLOCK_COMMENT_END);
    		if(blockEnd != null)
    		{
    			// Numlines = line no of end - line no of start + 1.
    			numCommentLines += (blockEnd.getLineNo() - ast.getLineNo() + 1);
    		}
    		else
    		{
    			// We are not in a block comment so increment by 1.
    			numCommentLines++;
    		}
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
    		String message;
    		if(numCommentLines < maxCommentLines)
    		{
    			message = "You have " + numCommentLines + " total comment lines. Looking good!";
    		}
    		else
    		{
    			message = "You have " + numCommentLines + ". You might want to tone it down a bit with the comments";
    		}
    		log(ast.getLineNo(), message);
    		
    		// Reset our counter for the next time this check is processed.
    		numCommentLines = 0;
    }

    /*
     * (non-Javadoc)
     * @see com.puppycrawl.tools.checkstyle.api.AbstractCheck#getAcceptableTokens()
     */
	@Override
	public int[] getAcceptableTokens() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.puppycrawl.tools.checkstyle.api.AbstractCheck#getRequiredTokens()
	 */
	@Override
	public int[] getRequiredTokens() {
		// TODO Auto-generated method stub
		return new int[] { TokenTypes.SINGLE_LINE_COMMENT, TokenTypes.BLOCK_COMMENT_BEGIN };
	}
    
  
}
