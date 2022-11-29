import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SlowestKeyPress {
    public static char slowestkey(List<List<Integer>> keyTimes) {
        // 97 = a
        int theSlowest = keyTimes.get(0).get(0);
        int difference = keyTimes.get(0).get(1);

        for (int i = 1; i < keyTimes.size(); i++) {
            int time = keyTimes.get(i).get(1);
            int prevTime = keyTimes.get(i - 1).get(1);
            int ascii = keyTimes.get(i).get(0);

            if (time - prevTime > difference) {
                difference = time - prevTime;
                theSlowest = ascii;
            }
        }

        return (char)(97 + theSlowest);
    }

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(0, 2));
        list.add(Arrays.asList(1, 5));
        list.add(Arrays.asList(0, 9));
        list.add(Arrays.asList(2, 15));

        System.out.println(slowestkey(list));
    }
}
