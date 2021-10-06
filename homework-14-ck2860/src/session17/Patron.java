package session17;

import java.util.ArrayList;
import java.util.List;

/**
 * private fields for the patron: unique ID, name, books borrowed, fine accrued, and address
 */
public class Patron {
    private final String id;
    private String name;
//    private String address;
    private List<String> books;
    private float fine;

    /**
     * A constructor for Patron that they have: id, name, and address
     * start with no books and fines.
     * @param id patron's ID in the format "ABC1234" (3 letters and 4 digits)
     * @param name patron's name
//     * @param address patron's address
     */
    public Patron(String id, String name){
        this.id = id;
        this.name = name;
//        this.address = address;

        books = new ArrayList<>();
        fine = 0.0f;
    }

    /**
     * a setter for book
     * @param books
     */

    public void setBooks(List<String> books) {
        this.books = books;
    }

    public void addBook(String title){
        books.add(title);
    }

    /**
     * a getter for book
     * @return the list of books
     */

    public List<String> getBooks() {
        return books;
    }

    /**
     * a getter for name
     * @return patron's name
     */

    public String getName() {
        return name;
    }

    /**
     * a getter for an ID
     * @return patron's ID
     */

    public String getId() {
        return id;
    }

    /**
     * a setter for fine
     * @param fine patron's fines
     */

    public void setFine(float fine) {
        this.fine = fine;
    }
    /**
     * a getter for fines
     * returns patron's fines
     */

    public float getFine() {
        return fine;
    }

    /**
     * a getter for address
     * @return patron's address
     */

//    public String getAddress() {
//        return address;
//    }

    @Override
    public String toString () {
        return "Patron [Name = " + getName() + ", ID Number = " + getId() + ", Books = " + getBooks() + ", Accumulated Fines = " + getFine() + " ]";
    }

    @Override
    public int hashCode() {
        int hashCode =0;
        int count = 0;
        int firstABC=0;
        int second1234=0;
        for (char c : id.toCharArray()) {
            if (count < 3) {
//                System.out.println(c + " this is a char " + (int) c);
//                System.out.println((int) c - 65);
                firstABC += ((int) c - 65) *(Math.pow(26, (2-count)));
//                hashCode += ((int) c - 65) *(Math.pow(26, (2-count)));
            } else {
//                System.out.println(c + " this is a number " + (int) c);
//                System.out.println((int) c - 48);
//                hashCode += (int) c - 48;
                second1234 += ((int) c - 48) *(Math.pow(10, (6-count)));
            }
             hashCode = (firstABC * 10000) + second1234;
//            System.out.println("final string is : " + hashCode);
            count++;
        }
        return hashCode;
    }


    /**
     * Since patron has its own id number, so we use id numbers to compare..
     * This is where we can tell if the patrons are the same person,..
     * @param id
     * @return
     */

    @Override
    public boolean equals(Object id) {
        return getId().equals(id);
    }

    public static void main(String[] args) {
//        HashMap<Integer, Patron> hashMap = new HashMap<>();

        Patron p1 = new Patron("ZZZ1234", "Condy");
        System.out.println(p1.hashCode());
    }
}
