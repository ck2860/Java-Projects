package Session25;

public enum Piece {
    BLACK("B"),
    WHITE("W");

    private String symbol;

    Piece(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public Piece flip() {
        return this == WHITE ? BLACK : WHITE;
    }
}
