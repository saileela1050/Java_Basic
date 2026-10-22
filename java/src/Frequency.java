// frequency of each element


import java.util.*;

public class Frequency {
    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 1, 2, 8, 2, 8, 8};
        Map<Integer, Integer> map = new HashMap<>();
        {


            for (int num : arr) {
                map.put(num, map.getOrDefault(num, 0) + 1);

            }
            System.out.println(map);
        }
    }
}
