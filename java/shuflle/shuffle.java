import java.util.Random;

public class shuffle {
    public static void main(String[] args) 
       { 
        // create an array with values 1-7
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        // suffle the array
        shuffleArray(a);

        //print the shuffled array
        for (int num : a) {
            System.out.print(num + " ");
        }
    }

    public static void shuffleArray(int[] a) {
        int n = a.length;
        Random r = new Random();

        //iterate through the array from end to start
        for (int i = n - 1; i > 0; i--) {
            //generate a random index between 0 and i
            int j = r.nextInt(i + 1);

            // swapping
            int t =a[i];
            a[i] = a[j];
            a[j] = t;
        }
    }
}
