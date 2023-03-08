package WordsCapitalLetter;

import java.util.Scanner;

public class Main {

// Каждое слово с большой буквы

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++ ){
            char word = str.charAt(i);
            if(i == 0 || (i > 0 && str.charAt(i-1) == ' ' ))
            { result.append( (word + "").toUpperCase() );}
            else {result.append( (word + "").toLowerCase() );}
        }
        System.out.println(result);
    }
}
