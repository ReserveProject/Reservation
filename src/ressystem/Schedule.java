/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ressystem;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author phisan
 */
public class Schedule {
    private Date date;
    private Time time;    
    private Movie movie;
    public Schedule (Date initDate,Time initTime, Movie m)
    {
        date = initDate;
        time = initTime;
        movie = m;
    }
  
    public String toString ()
    {
        return date + "\n" + movie + " " + time;
    }
}
