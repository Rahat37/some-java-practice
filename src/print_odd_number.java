import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rahat
 */
public class print_odd_number {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,j,start;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Starting point");
        i=input.nextInt();
        System.out.println("Enter the ending point");
        j=input.nextInt();
        for(start=i;start<=j;start++){
            if(start%2 != 0){
                System.out.println("This is a odd number"+start);
            }
            else{
                continue;
            }
        }
    }
    
}
