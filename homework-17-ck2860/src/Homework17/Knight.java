package Homework17;

import org.w3c.dom.Node;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Knight<T> {
    //    private Vertex <T> start;
//    private Vertex <T> end;
    /**
     * private fields for the Knight class
     * knight map for the neighbors
     * x for the row
     * y for the column
     */
    private LinkedList<Knight> knightMap;
    private int x;
    private int y;

//    public Knight(T start, T end){
//        this.start = new Vertex<>(start);
//        this.end = new Vertex<>(end);
//        knightMap = new LinkedList<>();
//
//    }

    /**
     * The constructor to set x y, and the creation of knightMap.
     *
     * @param x
     * @param y
     */
    public Knight(int x, int y) {
        this.x = x;
        this.y = y;
        knightMap = new LinkedList<>();
//        System.out.println("made a knight at x: " + x + " y: " + y);
    }

    /**
     * the getter for the Y
     *
     * @return y
     */
    public int getY() {
        return y;
    }

    /**
     * getter for the X
     *
     * @return x
     */
    public int getX() {
        return x;
    }

    /**
     * setter for the Y
     *
     * @param y y
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * setter for the X
     *
     * @param x x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * the getter for the knightMap.
     *
     * @return knightMap
     */
    public LinkedList<Knight> getKnightMap() {
        return knightMap;
    }

    /**
     * the helper method to check if the X and Y is in the chessboard
     *
     * @param x    x
     * @param y    y
     * @param size the board's length
     * @return boolean value: true or false
     */

    public boolean inBounds(int x, int y, int size) {
        if (x < 0 || y < 0) {
            return false;
        }
        if (x > size - 1 || y > size - 1) {
            return false;
        }
        return true;
    }

    public boolean alreadyExist(Knight knight) {
        Object pointer = knightMap.getFirst();
        int i = 0;
        while (pointer != null) {
            pointer = knightMap.get(i);
            if (pointer == knight) {
                return true;
            }
            i++;
        }
        return false;
    }

    /**
     * the nextMove method is for the the next move of the Knight.
     *
     * @param board the chessboard
     */

    public void nextMove(String[][] board) {
//        Vertex<T> vertex = new Vertex<>(start);
//        AdjacencyGraph knightGraph = new AdjacencyGraph();
//        knightGraph.add(start);
//        knightGraph.add(end);
        Knight current = new Knight(x, y);
        if (inBounds(x + 2, y + 1, board.length) && (board[x + 2][y + 1] == " " || board[x + 2][y + 1] == "E")) {
//            board[x + 2][y + 1] = ".";
            Knight neighborOne = new Knight((x + 2), (y + 1));
            knightMap.add(neighborOne);

        }
        if (inBounds(x + 1, y + 2, board.length) && (board[x + 1][y + 2] == " " || board[x + 1][y + 2] == "E")) {
//            board[x + 1][y + 2] = ".";
            Knight neighborTwo = new Knight((x + 1), (y + 2));
            knightMap.add(neighborTwo);

        }
        if (inBounds(x - 2, y - 1, board.length) && (board[x - 2][y - 1] == " " || board[x - 2][y - 1] == "E")) {
//            board[x - 2][y - 1] = ".";
            Knight neighborThree = new Knight((x - 2), (y - 1));
            knightMap.add(neighborThree);

        }
        if (inBounds(x - 1, y - 2, board.length) && (board[x - 1][y - 2] == " " || board[x - 1][y - 2] == "E")) {
//            board[x - 1][y - 2] = ".";
            Knight neighborFour = new Knight((x - 1), (y - 2));
            knightMap.add(neighborFour);

        }
        if (inBounds(x + 2, y - 1, board.length) && (board[x + 2][y - 1] == " " || board[x + 2][y - 1] == "E")) {
//            board[x + 2][y - 1] = ".";
            Knight neighborFive = new Knight((x + 2), (y - 1));
            knightMap.add(neighborFive);

        }
        if (inBounds(x + 1, y - 2, board.length) && (board[x + 1][y - 2] == " " || board[x + 1][y - 2] == "E")) {
//            board[x + 1][y - 2] = ".";
            Knight neighborSix = new Knight((x + 1), (y - 2));
            knightMap.add(neighborSix);

        }
        if (inBounds(x - 2, y + 1, board.length) && (board[x - 2][y + 1] == " " || board[x - 2][y + 1] == "E")) {
//            board[x - 2][y + 1] = ".";
            Knight neighborSeven = new Knight((x - 2), (y + 1));
            knightMap.add(neighborSeven);

        }
        if (inBounds(x - 1, y + 2, board.length) && (board[x - 1][y + 2] == " " || board[x - 1][y + 2] == "E")) {
//            board[x - 1][y + 2] = ".";
            Knight neighborEight = new Knight((x - 1), (y + 2));
            knightMap.add(neighborEight);
        }

        /*int i = 1;
        for (Knight<T> knight : knightMap) {
//            if ((inBounds(knight.getX(), knight.getY(), board.length)) && (!alreadyExist(knight))) {
//            if (inBounds(knight.getX(), knight.getY(), board.length)) {
            if (board[knight.getX()][knight.getY()].equals("E")) {
                break;
                }
                knightGraph.add(knight);
                knightGraph.connectDirected(current, knight);
//                board[knight.getX()][knight.getY()] = Integer.toString(i);
//                i++;
//            }
            }*/
//        System.out.println("Path from " + start + " to " + end + " : " + knightGraph.breadthFirstSearch(start, end));
//        System.out.println("Path from " + start + " to " + end + " : " + knightGraph.breadthFirstPath(start, end));
//

    }

    public static void main(String[] args) {
        String[][] board = new String[4][4];
        System.out.println(board.length);
//        Knight test = new Knight(0, 0);
//        Knight test2 = new Knight(3, 3);
//        test.nextMove(board);
//        for(Object knight: test.getKnightMap()){
//            System.out.println("HI");
//        }
//    }
    }
}


