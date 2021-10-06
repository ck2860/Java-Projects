package session17;

import java.util.ArrayList;
import java.util.List;

public class Library {
    /**
     * A field for library : a list of patrons
     */
    private List<Patron> patrons;

    /**
     * a constructor for a library: patrons list
     */

    public Library(){
        patrons = new ArrayList<>();
    }

    /**
     * adds a new patron to the library
     * @param patron a patron
     */

    public void addPatron (Patron patron){
        patrons.add(patron);
    }

    /**
     * with given an ID, finds and returns the patron but if there's no patron that has that ID, it would return null
     * @param id an ID
     * @return patron's ID or null if it they arent matched.
     */

    public Patron getPatron(String id){
        for (Patron patron : patrons){
            if(patron.getId().equals(id)){
                return patron;
            }
        }

        return null;
    }

    /**
     * Adding books to the patron's list of checked out books.
     * @param id patron's ID
     * @param title patron's borrowed books
     */

    public void addBook(String id, String title){
        Patron patron = getPatron(id);
        patron.addBook(title);
//        addBook(title);
    }

    public void addFine(String id, float fine){
        Patron patron = getPatron(id);
    }
}
