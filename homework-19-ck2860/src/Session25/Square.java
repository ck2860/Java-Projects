package Session25;
public class Square {
    private Piece piece;

    public Square(){
        this.piece = null;
    }

    public void occupy(Piece piece) throws BadMoveException{
        if (piece == null){
            throw new BadMoveException("square is occupied");
        }
        this.piece = piece;
    }

    public boolean isOccupied(){
        return piece != null;
    }

    public void flip() throws BadMoveException{
        if(piece == null){
            throw new BadMoveException("square is empty");
        }
        piece = piece.flip();
    }

    public String toString() {
        return isOccupied() ? piece.getSymbol() : " ";
    }

//    public static void main(String[] args) {
//        int [][] array =  new int[Integer.MAX_VALUE][Integer.MAX_VALUE]; // Out of MemoryError
//    }
}
