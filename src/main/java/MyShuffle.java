import java.util.Random;

public class MyShuffle extends Timing {

    public static void shuffleArray(int[] array)
    {
//        System.out.println("Initial array"+array);
        int index, temp;
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--)
        {
            index = random.nextInt(i + 1);
            temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }

//        System.out.println("shuffled array"+array);
    }
}
