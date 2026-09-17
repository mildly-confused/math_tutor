import java.util.Scanner;
/*
* Title of Class: math_tutor
* Author's Name: Milda Kuciauskas
* Purpose: prompt user input to help them solve one of three math problems
*
* Resources: 
*Mrs. Ramsey-Rutledge's Assistance
https://stackoverflow.com/questions/513832/how-do-i-compare-strings-in-java
* https://www.mathnasium.com/math-terms/permutation
*
*
*
*
*/

public class math_tutor_run {


    public static void main (String[] args) {
            System.out.println("Hello, user. Do you need help solving a geometric sequence (g, enter), permutation (p, enter), or combination(c,enter) ?");
            Scanner inputchoose = new Scanner(System.in);
            if (inputchoose.nextLine().equals("p")) {
                inputchoose.close();
                System.out.println("You have chosen permutation. A permutation is an arrangement of items in a SPECIFIC order.");
                permutation perm1 = new permutation();
                perm1.permInput();


            }
            else if (inputchoose.nextLine().equals("c")) {
                inputchoose.close();
               System.out.println("You have chosen combination. A combination is an arrangement of items in a NONSPECIFIC order.");
                combination comb1 = new combination();

            }
            else if (inputchoose.nextLine().equals("g")) {
                inputchoose.close();


            }
            else {
                System.out.println("No proper input given. Program ended.");
                inputchoose.close();
            }
    
        }





}
