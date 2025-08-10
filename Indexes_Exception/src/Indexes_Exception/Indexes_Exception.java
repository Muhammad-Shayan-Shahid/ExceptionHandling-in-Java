/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e_practice1;
import java.util.*;
public class Indexes_Exception {

    public static void average(int [] arr){
        try{
        int avg = 0;
        int sum=0;
        for(int i=0 ; i<arr.length ; i++){
            if(i>=arr.length){
                throw new ArrayIndexOutOfBoundsException ("Index out of bound");
            }
            sum+=arr[i];
        }
        avg = sum / arr.length;
        System.out.println("Avg is  :"+avg);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception caught : "+e.getMessage());
        }
    }
    public static void main(String[] args) {
         try{
             Scanner input = new Scanner(System.in);
             System.out.println("Enter a length of marks you want to enter :");
             
             if(!input.hasNextInt()){
                 throw new InputMismatchException ("Invalid Input !!");
             }
        int size = input.nextInt();
        int  [] array  = new int [size];
       
        System.out.println("Enter marks of students :");
        for(int i=0 ; i<size ; i++){
            array [i] = input.nextInt();
        }
        average(array);
         }
        catch(InputMismatchException e){
            System.out.println("Exception caught : "+e.getMessage());
        }
    }
    
}
