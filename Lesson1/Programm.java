package Lesson1;

/*
       Напишите программу, которая использует Stream API для обработки списка чисел.
       Программа должна вывести на экран среднее значение всех четных чисел в списке.
 */

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Random;

public class Programm {
    public static void main(String[] args) {
        int[] array = createArray();
        print(array);

        OptionalDouble res = Arrays.stream(array).filter(item -> item % 2 == 0).average();

        if(res.isPresent()){
            System.out.println("Среднее арифметическое всех четных чисел в массиве: " + String.format("%.2f", res.getAsDouble()));
        }
        else {
            System.out.println("Четных чисел в массиве нет");
        }
    }

    static int[] createArray(){
        int[] array = new int[new Random().nextInt(5,25)];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(15);
        }
        return array;
    }
    static void print(int[] array){
        for (int item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }


}
