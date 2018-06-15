package net.sf.eclipsecs.sample.checks;

import com.puppycrawl.tools.checkstyle.api.AbstractCheck;
import com.puppycrawl.tools.checkstyle.api.DetailAST;
import com.puppycrawl.tools.checkstyle.api.TokenTypes;

public class NumCommentsCheck extends AbstractCheck {

	// Member variable to store the number of comments
    private int numComments = 0;
    
    // Member variable to store max number of comments.
    private int maxNumComments = 50;
    
    
    
    // Public property for private backing field 'numComments.'
    public int getNumComments()
    {
    		return numComments;
    }

    // Retrieve the default tokens used by the AST
    @Override
    public int[] getDefaultTokens() {
        return new int[] { TokenTypes.SINGLE_LINE_COMMENT, TokenTypes.BLOCK_COMMENT_BEGIN };
    }
    
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
        numComments++;
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
    		
    		// If numComments is more than our configured max
    		if(numComments < maxNumComments)
    		{
    			message = "You have " + numComments + " total comments.";
    		}
    		else
    		{
    			message = "You have " + numComments + " total comments. You need to "
    					+ "chill with all the comments, man";
    		}
    		
    		log(ast.getLineNo(), message);
    		
    		// Reset our counter for the next time this check is processed.
    		numComments = 0;
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
