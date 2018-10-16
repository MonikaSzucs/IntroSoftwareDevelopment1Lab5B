
/**
 * Write a description of class Math here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Math
{
    // instance variables - replace the example below with your own
    private int     x;
    private int     y;
    private static String  operation = "%";

    /**
     * Constructor for objects of class Math
     */
    public Math(int x, int y)
    {
        // initialise instance variables
        this.x = x;
        this.y = y;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int divide(int x, int y)
    {
        // put your code here
        if(y==0){
            System.out.println("Error");
            return 0;
        }
        else{
            return x/y;
        }
    }

    public int max(int x, int y)
    {
        // put your code here
        if(x>y){
            return x;
        }
        else{
            return y;
        }
    }

    public int remainder(int x, int y)
    {
        // put your code here
        int num = x/y;
        int remainder = x%y;

        if(y==0){
            System.out.print("y cannot be 0");
            return 0;
        }
        if(remainder>0){
            System.out.println("Remainder: " + remainder);
            return remainder;
        }
        else{
            System.out.println("Other:" + 0);
            return 0;
        }
    }

    public int triple(int x)
    {
        // put your code here
        System.out.println(x*3);
        return x*3;
    }

    public boolean isValidOperation(String operation){
        switch(operation){
            case "*":
            case "/":
            case "%":
            case "+":
            case "-":
            System.out.println(true);
            return true;
            default:
            System.out.println(false);
            return false;
        }
        
    }
    
}
