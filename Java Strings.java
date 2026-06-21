public class Strings {
    public static void main(String[] args) {

        // String
        String txt = "Hello Java";
        System.out.println("String: " + txt);

        // Concatenation
        String firstName = "Tabassum";
        String lastName = "Islam";
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);

        // Numbers and Strings
        int x = 10;
        int y = 20;
        System.out.println("x + y = " + (x + y)); // 30

        String a = "10";
        String b = "20";
        System.out.println("a + b = " + (a + b)); // 1020

        // Special Characters
        String text = "Hello \"Java\"";
        String path = "C:\\Users\\Student";
        String message = "Line1\nLine2";
        String tab = "Name\tAge";

        System.out.println(text);
        System.out.println(path);
        System.out.println(message);
        System.out.println(tab);
    }
}
