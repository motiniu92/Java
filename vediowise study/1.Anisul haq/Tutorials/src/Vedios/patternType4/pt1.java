/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patternType4;
import java.util.Scanner;
/**
 *
 * @author shetu
 */
public class pt1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of lines:");
        int n = input.nextInt();
        for (int row = 1; row <= n; row++) {
            //Printing space
            for (int col = 1; col <= n-row; col++) {
                System.out.print(" ");
            }
            //Printing Number
            for (int col = 1; col <= row ; col++) {
                System.out.print(""+col);
            }
            System.out.println("");
        }
        
    }
}
