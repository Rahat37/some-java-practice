
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rahat
 */
public class negative_or_positive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        //taking user input from user
        int number=input.nextInt();
        if(number >= 0){
            System.out.println("The number is positive");
        }
        else{
            System.out.println("The number is nagative");
        }
        
        // TODO code application logic here
    }
    
}
