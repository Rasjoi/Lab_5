package com.company;

import java.util.Arrays;

public class Squares {
    private Square[] squares;
    private int currentSquaresNumber;

    public Squares(final int squareNumber) {
        this.squares = new Square[squareNumber];
        currentSquaresNumber = -1;
    }


    public void addSquares(Square square) {
        if (++currentSquaresNumber < squares.length) {
            squares[currentSquaresNumber] = square;
        }
    }


    public double findAverage_Area() {
        double Average_Area = 0;
        for (int i = 0; i < squares.length; i++) {
            Average_Area += squares[i].getSquare_area();
        }
        return Average_Area / (squares.length + 1);
    }

    @Override
    public String toString() {
        return
                "Squares=\n" + Arrays.toString(squares) ;
    }
}
