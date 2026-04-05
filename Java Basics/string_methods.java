public class string_methods {
    public static void main(String[] args) {
        String name = "   Honon Shofay   ";

        name = name.trim(); // removes extra white spaces
        name = name.replace('o', 'a');
        int length = name.length();
        char firstLetter = name.charAt(0);
        int index = name.indexOf('a');
        int lastIndex = name.lastIndexOf('a');
        String upperName = name.toUpperCase();
        String lowerName = name.toLowerCase();

        System.out.printf(name.isEmpty() ? "Name was not entered!\n" : "Hello, %s!\n", name);
        System.out.printf(name.contains("a") ? "Contains \"a\"\n" : "Doesnt Contain \"a\"\n");
        System.out.printf(name.equalsIgnoreCase("password") ? "Your name can't be password\n" : "");
        System.out.println("Length        : " + length);
        System.out.println("First Letter  : " + firstLetter);
        System.out.println("a is at Index : " + index);
        System.out.println("a is at Index : " + lastIndex);
        System.out.println("Lowercase name: " + lowerName);
        System.out.println("Uppercase name: " + upperName);
    }
}
