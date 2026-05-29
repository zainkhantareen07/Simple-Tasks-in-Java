public class PatternMatchingMultipleTypes {
    public static void main(String[] args) {

        Object obj = 3.14;

        if (obj instanceof String s) {
            System.out.println("String: " + s);
        }
        else if (obj instanceof Integer n) {
            System.out.println("Integer: " + n);
        }
        else if (obj instanceof Double d) {
            System.out.println("Double: " + d);
        }
        else {
            System.out.println("Unknown Type");
        }

    }
}