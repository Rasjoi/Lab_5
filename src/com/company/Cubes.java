package com.company;

import java.util.Arrays;

public class Cubes {
    private Cube[] cubes;
    private int currentCubesNumber;

    public Cubes(final int cubeNumber) {
        this.cubes = new Cube[cubeNumber];
        currentCubesNumber = -1;
    }

    public void addCubes(Cube cube) {
        if (++currentCubesNumber < cubes.length) {
            cubes[currentCubesNumber] = cube;
        }
    }
public int Cube_cubesMax()
{
    Cube maxCubeArea = cubes[0];
    int count=0;
    for(int i=0;i < cubes.length;i++)
    {
        if (cubes[i].get_Cube_area() > maxCubeArea.get_Cube_area())
        {
            maxCubeArea = cubes[i];
           count++;
        }
    }
    return count;
}

    @Override
    public String toString() {
        return
                 Arrays.toString(cubes)  ;
    }
}
