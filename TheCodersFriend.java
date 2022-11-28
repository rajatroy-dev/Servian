import java.util.HashMap;

public class TheCodersFriend {
    public static String winner(String erica, String bob) {
        int ericaScore = 0;
        int bobScore = 0;

        HashMap<Character, Integer> table = new HashMap<>();
        table.put('E', 1);
        table.put('M', 3);
        table.put('H', 5);

        for (int i = 0; i < erica.length(); i++) {
            ericaScore = ericaScore + table.get(erica.charAt(i));
            bobScore = bobScore + table.get(bob.charAt(i));
        }

        if (ericaScore > bobScore) {
            return "Erica";
        } else if (bobScore > ericaScore) {
            return "Bob";
        }

        return "Tie";
    }

    public static void main(String[] args) {
        System.out.println(winner("EMEMHE", "EEEHHH"));
    }
}