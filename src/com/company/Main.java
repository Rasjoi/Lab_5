package com.company;

public class Main {

    public static void main(String[] args) {
        final int N1 = 8;
        final int N2 = 10;
        Squares squares = new Squares(N1);
        Cubes cubes = new Cubes(N2);
        double side = 0;
        for (int i = 0; i < N2; i++) {
            while (!Cube.CheckCorrectSide_length(side = Math.random() * 15)) ;
            {
                cubes.addCubes(new Cube(side));
            }
        }
        for (int i = 0; i < N1; i++) {
            while (!Square.CheckCorrectSide_length(side = Math.random() * 15)) ;
            {
                squares.addSquares(new Square(side));
            }
        }
       // System.out.println(squares);
        System.out.println("average area  of squares:\t" + squares.findAverage_Area());
       // System.out.println(cubes);
        System.out.println("amount max area cubes:\t" + cubes.Cube_cubesMax());


    }
}