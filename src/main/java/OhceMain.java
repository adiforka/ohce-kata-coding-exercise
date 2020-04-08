import java.util.Scanner;

public class OhceMain {
    public static void main(String[] args) {

        OhceKata o = new OhceKata();

        Scanner in = new Scanner(System.in);

        String name = o.getName(in);

        int hour = o.getHour();

        System.out.println(o.getGreeting(name, hour));

        o.processWord(in);

        System.out.println(o.getGoodBye(name));
    }
}

