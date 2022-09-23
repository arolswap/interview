package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class WordBreak {


    public static void main(String[] args) {
        int x = 1;
        for (int i = 1; i <= 128; i+=i) {
            x += x;
        }

        System.out.println(x);
    }

}
