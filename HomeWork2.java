package kz.kaznu.abay;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args){
        //cycleFor();
        //cycleForEach();

        Scanner sc = new Scanner(System.in);

        ArraySum(); // первое задание
        FillTheArray(); //второе задание
        IncreaseTheArrayVol(); //третье задание
        SumOfHalf(); //четвертое задание
    }

    public static void ArraySum(){ //Задание 1
        int[] array = {1,2,5,7,8,9,11,33,25,69,78,4};
        int i;
        int sum = 0; // "сумма/счетчик"
        for (i=0; i < array.length; i++){ //обход каждой ячейки массива
            if (array[i] < 5){
                array[i] = 0; //если элемента массива меньше 5 превращаем его в нуль
            } else {
                sum = sum + array[i]; // если элемент массива не меньше 5, прибавляем его к "сумме/счетчику"
            }
        }
        System.out.println(sum);
    }

    public static void FillTheArray(){ //Задание 2
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число которой хотите заполнить массив - ");
        int a = sc.nextInt();

        System.out.println("Введите величину массива - ");
        int b = sc.nextInt();

        int[] arr = new int[b]; //создаем массив заданной величины
        for (int i = 0;  i < arr.length; i++){
            arr[i] = a; // заменяем каждый элемент массива на заданное число
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void IncreaseTheArrayVol(){ //Задание 3
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число которой хотите заполнить массив - ");
        int m = sc.nextInt();

        System.out.println("Введите величину массива - ");
        int n = sc.nextInt();

        System.out.println("Введите величину на которую хотите увеличить каждое значение массива - ");
        int l = sc.nextInt();

        int[] ar = new int[n]; //создаем массив заданной величины
        for (int i = 0;  i < ar.length; i++){
            ar[i] = m; // заменяем каждый элемент массива на заданное число
        }

        System.out.println(("Первоначальный массив - " + Arrays.toString(ar)));

        for (int i = 0;  i < ar.length; i++){
            ar[i] = m + l; // увеличиваем значение каждого числа массива на "l"
        }

        System.out.println(("Увеличенный массив - " + Arrays.toString(ar)));

    }

    public static void SumOfHalf(){ //Задание 4
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите 4 числа для четырехзначного массива (Печатайте каждое число через Enter): "); //Создаем четырехзначный массив

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt(); //Ввод данных

        int[] setarray = {a, b, c, d};
        System.out.println("Имеем следующий массив - " + Arrays.toString(setarray)); //Получение массива

        int sumFirstHalf  = 0; //сумма первой половины
        int sumSecondHalf = 0; //сумма второй половины

        for (int i=0; i < setarray.length/2; i++){
            sumFirstHalf += setarray[i];
        } //Подсчет первой суммы

        for (int i=setarray.length/2; i < setarray.length; i++){
            sumSecondHalf += setarray[i];
        } //Подсчет второй суммы

        System.out.println(sumFirstHalf);
        System.out.println(sumSecondHalf);

        if (sumFirstHalf > sumSecondHalf){
            System.out.println("Первая половина больше на : " + (sumFirstHalf - sumSecondHalf));
        } else if (sumFirstHalf < sumSecondHalf) {
            System.out.println("Вторая половина больше на : " + (sumSecondHalf - sumFirstHalf));
        } else if (sumFirstHalf == sumSecondHalf) {
            System.out.println("Обе половины равны : " + (sumSecondHalf - sumFirstHalf));
        }

    }


    // практические задания с лекции - 5
    public static void cycleFor(){
        for (int i=0; i<10; i++) {
            System.out.println("Хэллоу");
        }
    }

    public static void cycleForEach(){
        int[] arr2 = {2,4,5,6,7,1};
        System.out.println(Arrays.toString(arr2));
    }
}
