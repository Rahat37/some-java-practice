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
public class number_range {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number=input.nextInt();
        if(number<=500 && number>=200)
        {   
            System.out.println(number+" is in the range of 200 to 500");
        }
        else{
            System.out.println("Out of range");
        }
        
    }
    
}
