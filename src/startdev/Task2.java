/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startdev;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class Task2 {
    public void run(){
        System.out.println("----- Задача 2 ------");
        System.out.println("Загадано число: от 0 до 10 ");
        System.out.println("Отгадай: ");
        Random random = new Random();
        int number1 = random.nextInt(10-0+1)+0;
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number1 == number){
            System.out.println("Ты выиграл");
            
        }else{
        System.out.println("Ты проиграл" + number1);
        System.out.println("----- конец задачи 2 ------");
        }
    }
}
   

    

