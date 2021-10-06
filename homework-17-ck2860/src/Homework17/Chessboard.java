package Homework17;


import java.util.*;

public class Chessboard <T> {
    private String [][] board;

    public Chessboard(String [][] board) {
        this.board = board(board);
    }

    /**
     * Creating a board layout..
     * when we iterate the loop for rows and columns, the layout is created..
     * @param board
     * @return
     */

    public String[][] board(String[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                board[row][col] = " ";
//                System.out.print(" | " + board[row][col] + " ");
            }
//            System.out.println("|");
        }
        return board;
    }

    /**
     * Setting the start and end positions on the chessboard.
     * @param letter a letter on the chess board
     * @param row row
     * @param col column
     * @return
     */
    public String [][] location(String letter, int row, int col) {
        this.board[row][col] = letter;
        return board;
    }

    /**
     *First start looping through the row then into loop through the columns,
     * once you find a position of "S" and "E".
     * you start to build a path by calling the nextMove
     * to get the next position then change the "." to the numbers of steps
     * The queue would be started in order to collect its neighbors
     * then trying to reach the position of "E"then it will stops dequeue-ing.
     *
     * the bfpath was performed to get its path
     */

    public void plot() {
        Knight starting = null;
        Knight ending = null;
        int endRow= 0;
        int endCol = 0;
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (board[row][col].equals("S")) {
                    starting = new Knight(row, col);
                }
                if (board[row][col].equals("E")){
                    ending = new Knight(row, col);
                    endRow = row;
                    endCol = col;
                }
            }
        }
        AdjacencyGraph<Knight> graph = new AdjacencyGraph<>();

        Queue<Knight> queue = new LinkedList<>();
        Knight currentKnight;
        queue.add(starting);
        graph.add(starting);

        while(queue.size() > 0){
            currentKnight = queue.poll();
            currentKnight.nextMove(board);

            if(currentKnight.getX() == endRow && currentKnight.getY() == endCol){
                ending = currentKnight;
                board[currentKnight.getX()][currentKnight.getY()] = "E";
                break;
            }

            ListIterator<Knight> knightMapIterator = currentKnight.getKnightMap().listIterator();
            while(knightMapIterator.hasNext()){
                Knight neighborKnight = knightMapIterator.next();
                queue.add(neighborKnight);
                graph.add(neighborKnight);
                graph.connectDirected(currentKnight, neighborKnight);
            }
        }

        List<Knight> knightPath = graph.depthFirstPath(starting, ending);
//        for(int index = 0; index < knightPath.size(); index++){
//            System.out.println(knightPath.get(index).getX() +", " + knightPath.get(index).getY());
//        }

        int pathIndex = 1;
        int i = 1;
        for(int row = 0; row < board.length; row++){
            for(int col = 0; col < board[0].length; col++){
                if(pathIndex < knightPath.size() && board[knightPath.get(pathIndex).getX()][knightPath.get(pathIndex).getY()] != "E"){
                    row = knightPath.get(pathIndex).getX();
                    col = knightPath.get(pathIndex).getY();
                    board[row][col] = Integer.toString(i);
                    i++;
                    pathIndex++;
                }

            }
        }
//        outcome(board);
    }

    /**
     * calling the plot method to plot then
     * trying to tracking the path by iterate over the columns and row to get the values and connect them..
     */

//    public void path () {
//        AdjacencyGraph graphTest = new AdjacencyGraph();
//        this.plot();
//        for (int row = 0; row < board.length; row++) {
//            for (int col = 0; col < board[0].length; col++) {
//                if (!board[row][col].equals(" ")) {
//                    graphTest.add(board[row][col]);
//                }
//            }
//        }
//    }


    /**
     * printing the entire/result board
     * @param board string board.
     */
    public void outcome (String [][] board) {
        plot();
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                System.out.print(" | " + board[row][col] + " ");
            }
            System.out.println("|");
        }
    }

    public void outcome1 (String [][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                System.out.print(" | " + board[row][col] + " ");
            }
            System.out.println("|");
        }
    }

    /**
     * Two command line arguments are added so if the loop would through the args array to plug in row and column.
     * If not then the user would enter two numbers for row and col
     * The user would be asked to enter the coordinates for the start and end.
     * If the user wants to end the game, it has to enter "quit"
     *
     * @param args
     */

    public static void main(String[] args) {
        int counter = 0;
        String[][] board;
        Scanner scanner = new Scanner(System.in);
        if(args.length == 2) {
            board = new String[Integer.parseInt(args[0])][Integer.parseInt(args[1])];
        }else{
            System.out.println("Please enter the size of the chess board (ex: 8x8)");
            String input = scanner.next();
            String[] array = input.split("x");
            board = new String[Integer.parseInt(array[0])][Integer.parseInt(array[1])];
        }
        while (counter < 1) {
            Chessboard game1 = new Chessboard(board);
            System.out.print("<row1> <col1> <row2> <col2> or quit:");
            if(scanner.hasNextInt()) {
                int nextNumOne = scanner.nextInt();
                int nextNumTwo = scanner.nextInt();
                int nextNumThree = scanner.nextInt();
                int nextNumFour = scanner.nextInt();
                if ((nextNumOne < 0 || nextNumOne > board.length) || (nextNumTwo < 0 || nextNumTwo > board.length) || (nextNumThree < 0 || nextNumThree > board.length)  || (nextNumFour < 0 || nextNumFour > board.length)) {
                    System.out.println("No path exists from (" + nextNumOne + ", " + nextNumTwo + ") to (" + nextNumThree + "," + nextNumFour+ ")");
                    game1.outcome1(board);
                }else {
                    game1.location("S", nextNumOne, nextNumTwo);
                    game1.location("E", nextNumThree, nextNumFour);
                    game1.outcome(board);
                }
            }else if (scanner.next().equals("quit")){
                System.out.println("Good Bye!");
                counter++;
                }
        }
    }
}
