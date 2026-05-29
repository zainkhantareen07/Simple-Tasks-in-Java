public class PatternMatchingString {
    public static void main(String[] args) {

        Object obj = "Programming";

        if (obj instanceof String s) {
            System.out.println("Length = " + s.length());
        }
    }
}