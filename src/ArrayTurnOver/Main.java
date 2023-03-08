package ArrayTurnOver;

import java.util.Scanner;

// Перевенуть массив
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
        for (int i = 0, j = n-1; i < (n/2); i++, j--) {
            int temp = 0;
            temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
        for(int temp : arr) {
            System.out.print(temp + " ");
        }
    }
}
