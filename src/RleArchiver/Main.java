package RleArchiver;

/* Написать архиватор, который сжимает текст с большим количеством повторений букв.
Например такой текст:
ТТТТТТТТУУУУУУУТТТТТТТ ММММННННОООГГООО
ПООООООВВВВВТТТТТОООРРООВВ
должен быть сжат вот так:
T8У7Т7 1М4Н4О3Г2О3 1П1О6В5Т5О3Р2О2В2
 */

public class Main {
    public static void main(String[] args) {
        String str = "ТТТТТТТТУУУУУУУТТТТТТТ ММММННННОООГГООО ПООООООВВВВВТТТТТОООРРООВВ";
        int n = str.length();
        StringBuilder result = new StringBuilder();
        int value = 1;
        for(int i = 1 ; i < n; i++){
                if(str.charAt(i) == str.charAt(i-1)) {
                    value += 1;
                    if (i == n - 1) {result.append(str.charAt(i-1) + Integer.toString(value));}
                }
                else {
                    if (i == n - 1) {
                        String s = str.charAt(i) + "1";
                        result.append(str.charAt(i) + 1);
                    } else {
                        result.append(str.charAt(i-1) + Integer.toString(value));
                        value = 1;
                    }
                }
            }
        System.out.println(result.toString());
        }
    }
