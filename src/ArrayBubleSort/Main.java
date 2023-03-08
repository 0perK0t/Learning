package ArrayBubleSort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ввеедите размер числового массива");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Ввеедите значение элементов массива");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for(int i = 0, temp = 0; i < n; i++) {
            for(int j = 0; j < n - i -1; j++){
                if(arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
            System.out.print(Arrays.toString(arr));
    }
}