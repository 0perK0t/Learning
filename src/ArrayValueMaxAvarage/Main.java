package ArrayValueMaxAvarage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Ввеедите размер числового массива");
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Ввеедите значение элементов массива");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        double avg = 0;
        int max = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] > max) {max = arr[i];}
            avg += (double)arr[i]/n;
        }
        System.out.println("Max = " + max);
        System.out.println("Среднее значение = " + avg);
    }
}
