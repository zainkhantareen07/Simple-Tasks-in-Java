public class PatternMatchingSwitch {
    public static void main(String[] args) {

        Object obj = "Java";

        switch (obj) {
            case String s ->
                System.out.println("String: " + s);

            case Integer i ->
                System.out.println("Integer: " + i);

            default ->
                System.out.println("Unknown");
        }

    }
}