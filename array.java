//Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.

import java.util.Arrays;
import java.util.Random;

public class array {
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6,7};
        Random random=new Random();
        for(int i=0;i<array.length;i++)
        {
            int randIndexToSwap = random.nextInt(array.length);
			int temp = array[randIndexToSwap];
			array[randIndexToSwap] = array[i];
			array[i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
