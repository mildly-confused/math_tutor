import java.util.Scanner;

public class Combination {
    //declaring variables as private as to keep them immutable (terminology?)
    private int totalcombobj;
    private int chosencombobj;
    private long fact;
    private long combSolution;

    public void combInput() { //method for accepting and prompting user input prior to solving
        Scanner combInfo = new Scanner(System.in);
        System.out.println("How many objects are in your total set? CANNOT exceed 20!");
         totalcombobj = combInfo.nextInt();
        System.out.println("How many objects are you picking out of your total set? This cannot exceed " + totalcombobj);
         chosencombobj = combInfo.nextInt();
        System.out.println("Thank you! Now to compute....");
        combInfo.close();
    }
    public long solveComb() { //method to compute the combination
        combSolution = (combFact(totalcombobj))/((combFact(totalcombobj - chosencombobj))*(combFact(chosencombobj)));
        return combSolution;
    }
    public long combFact(int c) { //method to compute the factorial of the inputted numbers as per the combination formula
        fact = c;
        for (int x = 2; x < c; x++) {
            fact = fact * x; 
        }
        return fact;
    }
    

}
