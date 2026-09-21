import java.util.Scanner;
/*
* Title of Class: math_tutor
* Author's Name: Milda Kuciauskas
* Purpose: prompt user input to help them solve one of three math problems
*
* Resources: 
*Mrs. Ramsey-Rutledge's Assistance
* https://stackoverflow.com/questions/513832/how-do-i-compare-strings-in-java
* https://www.mathnasium.com/math-terms/permutation
* https://www.cuemath.com/algebra/geometric-sequence/
*
*
*
*
*/

public class Math_tutor_run {


    public static void main (String[] args) {
            System.out.println("Hello, user. Do you need help finding a term of a geometric sequence (g, enter), solving a permutation (p, enter), or solving a combination(c,enter) ?");
            Scanner inputchoose = new Scanner(System.in);
            if (inputchoose.nextLine().equals("p")) {
                System.out.println("You have chosen permutation. A permutation is an arrangement of items in a SPECIFIC order.");
                Permutation perm1 = new Permutation();
                perm1.permInput();


            }
            else if (inputchoose.nextLine().equals("c")) {
               System.out.println("You have chosen combination. A combination is an arrangement of items in a NONSPECIFIC order.");
                Combination comb1 = new Combination();

            }
            else if (inputchoose.nextLine().equals("g")) {
                System.out.println("You have chosen to find a term of a geometric sequence. A geometric sequence is a listing of numbers in which each one is multiplied by a common ratio to get the next.");
                Geometric_sequence geo1 = new Geometric_sequence();



            }
            else {
                System.out.println("No proper input given. Program ended.");
                inputchoose.close();
            }
    
        }





}
