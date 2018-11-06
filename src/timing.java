import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class timing {
    public static void main(String[] args) {

        int[] sample = sampleArray();
        long startTime = System.nanoTime();

//        last(sample);
//        reverse(sample);
//        shuffle(sample);
        sortarr(sample);
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);

        System.out.println("Duration for running code " + duration + " ns");

    }

    public static int[] sampleArray () {
        int[] sampleArr = new int[100000];

        for(int i = 0; i < sampleArr.length; i++) {
            sampleArr[i] = (int)(Math.random()*20 + 1);
        }
        System.out.println("Numbers Generated: " + Arrays.toString(sampleArr));
        return sampleArr;
    }


    public static int last (int[] arr) {
        int lastNum = arr[arr.length-1];
        return lastNum;
    }

    public static int[] reverse (int[] arr) {
        Collections.reverse(Arrays.asList(arr));
        return arr;
    }

    public static int[] shuffle (int[] arr) {
        Collections.shuffle(Arrays.asList(arr));
        return arr;
    }

    public static int[] sortarr (int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

}
