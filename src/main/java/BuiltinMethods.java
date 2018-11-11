import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BuiltinMethods extends Timing {

    public static int last (int[] arr) {
        int lastNum = arr[arr.length-1];
        return lastNum;
    }

    public static void reverse (List<Integer> arr) {
//        System.out.println(arr.get(0) + " " + arr.get(arr.size()- 1));
        Collections.reverse(arr);
//        System.out.println("Reverse" + arr.get(0) + " " + arr.get(arr.size()- 1));
//        return arr;
    }

    public static void shuffle (List<Integer> arr) {
        Collections.shuffle(arr);
    }

    public static void sort (List<Integer> arr) {
//        System.out.println(arr.get(0) + " " + arr.get(arr.size()- 1));
        Collections.sort(arr);
//        System.out.println("Sorted : " + arr.get(0) + " " + arr.get(arr.size()- 1));
    }
}
