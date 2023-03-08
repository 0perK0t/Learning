package PrimeNumbers;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Введите до какого числа искать простые числа.");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList <Integer> list = new ArrayList<>();
        for(int i = 2; i <= n; i++  ){
            for (int j = 2; j <= i; j++ ){
                if(j == i ){list.add(i);break;}
                if (i % j == 0){break;}
                }
            }
        System.out.println("Список простых чисел:" +  list);
    }
}
