/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rahat
 */
import java.util.*;
public class sum_and_avarage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number input number");
        int number = input.nextInt();
        int sum = 0,add=0;
        int i = number;
        while(i>0){
            System.out.println("Enter the number for addition And avarage");
            add = input.nextInt();
            sum=sum+add;
            i--;
        }
        System.out.println("The sum is : "+sum);
        float avarage = sum/number;
        System.out.println("The avarage is : "+avarage);
        
    }
    
}
