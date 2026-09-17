import java.util.Scanner;

public class combination {
    private int totalcombobj;
    private int chosencombobj;
    public void combInput() {
        Scanner combInfo = new Scanner(System.in);
        System.out.println("How many objects are in your total set?");
         totalcombobj = combInfo.nextInt();
        System.out.println("How many objects are you picking out of your total set?");
         chosencombobj = combInfo.nextInt();
        System.out.println("Thank you! Now to compute....");
        combInfo.close();
         

    }
    

}
