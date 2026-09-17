import java.util.Scanner;

public class permutation {

    private void permInput() {
        Scanner permInfo = new Scanner(System.in);
        System.out.println("How many objects are in your total set?");
         int totalpermobj = permInfo.nextInt();
        System.out.println("How many objects are you picking out of your total set?");
         int chosenpermobj = permInfo.nextInt();
        System.out.println("Thank you! Now to compute....");
        permInfo.close();
         

    }

}
