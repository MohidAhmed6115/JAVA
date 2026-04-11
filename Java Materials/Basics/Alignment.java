
public class Alignment {

    public static void main(String[] args) {
        // if you want to format any table use %-(any value) to format left and %(any value) to format right along with the data type(s, d, f, etc.). There is no center alignment
        System.out.println("--------------------------------------------");
        System.out.println("Company  |  Type   |  Battery  |   Price");
        System.out.println("--------------------------------------------");
        System.out.printf("%-11s%-12s%-11s%-11s\n", "Samsung", "Watch", 5000 + "mAh", "$" + 359);
        System.out.printf("%-11s%-12s%-11s%-11s\n", "Apple", "Phone", 4000 + "mAh", "$" + 1959);
        System.out.printf("%-11s%-12s%-11s%-11s\n", "Xiami", "Laptop", 25000 + "mAh", "$" + 4359);


        // This is using a custom center method
        System.out.println("\n--------------------------------------------");
        System.out.println("  Company  |  Type  |  Battery  |   Price");
        System.out.println("--------------------------------------------");
        System.out.printf("%s|%s|%s|%s\n",
                center("Samsung", 11),
                center("Watch", 8),
                center(5000 + "mAh", 11),
                center("$" + 2199, 11));
        System.out.printf("%s|%s|%s|%s\n",
                center("Apple", 11),
                center("Phone", 8),
                center(4000 + "mAh", 11),
                center("$" + 1959, 11));
        System.out.printf("%s|%s|%s|%s\n",
                center("Xiomi", 11),
                center("Laptop", 8),
                center(25000 + "mAh", 11),
                center("$" + 4359, 11));
    }

    // Method to center-align a string within a given width
    public static String center(String text, int width) {
        if (text == null) {
            text = "";
        }

        // If the text is longer than the width, return it as is
        if (text.length() >= width) {
            return text;
        }

        int totalPadding = width - text.length();
        int leftPadding = totalPadding / 2;
        int rightPadding = totalPadding - leftPadding;

        return " ".repeat(leftPadding) + text + " ".repeat(rightPadding);
    }
}
