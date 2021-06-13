/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Matias Gacitua
 */

public class AddingNumbers
{

    public static double sum(double[] numbers)
    {
        double sum = 0;

        for( double number : numbers)
        {
            sum += number;
        }
        return sum;
    }
}