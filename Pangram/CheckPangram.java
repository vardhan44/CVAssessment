import java.util.Scanner;

public class CheckPangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pan = sc.nextLine();
        boolean ispangram = isPangram(pan);
        if(ispangram){
            System.out.println("It is a pangram");
        }else{
            System.out.println("It is not a pangram");
        }
    }

    public static boolean isPangram(String pan){
        boolean[] newboo = new boolean[26];
        int distinctCount = 0;

            for (char c : pan.toCharArray()) {
                if (Character.isLetter(c)) {
                    int index = Character.toLowerCase(c) - 'a';
                    if (!newboo[index]) {
                        newboo[index] = true;
                        distinctCount++;
                    }
                }
                if (distinctCount == 26) {
                    return true;
                }
            }

        return false;
    }
}
