// missing numbers in the given array

public class MissingNumbers {

//        public static void main(String[] args) {
//            int[] arr = {1, 3, 6, 8};
//
//            for (int i = 1; i <= 8; i++) {
//                boolean found = false;
//
//                for (int num : arr) {
//                    if (num == i) {
//                        found = true;
//                        break;
//                    }
//                }
//
//                if (!found) {
//                    System.out.print(i + " ");
//                }
//            }
//        }
//    }
//

    public static void main(String[] args) {

        int arr[] = {1, 2, 4, 5};

        for (int i = 1; i <= 6; i++) {
            boolean found = false;


            for (int num : arr) {
                if (num == i) {
                    found = true;
                    break;
                    //  System.out.println("Missing number:" +num);
                }
            }
            if (!found) {
                System.out.print(i + " ");
            }
        }
    }
}
