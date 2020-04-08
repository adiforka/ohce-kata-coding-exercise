import java.time.LocalTime;
import java.util.Scanner;

public class OhceKata {

    public String getGreeting(String name, int hour) {

        if (hour < 0 || hour > 23) throw new IllegalArgumentException("Hour must be between 0 and 23");
        else if (hour > 6 && hour < 12) return "¡Buenas dias, " + name + "!";
        else if (hour >= 12 && hour < 20) return "¡Buenas tardes, " + name + "!";
        else return "¡Buenas nochas, " + name + "!";
    }

    public int getHour() {
        return LocalTime.now().getHour();
    }

    public String getName(Scanner in) {
        System.out.println("Enter your name: ");
        return in.nextLine();
    }

    public String getGoodBye(String name) {
        return "Adios, " + name + "!";
    }


    public void processWord(Scanner in) {
        String wordSC;
        do {
            //get word from scanner
            System.out.println("Enter a word: ");
            wordSC = in.nextLine();

            //check for stopping word
            if (wordSC.equals("Stop!")) break;

            //check for palindrome and print to console accordingly
            if (isPalindrome(wordSC)) {
                System.out.println(wordSC);
                System.out.println("¡Bonita palabra!");
            } else System.out.println(reverseWord(wordSC));

        } while (true);
    }

    private boolean isPalindrome(String input) {
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i))
                return false;
        }
        return true;
    }

    private String reverseWord(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            sb.append(input.charAt(i));
        }
        return sb.toString();
    }
}
