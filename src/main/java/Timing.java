import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


public class Timing {
    public static void main(String[] args) {
        int arraySize = 10000;

        for(int i=1000; i <= arraySize; i += 1000){

            List<Integer> sample = sampleArray(i);

            List<Long> averageArray = new ArrayList<Long>();
            int repetitions = 100;
//            System.out.println(repetitions);
                for (int j = 0; j< repetitions; j++) {

                    //shuffle before sorting
                    BuiltinMethods.shuffle(sample);
                    long startTime = System.nanoTime();

//                        BuiltinMethods.last(sample);
//                        BuiltinMethods.reverse(sample);
//                        BuiltinMethods.shuffle(sample);
                        BuiltinMethods.sort(sample);
//                        MyShuffle.shuffleArray(sample);
//                        MyReverse.reverseArray(sample);
//                        CohortGrouping.cohortList();

                    long endTime = System.nanoTime();

                    long duration = Duration.ofNanos(endTime - startTime).toNanos();
//                    long duration = endTime - startTime;

                    averageArray.add(duration);
                }
//                System.out.println(averageArray);
                long averageResult = calculateAvg(averageArray);
            System.out.println(sample.size() + "\t" + averageResult);
        }


    }

    public static List<Integer> sampleArray (int arrayLength) {
        List<Integer> sampleArr = new ArrayList<Integer>();

        for(int i = 0; i < arrayLength; i++) {
            sampleArr.add((int)(Math.random()*20 + 1));
        }
//        System.out.println("Numbers Generated: " + Arrays.toString(sampleArr));
        return sampleArr;
    }

    public static long calculateAvg (List<Long> arr) {
//        if(arr.size() == 1){
//            return arr.get(0);
//        }

        long sum = 0;
//        System.out.println(arr);
        //removing 0th element since it takes extra time to load required libs for attempt 1
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
        }
//        System.out.println(sum);

        long avgNum = sum/(arr.size() - 1);

        return avgNum;
    }

}
