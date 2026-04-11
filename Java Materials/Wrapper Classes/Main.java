public class Main {
    public static void main(String[] args) {
        // // this is a deprecated method
        // Integer a = new Integer(123);
        // Double b = new Double(3.14);
        // Character c = new Character('$');

        // // modern method (AutoBoxing)
        // Integer a = 123;
        // Double b = 3.14;
        // Character c = '$';
        // Boolean d = true;
        // String e = "Auto Boxing";
        // // Unboxing
        // int x = a;
        // double y = b;
        // char z = c;

        // // static Utility Methods
        // String a1 = Integer.toString(123);
        // String a2 = Double.toString(3.14);
        // String a3 = Character.toString('$');
        // String a4 = Boolean.toString(false);

        // String test = a1 + a2 + a3 + a4;
        // System.out.println(test);

        // // parsing
        // int a = Integer.parseInt("123");
        // double b = Double.parseDouble("3.14");
        // char c = "Pizza".charAt(0);
        // boolean d = Boolean.parseBoolean("true");

        char letter = 'b';

        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));
        System.out.println(Character.isLowerCase(letter));
    }
}