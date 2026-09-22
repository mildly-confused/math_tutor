/*
* Title of Class: Permutation
* Author's Name: Milda Kuciauskas
* Purpose: to be called in order to solve a permutation based on certain user inputted numbers
*
* Resources:
* https://www.baeldung.com/java-calculate-factorial
* used as a reminder on how to use a for loop and deal with
* data types for calculating numbers that get as large as factorials
*/
import java.util.Scanner;


public class Permutation {
    //instantiating instance variables to use
     private int totalpermobj;
     private int chosenpermobj;
     private long permSolution;
     private long fact;

    public void permInput() { //method for prompting and accepting neccesary user input
        Scanner permInfo = new Scanner(System.in);
        System.out.println("How many objects are in your total set? CANNOT exceed 20 or be less than 1!");
        totalpermobj = permInfo.nextInt();
        System.out.println("How many objects are you picking out of your total set? This cannot exceed " + totalpermobj + " cand must be a positive integer");
        chosenpermobj = permInfo.nextInt();
        System.out.println("Thank you! Now to compute....");
        permInfo.close();
         
    }
    public long solvePerm() { //method to compute the permutation based on given inputs
      permSolution =  (permFact(totalpermobj))/(permFact(totalpermobj - chosenpermobj)); //calling permFact method
        return permSolution;
    }

    public long permFact(int n) { //calculates factorial using for loop
        fact = n; //reassigning data types? expands decimal places so data not lost
        for(int x = 2; x < n; x++) {
            fact = fact * x ;
        }
        if (fact <= 0) {
            return 1;
        }
        else {
        return fact;
    }
}
}