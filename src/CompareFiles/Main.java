package CompareFiles;

import java.io.*;

/*Написать функцию int compare(File f1, File f2). Если файлы разной длины, то функция
        возвращает разницу длин. В противном случае считывает оба файла по байту и
        возвращает разницу первых не совпавших байтов. Если файлы одинаковые функция
        должна вернуть 0. */

public class Main {
    public static void main(String[] args) throws Exception {
        String file1 = "E:\\text1.txt";
        String file2 = "E:\\text2.txt";
        File f1 = new File(file1);
        File f2 = new File(file2);
        int x = Compare(f1, f2);
        System.out.println(x);

    }

    public static int Compare(File file1, File file2) throws Exception {
        try (FileInputStream f1Out = new FileInputStream(file1);
             FileInputStream f2Out = new FileInputStream(file2)) {
            int a1 = f1Out.available(), a2 = f2Out.available();
            if (a1 > a2) {
                return a1 - a2;
            }
            else if (a1 < a2) {
                return a2 - a1;
            }
            else {
                int r1, r2 ;
                while ( (r1 = f1Out.read()) != -1 &&  (r2 =f2Out.read()) != -1 ) {

                if (r1 != r2) {
                    return Math.abs(r1 - r2);
                }
            }}
            return 0;

        }
    }
}