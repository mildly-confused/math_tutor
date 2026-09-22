/*
* Title of Class: Geometric_sequence
* Author's Name: Milda Kuciauskas
* Purpose: to be called in order to solve a geometric sequence
*
*/

import java.util.Scanner;

public class Geometric_sequence {

	private double commonRatio;
  private int nthTerm;
  private double firstTerm; 
  private double geoSolution;


    public void geoInput() {
        Scanner geoScanner = new Scanner(System.in);
        System.out.println("Which number term would you like to find?");
        nthTerm = geoScanner.nextInt();
        System.out.println("What is the common ratio in your geometric sequence?");
        commonRatio = geoScanner.nextDouble();
        System.out.println("What is the first term of your geometric sequence?");
        firstTerm = geoScanner.nextDouble();
        geoScanner.close();
    }
    public double geoSolve() {
      geoSolution = firstTerm * Math.pow(commonRatio, (nthTerm - 1));
      return geoSolution;
    }
 

}
