/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nyplab5;

import java.util.Scanner;

/**
 *
 * @author Emirhan Güney
 */
public class NYPLAB5 {

   
    public static void main(String[] args) {
        
         Scanner scan = new Scanner(System.in);
        
        int [][]dizi = new int[3][2];
        
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 2; j++)
            {
               System.out.print("[" + i + "]" + "["+ j +"] = ");
                dizi[i][j] = scan.nextInt();
            }
        }
        System.out.println("\n");
        
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                System.out.print(dizi[i][j] );
            } 
    
               System.out.println();
       }
   }
   }
    

