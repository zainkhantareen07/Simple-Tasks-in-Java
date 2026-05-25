public class SwitchExpressionDemo {

    public static void main(String[] args) {

        String grade = "B";

        String result = switch (grade) {

            case "A" -> {
                System.out.println("Excellent performance");
                yield "Distinction";
            }

            case "B" -> {
                System.out.println("Good performance");
                yield "First Division";
            }

            case "C" -> {
                System.out.println("Average performance");
                yield "Second Division";
            }

            case "D" -> {
                System.out.println("Poor performance");
                yield "Pass";
            }

            case "F" -> {
                System.out.println("Failed");
                yield "Fail";
            }

            default -> {
                System.out.println("Invalid grade entered");
                yield "Unknown";
            }
        };

        System.out.println("Final Result: " + result);
    }
}
