/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ressystem;

public class Seat {
    
    //private int sType; // VIP & Normal
    private int sPosition[][] = new int[5][10];

    public Seat()
    {
        //sType = 0;
        for (int i = 0 ; i < sPosition.length; i++)
        {
            for (int j = 0 ; j < sPosition[i].length; j++)
            {
                sPosition[i][j] = 0;
            }
        }
    }
    public void reserveSeat(int sRow, int sColumn)
    {
        if (sPosition[sRow-1][sColumn-1] == 0)
            sPosition[sRow-1][sColumn-1] = 1;
        else
            System.out.println("This seat is reserved.");
    }
    public String toString ()
    {
        String stringReturn = "";
        for (int i = 0 ; i < sPosition.length; i++)
        {
            for (int j = 0 ; j < sPosition[i].length; j++)
            {
                if (sPosition[i][j] == 0)
                    stringReturn = stringReturn.concat("- ");
                else
                    stringReturn = stringReturn.concat("+ ");;
            }
            stringReturn = stringReturn.concat("\n");
        }
        return stringReturn;
    }
}
