import java.util.Scanner;

public class Permutation {
     private int totalpermobj;
    private int chosenpermobj;
    private int permSolution;

    public void permInput() {
        Scanner permInfo = new Scanner(System.in);
        System.out.println("How many objects are in your total set? CANNOT exceed 20!");
        totalpermobj = permInfo.nextInt();
        System.out.println("How many objects are you picking out of your total set?");
        chosenpermobj = permInfo.nextInt();
        System.out.println("Thank you! Now to compute....");
        permInfo.close();
         
    }
    public int solvePerm() {

        return permSolution;

    }
// public void returnPermSol() {  }
    public int permFactorial() {
        return 0;
    }
}
