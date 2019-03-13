
/**
 * A guess the password program.
 *
 * @author Bianca
 * @version 11/20/2018
 */
public class Reverse
{
    public static final String SECRET_PASSWORD = "tyjo";
    public static void main(String [] args) {
        if (args.length != 1) 
        {
            System.out.println("Wrong! You have to run this program with one argument:\njava Reverse <argument>"); 
            return;
        }
        
        if (args[0].equals(SECRET_PASSWORD))
        {
            System.out.println("You win! Congratulations!");
        }
        else 
        {
            System.out.println("Wrong password! Try again!");
        }
    }
}
