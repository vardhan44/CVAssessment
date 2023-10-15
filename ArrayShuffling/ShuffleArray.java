import java.util.Random;
public class ShuffleArray {
    public static int[] shuffleArray(int[] newArray){
       Random randomNum = new Random();
       int n = newArray.length;
       int[] AfterShuffled = new int[n];

       System.arraycopy(newArray,0, AfterShuffled,0,n);
       for(int i=n-1;i>=0;i--){
          int j = randomNum.nextInt(i+1);
          int temp = AfterShuffled[i];
          AfterShuffled[i] = AfterShuffled[j];
          AfterShuffled[j] = temp;
       }
       return AfterShuffled;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int[] AfterShuffled = shuffleArray(arr);

        for(int vandana:AfterShuffled){
            System.out.print(vandana + " ");
        }

    }
}
