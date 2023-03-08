package TreeMapSort;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;
// числовой массив отсортировать по числу и узаать количество повторений
// TreeMap - ключ "число", значение " количество повтрений ".

public class Main {
    public static void main (String[] args) {
    System.out.println("Ввеедите размер числового массива");
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] arr = new int[n];
        System.out.println("Ввеедите значение элементов массива");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        TreeMap <Integer, Integer> treeMap = new TreeMap();

        for(int temp : arr){
            int value = 1;
            if(treeMap.containsKey(temp)) {
                value = treeMap.get(temp)+1;
            }
            treeMap.put(temp, value);
        }
        System.out.println(treeMap);

        int arrCount = 0;
        for (int temp : treeMap.keySet()){
            for (int i = 0; i < treeMap.get(temp); i++) {
              arr[arrCount] = temp;
              arrCount++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
