package RleUnarchiver;

/*
разархивирует строки
T8У7Т7 1М4Н4О3Г2О3 1П1О6В5Т5О3Р2О2В2

ТТТТТТТТУУУУУУУТТТТТТТ ММММННННОООГГООО
ПООООООВВВВВТТТТТОООРРООВВ
 */
public class Main {
    public static void main(String[] args) {
        String str = "T8У7Т7 1М4Н4О3Г2О3 1П1О6В5Т5О3Р2О2В2";
        StringBuilder result = new StringBuilder();
        int n = str.length();
        for(int i = 0; i < n; i+=2){
            int x = Character.getNumericValue(str.charAt(i+1));

            for(int j = 0; j < x; j++) {
                result.append(str.charAt(i));
            }
        }
        System.out.println(result.toString());
    }
}
