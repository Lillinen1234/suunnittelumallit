package TemplateMethod;

import java.util.ArrayList;
import java.util.Scanner;

public class TicTacToe extends Game{

    String[] grid = {"0", "1", "2", "3", "4", "5", "6", "7", "8"};
    ArrayList<Integer> usedSquares = new ArrayList<>();

    String playerOneSign = "X";
    String playerTwoSign = "O";
    int currentPlayer;
    int square;
    int filledSquares = 0;

    boolean end = false;

    Scanner scanner = new Scanner(System.in);

    @Override
    void initializeGame() {

        System.out.println("Tic-Tac-Toe!");
        System.out.println("Player 1 is X and Player 2 is O!");
    }

    @Override
    void makePlay(int player) {

        printGrid();

        currentPlayer = player + 1;
        System.out.println("Player " + currentPlayer + " choose a free square: ");
        square = Integer.parseInt(scanner.nextLine());

        while (squareIsFilled(square)) {
            System.out.println("Square already filled!");
            printGrid();
            System.out.println("Choose again: ");
            square = Integer.parseInt(scanner.nextLine());
        }

        changeValueOfSquare(square, currentPlayer);

        usedSquares.add(square);

        filledSquares++;

        checkGrid();

        if (filledSquares == 9){
            end = true;
        }

    }

    @Override
    boolean endOfGame() {
        return end;
    }

    @Override
    void printWinner() {
        if (filledSquares == 9) {
            System.out.println("Draw!");
        } else {
            System.out.println("Player " + currentPlayer + " wins!\n");
            printGrid();
        }

    }

    void printGrid(){
        for (int i = 0; i < grid.length; i++) {
            System.out.print("[" + grid[i] + "] ");
            if (i == 2 || i == 5) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public void changeValueOfSquare(int square, int currentPlayer) {
        if (currentPlayer == 1) {
            grid[square] = playerOneSign;
        } else {
            grid[square] = playerTwoSign;
        }

    }

    public boolean squareIsFilled(int square){

        if (usedSquares.contains(square)) {
            return true;
        }

        return false;
    }

    public void checkGrid(){
        if (grid[0].equals(grid[1]) && grid[1].equals(grid[2])) {
            end = true;
        } else if(grid[3].equals(grid[4]) && grid[4].equals(grid[5])) {
            end = true;
        } else if(grid[6].equals(grid[7]) && grid[7].equals(grid[8])) {
            end = true;
        } else if (grid[0].equals(grid[3]) && grid[3].equals(grid[6])) {
            end = true;
        } else if (grid[1].equals(grid[4]) && grid[4].equals(grid[7])) {
            end = true;
        } else if (grid[2].equals(grid[5]) && grid[5].equals(grid[8])) {
            end = true;
        } else if (grid[0].equals(grid[4]) && grid[4].equals(grid[8])) {
            end = true;
        } else if (grid[2].equals(grid[4]) && grid[4].equals(grid[6])) {
            end = true;
        }
    }
}
