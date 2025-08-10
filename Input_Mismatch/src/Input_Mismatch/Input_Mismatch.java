/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_p1;
import java.util.*;
public class Input_Mismatch {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
          int  [][] array  = new int [3][3];
          while(true){
              try{
                for(int i=0; i<3; i++){
            System.out.println("Enter elements of row :"+(i+1));
            for(int j=0; j<3; j++){
                   array [i][j]  = input.nextInt();
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
    
         while(true){
              try{
                  System.out.println("Enter rows and columns as index :");
                 int row = input.nextInt();
                  int cols = input.nextInt();
                  
                  System.out.println("Element at [ "+row+" ] "+" [ "+cols+" ] = "+array[row][cols]);
                  break;
              }
               catch(InputMismatchException e){
                 System.out.println("You entered an Invalid Input !!!");
                System.out.println("Plz enter correct input :");
                input.nextLine();
            }
               catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Index out of bound !!!");
                System.out.println("Plz enter 0-2");
            }
          }
    }
}
