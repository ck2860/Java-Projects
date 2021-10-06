package Session25;

public class BadMoveException extends Exception{


    public BadMoveException(String message){ // constructor
        super(message);
    }

    public static void main(String[] args) {
        Exception e = new BadMoveException("a message");
        System.out.println(e.getMessage());
//        System.out.println(e.getLocalizedMessage());
        e.printStackTrace();
    }
}
