/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev;

import java.util.Random;

/**
 *
 * @author pupil
 */
public class Task3 {
    public void run(){
        System.out.println("----- Задача 3 ------");
        System.out.println("Создаем одномерный массив  из 10 ячеек типа int, \nзаполняем его случайными числами и выводим \nего значения в цикле");
        int myArray[] = new int[10]  ;
       int  max = 50;
       int min = 10;
        Random random = new Random();
        for(int i = 0; i < myArray.length; i++){
            myArray[i] = random.nextInt(max - min+1)+min;
           }
        for(int i = 0; i < myArray.length; i++){
            System.out.printf("%3d",myArray[i]);}
            System.out.println();
            
  
   
        System.out.println("Сумма всех чисел массива: ");
        System.out.println("min =  " + min);
        System.out.println("max = " + max);
        System.out.println("----- конец задачи 3 ------");
    }
}
