import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class shufflearray {
    public static void main(String[] args) {
        Integer[] num = {1, 2, 3, 4, 5, 6, 7};
        List<Integer> numList = Arrays.asList(num);
        Collections.shuffle(numList);
        Integer[] shuffledNumbers = numList.toArray(new Integer[0]);

        for (int i : shuffledNumbers) {
            System.out.print(i + " ");
        }
    }
}
