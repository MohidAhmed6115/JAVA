public class printf {
    public static void main(String[] args) {
        String name = "Hanan Shafay";
        char firstLetter = 'H';
        int age = 19;
        double height = 178.5;
        double price1 = -99999999.32;
        double price2 = -999.36;
        double price3 = -9999.55;
        double price4 = -99999.56;
        double price5 = -9.99;
        boolean isEmployed = false;

        // specifier-characters = s, c, d, f, b respectively
        System.out.printf("Full Name     : %s\n", name);
        System.out.printf("First Letter  : %c\n", firstLetter);
        System.out.printf("Age           : %d\n", age);
        System.out.printf("Height (in cm): %.1f\n", height);
        System.out.printf(isEmployed ? "Employed!" : "Not Employed!");

        System.out.printf("\n%s is %d years old!", name, age);

        // precision = %(.precision)f
        System.out.printf("\nMy height is %.1f", height);

        // flags = +(shows signs), comma(adds commans after thousands place) , bracket(negative numbers get enclosed with brackets) , space (displays a space if possitive)
        System.out.printf("Age: %+d\n", age);
        System.out.printf("Age: % d\n", age);
        System.out.printf("Price: %(+,.3f\n", price1);

        // width
        System.out.printf("Price 1  : %12.2f\n", price1);
        System.out.printf("Price 2  : %12.2f\n", price2);
        System.out.printf("Price 3  : %12.2f\n", price3);
        System.out.printf("Price 4  : %12.2f\n", price4);
        System.out.printf("Price 5  : %12.2f\n", price5);
    }
}