/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev;

import java.util.Random;

/**
 *
 * @author dimad
 */
public class Task4 {
    public void run(){
        System.out.println("----- Задача 4 ------");
        System.out.println("Создаем одномерный массив  из 10 ячеек типа int, \nзаполняем его случайными ЧЕТНЫМИ числами и выводим" );
         Random random = new Random();
        int myArray[] = new int[10];
        
        for(int i=0; i < myArray.length; i++){
            myArray[i]= random.nextInt((9-0+2)-0)*2;
        }
        
        for(int i=0; i < myArray.length; i++){
            System.out.printf("%3d",myArray[i]);
        }
        
        System.out.println("");
    }
}


