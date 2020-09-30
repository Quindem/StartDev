/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev;

import static java.lang.Math.random;
import java.util.Random;

/**
 *
 * @author dimad
 */
public class Task6 {
     public void run(){
        System.out.println("----- Задача 6 ------");
         System.out.println("Создаем ДВУХМЕРНЫЙ ЗУБЧАТЫЙ массив  из 10х(5,6,7,8,9) ячеек типа int, \nзаполняем его случайными числами и выводим \nего значения в цикле");
         Random random = new Random();
         int myArray[][] = new int[10][5];
         int myArray2[][] = new int[10][6];
         int myArray3[][] = new int[10][7];
         int myArray4[][] = new int[10][8];
         int myArray5[][] = new int[10][9];
         for (int i = 0; i < myArray.length; i++){
        for (int j = 0; j < myArray[i].length; j++)
        
            myArray[i][j] = random.nextInt(20);
         }
    for (int i = 0; i < myArray.length; i++){
        System.out.println();
        for (int j = 0; j < myArray[i].length; j++){
        
            System.out.printf(myArray[i][j] + " ");
        }
    }
    }
}
    

