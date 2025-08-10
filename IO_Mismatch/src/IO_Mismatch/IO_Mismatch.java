/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab11task1;
import java.util.*;
public class IO_Mismatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            try{
         System.out.println("Enter 2 number separated by spaces  :");
         int n1 = input.nextInt();
         int n2 = input.nextInt();  
         System.out.println("Sum of "+n1+ " and "+n2+" = "+(n1+n2));
         break;
            }
            catch(InputMismatchException e){
                System.out.println("You entered an Invalid Input !!!");
                System.out.println("Plz enter correct input :");
            }
            input.nextLine();
        }
    }
    
}
