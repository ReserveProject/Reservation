/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ressystem;

/**
 *
 * @author phisan
 */
public class ResSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MainTable mtable = new MainTable();
       
        
        mtable.addTheatre(new Theatre("T1",1));
        mtable.addTheatre(new Theatre("T2",2));
        mtable.addTheatre(new Theatre("T3",3));
        
        mtable.listTheatre();
        Seat p = new Seat();
        p.reserveSeat(2, 7);
        p.reserveSeat(2, 8);
        System.out.println(p);
               
        
    }
}
