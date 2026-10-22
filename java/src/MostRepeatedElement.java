
// most repated element in the given array

public class MostRepeatedElement {
    public static void main(String[] args) {

        int[] arr = {2, 3, 1, 2, 3, 3, 3};

        int candidate = arr[0];
        int count = 0;

        for (int num : arr) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        count = 0;

        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > arr.length / 2) {
            System.out.println("Majority element: " + candidate);
        } else {
            System.out.println("No majority element");
        }
    }
}