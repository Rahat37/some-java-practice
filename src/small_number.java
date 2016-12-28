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
public class small_number {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 1st number : ");
        int number = input.nextInt();
        System.out.println("Enter the 2st number : ");
        int number_1 = input.nextInt();
        System.out.println("Enter the 3st number : ");
        int number_2 = input.nextInt();
        if(number<number_1 && number<number_2){
            System.out.println("The Small number is: "+number);
        }
        else if(number_1<number && number_2<number){
            System.out.println("The small number is:"+number_1);
            
        }
        else if(number_2<number && number_2<number_1){
            System.out.println("The small number is:"+number_2);
        }
        else{
            System.out.println("Any two number is same or three number is same or you enter some invalid input");
        }
        
    }
    
}
