/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_p2;
import java.util.*;
public class Arthemtic_Exception {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            try{
        System.out.println("Enter number of integer you want :");
        int N = input.nextInt();
        int [] arr = new int [N];
        
         System.out.println("Enter a elements of array :");
        for(int i=0 ; i<N ; i++){
            arr [i] = input.nextInt();
        }
        int div = 0;
         for(int i=0 ; i<N-1 ; i++){
             try{
                div = arr[i]/arr[i+1]; 
                 System.out.println(div);
             }
             catch(ArithmeticException e){
                System.out.println("Division by 0 is not possible");
            }
        }
         break;
            }
            catch(InputMismatchException e){
                 System.out.println("You entered an Invalid Input !!!");
                System.out.println("Plz enter correct input :");
                input.nextLine();
            }
        }
    }
    
}
