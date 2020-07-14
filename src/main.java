import java.util.*;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        //This program will partition an unsorted array by getting
        //the absolute value between two sub-arrays of 2 integers.

        //input
        int arraySize = Integer.parseInt(sc.nextLine());
        String[] array = sc.nextLine().trim().split(" ");
        int[] arrayInInt = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            arrayInInt[i] = Integer.parseInt(array[i]);
        }
        StringBuilder save = new StringBuilder();
        for(int i=0; i<arrayInInt.length-3; i++){
            int term1 = arrayInInt[i] + arrayInInt[i+1];
            int term2 = arrayInInt[i+2] + arrayInInt[i+3];

            save.append(Math.abs(term2 - term1)).append(" ");
        }

        String[] saveString = save.toString().trim().split(" ");
        int[] save2 = new  int[saveString.length];

        for(int i=0; i<saveString.length; i++){
            save2[i] = Integer.parseInt(saveString[i]);
        }

        Arrays.sort(save2);

        System.out.println(save2[0]);
    }
}
