/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ressystem;

public class Theatre {
    public Theatre(String name,int id){
        this.name = name;this.id = id;
    }
    private String name;
    private int id;
    private ArrayList<Seat> seatList;
    private ArrayList<Schedule> scheduleList;
    public String getDetailTable(){
        /*String r = "";
        for (int i = 0; i < scheduleList.size();i++)
        {
            r = r.concat(scheduleList.get(i).toString());
        }*/
        return "";      
    }
    
    public void addSchedule(Schedule s)
    {
        scheduleList.add(s);
    }
    @Override
    public String toString(){
        return name + " " +id + " " +getDetailTable();
    }
}
