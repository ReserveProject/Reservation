/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ressystem;

public class MainTable {
        private ArrayList<Theatre> theatreList =
                new ArrayList<>();
        private ArrayList<Movie> movieList;
        public void addTheatre(Theatre t){
            theatreList.add(t);
        }
        public void listTheatre(){
            for( Theatre theatre : theatreList){
                System.out.println(theatre);
            }
        }
}
