/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rahat
 */
public class print_number_using_loop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,j=1,k=1;
        for (i=1;i<=100;i++){
            System.out.println("The number is print by for loop : "+i);
        }
        while(j<=100)
        {
            System.out.println("The number is print by while loop : "+j);
            j++;
        }
            
        do{
            System.out.println("The number is print by do while loop : "+k);
            k++;
        }while(k<=100);
                
    }
    
}
