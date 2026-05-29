public class PaternMatchingInteger {
    public static void main(String[] args) {

        Object obj = 100;

        if (obj instanceof Integer num) {
            System.out.println("Value: " + num);
            System.out.println("Double Value: " + (num * 2));
        } else {
            System.out.println("Object is not an Integer");
        }

    }
}