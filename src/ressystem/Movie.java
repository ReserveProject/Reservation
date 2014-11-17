/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ressystem;


public class Movie {
    private String mName;
    private int mTime;
    
    public Movie (String mmName,int mmTime)
    {
        mName = mmName;
        mTime = mmTime;
    }
    public String toString ()
    {
        return mName + " (" + mTime + " min)";
    }
}
