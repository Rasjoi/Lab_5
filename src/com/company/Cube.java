package com.company;

public class Cube extends Square
{
    public Cube(double side) {
        super(side);
    }
public double Volume() {
    double volume = (this.getSide() * 3);
    return volume;

}
public  double get_Cube_area( )
{
    return 6 * (this.getSide() * this.getSide());
 }

    @Override
    public String toString() {
        return  "\n" + "Cube :" + super.toString().format("%.3f", get_Cube_area()) + "  "
                + "Volume: " + super.toString().format("%.3f", Volume());
    }
}
