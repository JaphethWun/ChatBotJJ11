import java.util.Scanner;
public class friendly extends chatbot
{
    int i = 0;
    public String getGreeting()
    {
        return "Hello";
    }
    public String getResponse(String statement)
    {
        String response = "";
        if (statement.length() == 0)
        {
            response = "Say something, please.";
        }

        else if (findKeyword(statement, "no") >= 0)
        {
            response = "Why not?";
        }
        else if (findKeyword(statement.toLowerCase(), "hi") >= 0
                || findKeyword(statement.toLowerCase(), "hello") >= 0
                || findKeyword(statement.toLowerCase(), "hey") >= 0
                || findKeyword(statement.toLowerCase(), "hola") >= 0)
            {
                System.out.println("Hi. How was your day? good, bad, or okay?");
                i++;
            }
        else if(i == 1 && (findKeyword(statement.toLowerCase(), "good") >= 0
                    || findKeyword(statement.toLowerCase(), "bad") >= 0)
                    || findKeyword(statement.toLowerCase(), "ok") >= 0
                    || findKeyword(statement.toLowerCase(), "k") >= 0
                    || findKeyword(statement.toLowerCase(), "okay") >= 0
                    || findKeyword(statement.toLowerCase(), "fine") >= 0)
            {
                    System.out.println("Oh Okay. Do you like Sprite or Coke?");
                    i++;
            }
        else if(i == 2 && (findKeyword(statement.toLowerCase(), "sprite") >= 0
                    || findKeyword(statement.toLowerCase(), "coke") >= 0))
            {
                    System.out.println("Oh cool. Lets have a drink later. Isn't the weather great? please reponse with yea or nah.");
                    i++;
            } 
        else if(i == 3 && (findKeyword(statement.toLowerCase(), "yeah") >= 0
                     || findKeyword(statement.toLowerCase(), "nah") >= 0))
            {
                System.out.println("yea, i think so too. You hungry? Please respond with yea or nah");
                i++;
            }
        
        else if(i == 4 && (findKeyword(statement.toLowerCase(), "yea") >= 0)
                    || findKeyword(statement.toLowerCase(), "nah") >= 0)
            {
                System.out.println("Ok. Lets have fun.");
                System.out.println("Lets cook some food.");
                return FoodYouLike();
            }
        else{
            return getRandomResponse;
            System.out.println("Please answer the question.");
        }
    }
    private int findKeyword(String statement, String goal, int startPos)
    {
        String phrase = statement.trim();
        int psn = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos);
        while (psn >= 0) 
        {
            String before = " ", after = " "; 
            if (psn > 0)
            {
                before = phrase.substring (psn - 1, psn).toLowerCase();
            }
            if (psn + goal.length() < phrase.length())
            {
                after = phrase.substring(psn + goal.length(), psn + goal.length() + 1).toLowerCase();
            }
            
            if (((before.compareTo ("a") < 0 ) || (before.compareTo("z") > 0))
                    && ((after.compareTo ("a") < 0 ) || (after.compareTo("z") > 0)))
            {
                return psn;
            }
            
            psn = phrase.indexOf(goal.toLowerCase(), psn + 1);
            
        }
        return -1;
   }
  
    
    private int findKeyword(String statement, String goal)
    {
        return findKeyword (statement, goal, 0);
    }
    
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 4;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";
        if (whichResponse == 0)
        {
            response = "What are you saying?.";
        }
        else if (whichResponse == 1)
        {
            response = "Hmmm.";
        }
        else if (whichResponse == 2)
        {
            response = "Please coperate";
        }
        else if (whichResponse == 3)
        {
            response = "You don't say.";
        }
        return response;
    }
}