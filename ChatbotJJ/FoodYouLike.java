import java.util.Scanner;

public class FoodYouLike extends TypeOfFoodQuestion
{
    public String getGreeting()
    {
        return "What's your favorite food? Fried Rice? Hamburger? Pizza? Spaghetti?";
    }
    
    public FoodYouLike()
    {
        String response = "";
            if (statement.length() == 0)
            {
                response = "Say something, please.";
                return response;
            }
            else if (findKeyword(statement.tolowerCase(), "no") >= 0)
            {
                response = "Why not?";
                return response;
            }
            else if(findkeyword(statement.toLowerCase(), "pizza") >=0){
                return Pizza;
            }
            else if(findkeyword(statement.toLowerCase(), "hamburger") >=0){
                return Hamburger;
            }
            else if(findkeyword(statement.toLowerCase(), "fried rice") >=0){
                return FriedRice;
            }
            else if(findkeyword(statement.toLowerCase(), "spaghetti") >=0){
               return Spaghetti;
            }
        }
    }