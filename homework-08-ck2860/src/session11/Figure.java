package session11;

public interface Figure {
    Position getPos();
    void move(Position pos);
    String getFillColor();
    String getLineColor();
    double area();
    double perimeter();
    void scale(double factor);
}
