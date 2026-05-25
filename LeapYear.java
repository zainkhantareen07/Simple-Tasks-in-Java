public class LeapYear {
    public static boolean isLeapYear(int year) {
        // A leap year is divisible by 4, but not by 100 unless it is also divisible by 400
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0; // Leap year if divisible by 400
            }
            return true; // Leap year if divisible by 4 and not by 100
        }
        return false; // Not a leap year
    }

    public static void main(String[] args) {
        int year = 2020;
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
