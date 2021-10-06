package session;

public interface Heap  {
//    private int value;

    public void add(int value);
    void add(int... values);
    public int remove();
    public int size();
}
