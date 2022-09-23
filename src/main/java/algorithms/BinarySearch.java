package algorithms;

import java.util.Arrays;

import static jdk.nashorn.internal.objects.Global.println;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        nums[6] =2;


       // System.out.println( Arrays.binarySearch(nums,51));

        int[][] num23= {{1,2,3},{4,5}};

        System.out.println(num23.length);

        String[] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto" };
        String[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
        for (String coffee : copyTo) {
            System.out.print(coffee + " ");
        }
       // Arrays.stream(copyTo).map(coffee -> coffee + " ").forEach(System.out::print);
        String names = Arrays.toString(copyTo);

        System.out.println(names);
    }
}
