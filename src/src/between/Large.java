package between;

import java.util.Scanner;

public class Large {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter elements");
        int[] array = new int[3];

        array[0] = s.nextInt();
        array[1] = s.nextInt();
        array[2] = s.nextInt();
        System.out.printf("Entered elements [%d,%d,%d] %n",array[0],array[1],array[2]);

        Ex80 ex = new Ex80();
        int result = ex.large(array);
        System.out.println("Final result :"+result);


    }
}
