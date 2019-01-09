package org.fasttrackit;


public class App 
{
    public static void main( String[] args ){
        Exercise firstExercise = new Exercise();
        firstExercise.sumOfTwoNumbers(20.5, 17.65);
        firstExercise.devide(81, 9);
        firstExercise.minus(7.25,10.5);
        firstExercise.average(15,17);

        Exercise secondExrcise = new Exercise();
        secondExrcise.sumOfTwoNumbers(1, 5);
        secondExrcise.devide(9,2);
        secondExrcise.minus(15,7);
        secondExrcise.average(15,15);



    }
}
