import java.util.Scanner;
/**
 * Write a description of class chatbot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class chatbot
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class chatbot
     */
    public static void main(String[] args)
   {
        chatbot bot1 = new chatbot();
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		while (!statement.equals("Bye"))
		{
			System.out.println (bot1.getResponse(statement));
			statement = in.nextLine();
		}
	}

}
