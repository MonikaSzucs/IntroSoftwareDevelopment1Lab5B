

/**
 * Write a description of class Math here.
 *
 * @author Monika Szucs
 * @version October 15th 2018
 */
public class Math
{
    // instance variables
    private int     x;
    private int     y;
    
    //static instance variable
    private static String  operation = "%";

    /**
     * Constructor for objects of class Math
     * 
     * @param x takes the value entered by the user for x
     * @param y takes the valye entered by the user for y
     */
    public Math(int x, int y)
    {
        // initialise instance variables
        this.x = x;
        this.y = y;
    }

    /**
     * method
     *
     * @param   x   a parameter for the method
     * @param   y   a parameter for the method
     * @return x/y or 0 as long as y is not zero then a number will return
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
    
    /**
     * method
     *
     * @param   x   a parameter for the method
     * @param   y   a parameter for the method
     * @return  x or y if x is greater then y then return x else return y
     */
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
    
    /**
     * method
     *
     * @param   x   a parameter for the method
     * @param   y   a parameter for the method
     * @return  0 or remainder if yis zero then a print error and 0, else if remainder is greater then zero then return remainder, else return 0
     */
    public int remainder(int x, int y)
    {
        // put your code here
        
        if(y==0){
            System.out.print("ERROR y cannot be 0");
            return 0;
        }
        else {
            int remainder = x%y;
            return remainder;
        }
    }
    
    /**
     * method
     *
     * @param   x   a parameter for the method
     * @return  x multiplied by three
     */
    public int triple(int x)
    {
        // put your code here
        return x*3;
    }

    /**
     * method
     *
     * @param   operation a paramter for a method
     * @return  boolean either true or false checking to see if the operation selections have been matched in a switch statement
     */
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
