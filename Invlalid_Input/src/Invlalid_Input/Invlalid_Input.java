/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab11task2;
import java.util.*;
public class Invlalid_Input {
    public static void main(String[] args) {
        while(true){
            try{
        Scanner input = new Scanner(System.in);
        int  [] array  = new int [10];
        
        System.out.println("Enter a elements if array :");
        for(int i=0 ; i<10 ; i++){
            array [i] = input.nextInt();
        }
        
         System.out.println("Enter index whose value you want to print :");
          int index = input.nextInt();
          System.out.println("The value at array[ "+ index +" ] : "+array[index]); 
          break;
            }
            catch(InputMismatchException e){
                 System.out.println("You entered an Invalid Input !!!");
                System.out.println("Plz enter correct input :");
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Index out of bound !!!");
                System.out.println("Plz enter <10");
            }
        }
    }
    
}
