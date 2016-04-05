
/**
 * This class contains the main method which allows the project to be run outside of bluej
 * 
 * @author Dennis Vrieling
 * @version 0.1
 */
public class CarparkMain
{
    /**
     * The starting point for the car park simulation
     * @param arg Program Arguments
     */    
    public static void main(String[] args)
    {
        Simulator simulator = new Simulator();
        simulator.run();
    }    
}
