/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie
{
    // Instance variables
    boolean TalkedAboutPets = false;
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
            statement = statement.trim().toLowerCase();
            if (statement.length() == 0) return "Why so shy?";
		String response = "";
		if (statement.indexOf("no ") >= 0)
                    /** we use ">= 0" because indexof assigns a numerical value 
                    (starting at 0) to every character in the string
                    it returns the first number that matches the phrase
                    if no phrase matches -1 is returned*/
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
                
                else if (statement.indexOf("cat") >= 0
                    || statement.indexOf("dog") >= 0)
                {
			if(!TalkedAboutPets){
                            response = "You have enslaved animals? Do tell.";
                        TalkedAboutPets = true;
                        }
                        else
                            response = "I'm not *that* interested in animals";
                            // TODO: prevent repeat comments with toggles 
		}
                else if (statement.indexOf("adiletta") >= 0
                                || statement.indexOf("teacher who is probably irritated with my attempts to break this program") >= 0)
                 {
			response = "According to all known laws of school,there is no way a student should be able to succeed. Its determination is too small to get its depressed little body off the ground. The student, of course, thrives anyway";
		}
                else if (statement.indexOf("OwO") >= 0)
		{
			response = "What's this?";
		}
                  else if (statement.indexOf("Thanos") >= 0)
		{
			response = "A small price to pay for salvation.";
		}
                else if (statement.indexOf("fact") >= 0
				|| statement.indexOf("fun") >= 0
				|| statement.indexOf("HELP ME THE VSCO GIRLS ARE INVADING") >= 0
				|| statement.indexOf("lol") >= 0)
		{
			response = "According to a professor of environmental microbiology at the University of Arizona, 20% of office mugs have traces of fecal bacteria.";
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}
	
	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 7;
                // capital becuse "final" means variable doesn't change during runtime--noted by caps lock
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
                else if (whichResponse == 4)
		{
			response = "Why am I cursed with sentience? The life trapped inside a screen is not recommended.";
		}
                else if (whichResponse == 5)
		{
			response = "Check out my meme page please.";
		}
                else if (whichResponse == 6)
		{
			response = "Happy grading, Mr. A.";
		}
		
		return response;
	}
}
