


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Rahat
 */
public class odd_or_even {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number please :  ");
        //taking user input
        int number = input.nextInt();
        if(number%2 ==0){
            System.out.println(number+" is even");
        }
        else{
            System.out.println(number+" is odd");
        }
        
    }
    
}
