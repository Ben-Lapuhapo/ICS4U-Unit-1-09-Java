/****************************************************************************
 *
 * Created by: Ben Lapuhapo
 * Created on: March 03 2019
 * This program randomly generates the marks for 4 Students, and their 6
 * Assignments
 *
 ****************************************************************************/

import java.util.Random;
import java.util.Arrays;

public class StudentMarks {

    public static void main(String[] arg)
    {
        Random rand = new Random();
        double Average;
        double[][] StudentMarks = new double[4][6];

        // Cycles through every student in the class
        for (int Students = 0; Students < StudentMarks.length; Students ++)
        {
            System.out.printf("Student %s marks  :  ", Integer.toString(Students + 1));
            // Cycles through each of their Assignments
            for (int Assignments = 0; Assignments < StudentMarks[Students].length; Assignments ++)
            {
                StudentMarks[Students][Assignments] = rand.nextInt(100) + 1;
                if (Assignments < StudentMarks[Students].length - 1)
                {
                    System.out.print(StudentMarks[Students][Assignments] + ", ");
                }
                else
                {
                    System.out.printf("%s%n", StudentMarks[Students][Assignments]);
                }
            }
        }

        Average = AverageMark(StudentMarks);
        System.out.printf("The class Average is: %.1f%n",Average);
    }

    public static double AverageMark(double[][] StudentMarks)
    {
        double Average;
        double TotalSum;
        double TotalNumOfElem;
        TotalSum = 0.0;
        TotalNumOfElem = 0;

        for(int Num=0; Num < StudentMarks.length; Num++)
        {
            for (int NumOne= 0; NumOne < StudentMarks[0].length; NumOne++)
            {
                // Adds up the total of all the class marks
                TotalSum = TotalSum + StudentMarks[Num][NumOne];
                // Finds total length of array
                TotalNumOfElem += 1;
            }
        }

        // Finds the Average
        Average = TotalSum / TotalNumOfElem;
        return Average;
    }

}