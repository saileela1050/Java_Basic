// given year leap year or not


public class LeapYearOrNot {

    public static void main(String[] args) {

        int year=2026;

        if(year % 400 ==0){
            System.out.println("Leap year");
        } else if (year % 100 ==0) {
            System.out.println("Not a Leap year");

        } else if (year % 4 ==0) {
            System.out.println("Leap year");

        }else {
            System.out.println("Not a Leap year");

        }

    }
    }
