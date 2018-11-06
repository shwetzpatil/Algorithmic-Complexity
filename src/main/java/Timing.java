import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Timing {
    public static void main(String[] args) {
        int arraySize = 10000;
        List<Integer> inputArray = new ArrayList<Integer>();
        List<Long> durationArray= new ArrayList<Long>();

        for(int i=100; i < arraySize; i += 100){

            int[] sample = sampleArray(i);
            long startTime = System.nanoTime();

//            last(sample);
//            reverse(sample);
//            shuffle(sample);
//            sort(sample);
//            MyShuffle.shuffleArray(sample);

            long endTime = System.nanoTime();

            long duration = (endTime - startTime);

            inputArray.add(i);
            durationArray.add(duration);

            System.out.println( i + "\t" + duration);


        }
        System.out.println("Inputs" + inputArray );
        System.out.println("Durations" + durationArray);

    }

    public static int[] sampleArray (int arrayLength) {
        int[] sampleArr = new int[arrayLength];

        for(int i = 0; i < sampleArr.length; i++) {
            sampleArr[i] = (int)(Math.random()*20 + 1);
        }
//        System.out.println("Numbers Generated: " + Arrays.toString(sampleArr));
        return sampleArr;
    }


    public static int last (int[] arr) {
        int lastNum = arr[arr.length-1];
        return lastNum;
    }

    public static void reverse (int[] arr) {
        Collections.reverse(Arrays.asList(arr));
//        return arr;
    }

    public static int[] shuffle (int[] arr) {
        Collections.shuffle(Arrays.asList(arr));
        return arr;
    }

    public static int[] sort (int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

}
